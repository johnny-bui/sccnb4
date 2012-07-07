package de.htwsaarland.sablecctools.lexer;

import org.sablecc.sablecc.syntax3.lexer.analysis.AnalysisAdapter;
import org.sablecc.sablecc.syntax3.lexer.node.*;

/**
 * @author phucluoi aka lazyboy
 * @version 07. July. 2012
 * 
 */

public class ExtendTokenIndex extends AnalysisAdapter
{
	public static final int MAX_IDX = SCC4TokenId._ERROR_.id;
    int index = MAX_IDX;
	
	@Override
    public void caseTAlternativeKeyword(@SuppressWarnings("unused") TAlternativeKeyword node)
    {
        this.index = 0;
    }

    @Override
    public void caseTAndKeyword(@SuppressWarnings("unused") TAndKeyword node)
    {
        this.index = 1;
    }

    @Override
    public void caseTAnyKeyword(@SuppressWarnings("unused") TAnyKeyword node)
    {
        this.index = 2;
    }

    @Override
    public void caseTContextKeyword(@SuppressWarnings("unused") TContextKeyword node)
    {
        this.index = 3;
    }

    @Override
    public void caseTDanglingKeyword(@SuppressWarnings("unused") TDanglingKeyword node)
    {
        this.index = 4;
    }

    @Override
    public void caseTEmptyKeyword(@SuppressWarnings("unused") TEmptyKeyword node)
    {
        this.index = 5;
    }

    @Override
    public void caseTEndKeyword(@SuppressWarnings("unused") TEndKeyword node)
    {
        this.index = 6;
    }

    @Override
    public void caseTExceptKeyword(@SuppressWarnings("unused") TExceptKeyword node)
    {
        this.index = 7;
    }

    @Override
    public void caseTGrammarKeyword(@SuppressWarnings("unused") TGrammarKeyword node)
    {
        this.index = 8;
    }

    @Override
    public void caseTGroupKeyword(@SuppressWarnings("unused") TGroupKeyword node)
    {
        this.index = 9;
    }

    @Override
    public void caseTIgnoredKeyword(@SuppressWarnings("unused") TIgnoredKeyword node)
    {
        this.index = 10;
    }

    @Override
    public void caseTInvestigatorKeyword(@SuppressWarnings("unused") TInvestigatorKeyword node)
    {
        this.index = 11;
    }

    @Override
    public void caseTLeftKeyword(@SuppressWarnings("unused") TLeftKeyword node)
    {
        this.index = 12;
    }

    @Override
    public void caseTLexerKeyword(@SuppressWarnings("unused") TLexerKeyword node)
    {
        this.index = 13;
    }

    @Override
    public void caseTListKeyword(@SuppressWarnings("unused") TListKeyword node)
    {
        this.index = 14;
    }

    @Override
    public void caseTLongestKeyword(@SuppressWarnings("unused") TLongestKeyword node)
    {
        this.index = 15;
    }

    @Override
    public void caseTLookaheadKeyword(@SuppressWarnings("unused") TLookaheadKeyword node)
    {
        this.index = 16;
    }

    @Override
    public void caseTLookbackKeyword(@SuppressWarnings("unused") TLookbackKeyword node)
    {
        this.index = 17;
    }

    @Override
    public void caseTNotKeyword(@SuppressWarnings("unused") TNotKeyword node)
    {
        this.index = 18;
    }

    @Override
    public void caseTNewKeyword(@SuppressWarnings("unused") TNewKeyword node)
    {
        this.index = 19;
    }

    @Override
    public void caseTNullKeyword(@SuppressWarnings("unused") TNullKeyword node)
    {
        this.index = 20;
    }

    @Override
    public void caseTParserKeyword(@SuppressWarnings("unused") TParserKeyword node)
    {
        this.index = 21;
    }

    @Override
    public void caseTPrecedenceKeyword(@SuppressWarnings("unused") TPrecedenceKeyword node)
    {
        this.index = 22;
    }

    @Override
    public void caseTProductionKeyword(@SuppressWarnings("unused") TProductionKeyword node)
    {
        this.index = 23;
    }

    @Override
    public void caseTRightKeyword(@SuppressWarnings("unused") TRightKeyword node)
    {
        this.index = 24;
    }

    @Override
    public void caseTRootKeyword(@SuppressWarnings("unused") TRootKeyword node)
    {
        this.index = 25;
    }

    @Override
    public void caseTSelectorKeyword(@SuppressWarnings("unused") TSelectorKeyword node)
    {
        this.index = 26;
    }

    @Override
    public void caseTSeparatorKeyword(@SuppressWarnings("unused") TSeparatorKeyword node)
    {
        this.index = 27;
    }

    @Override
    public void caseTShortestKeyword(@SuppressWarnings("unused") TShortestKeyword node)
    {
        this.index = 28;
    }

