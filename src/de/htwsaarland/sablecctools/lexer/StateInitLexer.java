
package de.htwsaarland.sablecctools.lexer;

import java.io.PushbackReader;
import org.sablecc.sablecc.syntax3.lexer.lexer.Lexer;

/**
 *
 * @author phucluoi
 * @version 07. July. 2012
 */
public class StateInitLexer extends Lexer
{
	public StateInitLexer(PushbackReader reader, State state)
	{
		super(reader);
		this.state = state;
	}
	public Lexer.State getState()
	{
		return this.state;
	}
	
	public String getText()  	
	{
		return this.text.toString();
	}
}
