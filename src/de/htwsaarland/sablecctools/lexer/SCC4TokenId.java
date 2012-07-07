
package de.htwsaarland.sablecctools.lexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author phucluoi
 * @version Jul 7, 2012
 */
public enum SCC4TokenId implements TokenId
{
	ALTERNATIVE_KEYWORD (0,"AlternativeKeyword"),
	AND_KEYWORD (1,"AndKeyword"),
	ANY_KEYWORD (2,"AnyKeyword"),
	CONTEXT_KEYWORD (3,"ContextKeyword"),
	DANGLING_KEYWORD (4,"DanglingKeyword"),
	EMPTY_KEYWORD (5,"EmptyKeyword"),
	END_KEYWORD (6,"EndKeyword"),
	EXCEPT_KEYWORD (7,"ExceptKeyword"),
	GRAMMAR_KEYWORD (8,"GrammarKeyword"),
	GROUP_KEYWORD (9,"GroupKeyword"),
	IGNORED_KEYWORD (10,"IgnoredKeyword"),
	INVESTIGATOR_KEYWORD (11,"InvestigatorKeyword"),
	LEFT_KEYWORD (12,"LeftKeyword"),
	LEXER_KEYWORD (13,"LexerKeyword"),
	LIST_KEYWORD (14,"ListKeyword"),
	LONGEST_KEYWORD (15,"LongestKeyword"),
	LOOKAHEAD_KEYWORD (16,"LookaheadKeyword"),
	LOOKBACK_KEYWORD (17,"LookbackKeyword"),
	NOT_KEYWORD (18,"NotKeyword"),
	NEW_KEYWORD (19,"NewKeyword"),
	NULL_KEYWORD (20,"NullKeyword"),
	PARSER_KEYWORD (21,"ParserKeyword"),
	PRECEDENCE_KEYWORD (22,"PrecedenceKeyword"),
	PRODUCTION_KEYWORD (23,"ProductionKeyword"),
	RIGHT_KEYWORD (24,"RightKeyword"),
	ROOT_KEYWORD (25,"RootKeyword"),
	SELECTOR_KEYWORD (26,"SelectorKeyword"),
	SEPARATOR_KEYWORD (27,"SeparatorKeyword"),
	SHORTEST_KEYWORD (28,"ShortestKeyword"),
	START_KEYWORD (29,"StartKeyword"),
	TOKEN_KEYWORD (30,"TokenKeyword"),
	TRANSFORMATION_KEYWORD (31,"TransformationKeyword"),
	TREE_KEYWORD (32,"TreeKeyword"),
	UNARY_KEYWORD (33,"UnaryKeyword"),
	IDENTIFIER (34,"Identifier"),
	ALTERNATIVE_NAME (35,"AlternativeName"),
	ELEMENT_NAME (36,"ElementName"),
	EPSILON (37,"Epsilon"),
	CHAR (38,"Char"),
	STRING (39,"String"),
	NUMBER (40,"Number"),
	DEC_CHAR (41,"DecChar"),
	HEX_CHAR (42,"HexChar"),
	L_PAR (43,"LPar"),
	R_PAR (44,"RPar"),
	ASSIGN (45,"Assign"),
	ARROW (46,"Arrow"),
	BAR (47,"Bar"),
	CARET (48,"Caret"),
	COLON (49,"Colon"),
	COMMA (50,"Comma"),
	DOT (51,"Dot"),
	GT (52,"Gt"),
	MINUS (53,"Minus"),
	PLUS (54,"Plus"),
	Q_MARK (55,"QMark"),
	SEMICOLON (56,"Semicolon"),
	STAR (57,"Star"),
	THREE_DOTS (58,"ThreeDots"),
	TWO_DOTS (59,"TwoDots"),
	BLANK (60,"Blank"),
	LINE_COMMENT (61,"LineComment"),
	LONG_COMMENT (62,"LongComment"),
	CTRL_Z (63,"CtrlZ"),
	INVALID_KEYWORD (64,"InvalidKeyword"),
	INVALID_NUMBER (65,"InvalidNumber"),
	INVALID_NORMAL_IDENTIFIER (66,"InvalidNormalIdentifier"),
	INVALID_RICH_IDENTIFIER (67,"InvalidRichIdentifier"),
	INVALID_STRING (68,"InvalidString"),
	INVALID_HEX_CHAR (69,"InvalidHexChar"),
	INVALID_DEC_CHAR (70,"InvalidDecChar"),
	INVALID_ALTERNATIVE_NAME (71,"InvalidAlternativeName"),
	INVALID_ELEMENT_NAME (72,"InvalidElementName"),
	INVALID_CHARACTER (73,"InvalidCharacter"),
	EOF(74,"EOF"),
	_ERROR_(75,"_ERROR_"),
	;
	
	
	
	public int id;
    public String primaryCategory;

	public static final Language<de.htwsaarland.sablecctools.lexer.SCC4TokenId> 
			language = new SCC4LanguageHierarchy().language();

	
    public static final Language<SCC4TokenId> getLanguage() {
        return language;
    }
	
    SCC4TokenId(int id, String primaryCategory)
    {
        this.primaryCategory = primaryCategory;
		this.id = id;
    }
	

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }
}
