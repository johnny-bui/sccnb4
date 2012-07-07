package de.htwsaarland.sablecctools.lexer;

import java.io.IOException;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.sablecc.sablecc.syntax3.lexer.lexer.Lexer.State;
import org.sablecc.sablecc.syntax3.lexer.lexer.LexerException;
import org.sablecc.sablecc.syntax3.lexer.node.Token;

/**
 *
 * @author phucluoi
 * @version Jul 7, 2012
 */
class SCC4Lexer implements Lexer<SCC4TokenId> {

	private LexerRestartInfo<SCC4TokenId> info;
	private  StateInitLexer lexer;
	private static ExtendTokenIndex converter = new ExtendTokenIndex();
	public static final int LEXER_BUFFER_SIZE = 1024;	
	
	SCC4Lexer(LexerRestartInfo<SCC4TokenId> info) 
	{
		this.info = info;
		Object startStateObj = info.state();
		State startState = State.INITIAL; /*TODO: for future use */
		
		lexer = new StateInitLexer(
					new NBPushbackReader(
				 		info.input() , 
							LEXER_BUFFER_SIZE), 
				startState);
	}

	@Override
	public org.netbeans.api.lexer.Token<SCC4TokenId> nextToken()
	{
		//org.sableccsupport.scclexer.node.Token token = null;
		Token token = null;
		int tokenIdx = ExtendTokenIndex.MAX_IDX;
		try {
			token = lexer.next();
			if (token == null)
			{
				throw new RuntimeException("lexer.next() returns null");
			}
			if (token.getText().length() ==0 )
			{
				return null;
			}
		} catch (LexerException ex) {
			return info.tokenFactory().createToken(
				SCC4LanguageHierarchy.getToken(tokenIdx), 
				lexer.getText().length()
			);
		} catch (IOException ex) {
			throw new RuntimeException("lexer.next() gets IOException");
		}
		token.apply(converter);
		tokenIdx = converter.index;
		
		
		org.netbeans.api.lexer.Token<SCC4TokenId> uilToken =
			info.tokenFactory().createToken(
					SCC4LanguageHierarchy.getToken(tokenIdx), 
						token.getText().length()
				);
		return uilToken;
	}

	@Override
	public Object state() 
	{
		/* If you have more than one state in your lexer
		 * just convert the default/begin state to null, for other 
		 * states return it.
		 * 
		if (lexer.getState() == State.NORMAL)
		{
			return null;
		}else{
			return State.PACKAGE;
		}
		 */
		return null;/* there is only one state in SableCC4 Grammar */ 
	}

	@Override
	public void release() {
	}

}
