package de.htwsaarland.sablecctools.lexer;

import java.util.*;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author phucluoi aka lazyboy
 * @version Jul 7, 2012
 */
class SCC4LanguageHierarchy extends LanguageHierarchy<SCC4TokenId> 
{
	
	private static final List<SCC4TokenId> TOKENS 
			= new ArrayList<SCC4TokenId>();
	private static final Map<Integer, SCC4TokenId> ID_TO_TOKEN 
			= new HashMap<Integer, SCC4TokenId>();

	static {
		final SCC4TokenId[] tokenTypes = SCC4TokenId.values();
		TOKENS.addAll(Arrays.asList(tokenTypes));
		for (SCC4TokenId token : TOKENS) {
			ID_TO_TOKEN.put(token.id, token);
		}
	}

	public static synchronized SCC4TokenId getToken(int id) {
		return ID_TO_TOKEN.get(id);// this grant the index match the token id
	}


	@Override
	protected synchronized Collection<SCC4TokenId> createTokenIds() {
		return TOKENS;
	}

	@Override
	protected synchronized Lexer<SCC4TokenId> createLexer(LexerRestartInfo<SCC4TokenId> info) {
		return new SCC4Lexer(info);
	}

	@Override
	protected String mimeType() {
		return "text/x-sablecc4";
	}
	
}