    @Override
    public void caseTStartKeyword(@SuppressWarnings("unused") TStartKeyword node)
    {
        this.index = 29;
    }

    @Override
    public void caseTTokenKeyword(@SuppressWarnings("unused") TTokenKeyword node)
    {
        this.index = 30;
    }

    @Override
    public void caseTTransformationKeyword(@SuppressWarnings("unused") TTransformationKeyword node)
    {
        this.index = 31;
    }

    @Override
    public void caseTTreeKeyword(@SuppressWarnings("unused") TTreeKeyword node)
    {
        this.index = 32;
    }

    @Override
    public void caseTUnaryKeyword(@SuppressWarnings("unused") TUnaryKeyword node)
    {
        this.index = 33;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 34;
    }

    @Override
    public void caseTAlternativeName(@SuppressWarnings("unused") TAlternativeName node)
    {
        this.index = 35;
    }

    @Override
    public void caseTElementName(@SuppressWarnings("unused") TElementName node)
    {
        this.index = 36;
    }

    @Override
    public void caseTEpsilon(@SuppressWarnings("unused") TEpsilon node)
    {
        this.index = 37;
    }

    @Override
    public void caseTChar(@SuppressWarnings("unused") TChar node)
    {
        this.index = 38;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 39;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 40;
    }

    @Override
    public void caseTDecChar(@SuppressWarnings("unused") TDecChar node)
    {
        this.index = 41;
    }

    @Override
    public void caseTHexChar(@SuppressWarnings("unused") THexChar node)
    {
        this.index = 42;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 43;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 44;
    }

    @Override
    public void caseTAssign(@SuppressWarnings("unused") TAssign node)
    {
        this.index = 45;
    }

    @Override
    public void caseTArrow(@SuppressWarnings("unused") TArrow node)
    {
        this.index = 46;
    }

    @Override
    public void caseTBar(@SuppressWarnings("unused") TBar node)
    {
        this.index = 47;
    }

    @Override
    public void caseTCaret(@SuppressWarnings("unused") TCaret node)
    {
        this.index = 48;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 49;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 50;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 51;
    }

    @Override
    public void caseTGt(@SuppressWarnings("unused") TGt node)
    {
        this.index = 52;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 53;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 54;
    }

    @Override
    public void caseTQMark(@SuppressWarnings("unused") TQMark node)
    {
        this.index = 55;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 56;
    }

    @Override
    public void caseTStar(@SuppressWarnings("unused") TStar node)
    {
        this.index = 57;
    }

    @Override
    public void caseTThreeDots(@SuppressWarnings("unused") TThreeDots node)
    {
        this.index = 58;
    }

    @Override
    public void caseTTwoDots(@SuppressWarnings("unused") TTwoDots node)
    {
        this.index = 59;
    }

    @Override
    public void caseTBlank(@SuppressWarnings("unused") TBlank node)
    {
        this.index = 60;
    }

    @Override
    public void caseTLineComment(@SuppressWarnings("unused") TLineComment node)
    {
        this.index = 61;
    }

    @Override
    public void caseTLongComment(@SuppressWarnings("unused") TLongComment node)
    {
        this.index = 62;
    }

    @Override
    public void caseTCtrlZ(@SuppressWarnings("unused") TCtrlZ node)
    {
        this.index = 63;
    }

    @Override
    public void caseTInvalidKeyword(@SuppressWarnings("unused") TInvalidKeyword node)
    {
        this.index = 64;
    }

    @Override
    public void caseTInvalidNumber(@SuppressWarnings("unused") TInvalidNumber node)
    {
        this.index = 65;
    }

    @Override
    public void caseTInvalidNormalIdentifier(@SuppressWarnings("unused") TInvalidNormalIdentifier node)
    {
        this.index = 66;
    }

    @Override
    public void caseTInvalidRichIdentifier(@SuppressWarnings("unused") TInvalidRichIdentifier node)
    {
        this.index = 67;
    }

    @Override
    public void caseTInvalidString(@SuppressWarnings("unused") TInvalidString node)
    {
        this.index = 68;
    }

    @Override
    public void caseTInvalidHexChar(@SuppressWarnings("unused") TInvalidHexChar node)
    {
        this.index = 69;
    }

    @Override
    public void caseTInvalidDecChar(@SuppressWarnings("unused") TInvalidDecChar node)
    {
        this.index = 70;
    }

    @Override
    public void caseTInvalidAlternativeName(@SuppressWarnings("unused") TInvalidAlternativeName node)
    {
        this.index = 71;
    }

    @Override
    public void caseTInvalidElementName(@SuppressWarnings("unused") TInvalidElementName node)
    {
        this.index = 72;
    }

    @Override
    public void caseTInvalidCharacter(@SuppressWarnings("unused") TInvalidCharacter node)
    {
        this.index = 73;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 74;
    }
}
