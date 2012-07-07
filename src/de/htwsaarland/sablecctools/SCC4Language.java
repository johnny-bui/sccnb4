/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.htwsaarland.sablecctools;

import de.htwsaarland.sablecctools.lexer.SCC4TokenId;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

/**
 *
 * @author phucluoi
 * @version May 17, 2012
 */
//@LanguageRegistration(mimeType = "text/x-sablecc4")
public class SCC4Language extends DefaultLanguageConfig
{

	@Override
	public Language getLexerLanguage() 
	{
		return SCC4TokenId.language;
	}

	@Override
	public String getDisplayName() {
		return "UIL";
	}

}
