/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.analysis;

import java.util.*;
import org.sablecc.sablecc.syntax3.lexer.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAGrammar(AGrammar node)
    {
        defaultCase(node);
    }

    public void caseALexer(ALexer node)
    {
        defaultCase(node);
    }

    public void caseANamedExpression(ANamedExpression node)
    {
        defaultCase(node);
    }

    public void caseAOrExpression(AOrExpression node)
    {
        defaultCase(node);
    }

    public void caseAConcatenationExpression(AConcatenationExpression node)
    {
        defaultCase(node);
    }

    public void caseALookExpression(ALookExpression node)
    {
        defaultCase(node);
    }

    public void caseAShortestExpression(AShortestExpression node)
    {
        defaultCase(node);
    }

    public void caseALongestExpression(ALongestExpression node)
    {
        defaultCase(node);
    }

    public void caseASubtractionExpression(ASubtractionExpression node)
    {
        defaultCase(node);
    }

    public void caseAExceptExpression(AExceptExpression node)
    {
        defaultCase(node);
    }

    public void caseAIntersectionExpression(AIntersectionExpression node)
    {
        defaultCase(node);
    }

    public void caseAUnaryOperatorExpression(AUnaryOperatorExpression node)
    {
        defaultCase(node);
    }

    public void caseASeparatedExpression(ASeparatedExpression node)
    {
        defaultCase(node);
    }

    public void caseAUnitExpression(AUnitExpression node)
    {
        defaultCase(node);
    }

    public void caseAEpsilonExpression(AEpsilonExpression node)
    {
        defaultCase(node);
    }

    public void caseAIntervalExpression(AIntervalExpression node)
    {
        defaultCase(node);
    }

    public void caseAAnyExpression(AAnyExpression node)
    {
        defaultCase(node);
    }

    public void caseALookback(ALookback node)
    {
        defaultCase(node);
    }

    public void caseALookahead(ALookahead node)
    {
        defaultCase(node);
    }

    public void caseACharCharacter(ACharCharacter node)
    {
        defaultCase(node);
    }

    public void caseADecCharacter(ADecCharacter node)
    {
        defaultCase(node);
    }

    public void caseAHexCharacter(AHexCharacter node)
    {
        defaultCase(node);
    }

    public void caseANameUnit(ANameUnit node)
    {
        defaultCase(node);
    }

    public void caseAStringUnit(AStringUnit node)
    {
        defaultCase(node);
    }

    public void caseACharacterUnit(ACharacterUnit node)
    {
        defaultCase(node);
    }

    public void caseAStartUnit(AStartUnit node)
    {
        defaultCase(node);
    }

    public void caseAEndUnit(AEndUnit node)
    {
        defaultCase(node);
    }

    public void caseALexerPriority(ALexerPriority node)
    {
        defaultCase(node);
    }

    public void caseALexerContext(ALexerContext node)
    {
        defaultCase(node);
    }

    public void caseATokens(ATokens node)
    {
        defaultCase(node);
    }

    public void caseAIgnored(AIgnored node)
    {
        defaultCase(node);
    }

    public void caseAInvestigator(AInvestigator node)
    {
        defaultCase(node);
    }

    public void caseASelector(ASelector node)
    {
        defaultCase(node);
    }

    public void caseAParser(AParser node)
    {
        defaultCase(node);
    }

    public void caseARoot(ARoot node)
    {
        defaultCase(node);
    }

    public void caseAParserContext(AParserContext node)
    {
        defaultCase(node);
    }

    public void caseAParserProduction(AParserProduction node)
    {
        defaultCase(node);
    }

    public void caseADanglingQualifier(ADanglingQualifier node)
    {
        defaultCase(node);
    }

    public void caseATokenQualifier(ATokenQualifier node)
    {
        defaultCase(node);
    }

    public void caseAParserAlternative(AParserAlternative node)
    {
        defaultCase(node);
    }

    public void caseANormalElement(ANormalElement node)
    {
        defaultCase(node);
    }

    public void caseASeparatedElement(ASeparatedElement node)
    {
        defaultCase(node);
    }

    public void caseAAlternatedElement(AAlternatedElement node)
    {
        defaultCase(node);
    }

    public void caseAZeroOrOneUnaryOperator(AZeroOrOneUnaryOperator node)
    {
        defaultCase(node);
    }

    public void caseAManyUnaryOperator(AManyUnaryOperator node)
    {
        defaultCase(node);
    }

    public void caseAZeroOrMoreManyOperator(AZeroOrMoreManyOperator node)
    {
        defaultCase(node);
    }

    public void caseAOneOrMoreManyOperator(AOneOrMoreManyOperator node)
    {
        defaultCase(node);
    }

    public void caseANumberManyOperator(ANumberManyOperator node)
    {
        defaultCase(node);
    }

    public void caseAIntervalManyOperator(AIntervalManyOperator node)
    {
        defaultCase(node);
    }

    public void caseAAtLeastManyOperator(AAtLeastManyOperator node)
    {
        defaultCase(node);
    }

    public void caseADanglingElement(ADanglingElement node)
    {
        defaultCase(node);
    }

    public void caseALeftParserPriority(ALeftParserPriority node)
    {
        defaultCase(node);
    }

    public void caseARightParserPriority(ARightParserPriority node)
    {
        defaultCase(node);
    }

    public void caseAUnaryParserPriority(AUnaryParserPriority node)
    {
        defaultCase(node);
    }

    public void caseATransformation(ATransformation node)
    {
        defaultCase(node);
    }

    public void caseAProductionTransformations(AProductionTransformations node)
    {
        defaultCase(node);
    }

    public void caseAProductionTransformation(AProductionTransformation node)
    {
        defaultCase(node);
    }

    public void caseAAlternativeTransformations(AAlternativeTransformations node)
    {
        defaultCase(node);
    }

    public void caseAAlternativeTransformation(AAlternativeTransformation node)
    {
        defaultCase(node);
    }

    public void caseAUnnamedAlternativeReference(AUnnamedAlternativeReference node)
    {
        defaultCase(node);
    }

    public void caseANamedAlternativeReference(ANamedAlternativeReference node)
    {
        defaultCase(node);
    }

    public void caseANullTransformationElement(ANullTransformationElement node)
    {
        defaultCase(node);
    }

    public void caseAReferenceTransformationElement(AReferenceTransformationElement node)
    {
        defaultCase(node);
    }

    public void caseANewTransformationElement(ANewTransformationElement node)
    {
        defaultCase(node);
    }

    public void caseAListTransformationElement(AListTransformationElement node)
    {
        defaultCase(node);
    }

    public void caseAReferenceListElement(AReferenceListElement node)
    {
        defaultCase(node);
    }

    public void caseAListReferenceListElement(AListReferenceListElement node)
    {
        defaultCase(node);
    }

    public void caseALeftListReferenceListElement(ALeftListReferenceListElement node)
    {
        defaultCase(node);
    }

    public void caseARightListReferenceListElement(ARightListReferenceListElement node)
    {
        defaultCase(node);
    }

    public void caseANewListElement(ANewListElement node)
    {
        defaultCase(node);
    }

    public void caseANaturalElementReference(ANaturalElementReference node)
    {
        defaultCase(node);
    }

    public void caseATransformedElementReference(ATransformedElementReference node)
    {
        defaultCase(node);
    }

    public void caseATree(ATree node)
    {
        defaultCase(node);
    }

    public void caseATreeProduction(ATreeProduction node)
    {
        defaultCase(node);
    }

    public void caseATreeAlternative(ATreeAlternative node)
    {
        defaultCase(node);
    }

    public void caseTAlternativeKeyword(TAlternativeKeyword node)
    {
        defaultCase(node);
    }

    public void caseTAndKeyword(TAndKeyword node)
    {
        defaultCase(node);
    }

    public void caseTAnyKeyword(TAnyKeyword node)
    {
        defaultCase(node);
    }

    public void caseTContextKeyword(TContextKeyword node)
    {
        defaultCase(node);
    }

    public void caseTDanglingKeyword(TDanglingKeyword node)
    {
        defaultCase(node);
    }

    public void caseTEmptyKeyword(TEmptyKeyword node)
    {
        defaultCase(node);
    }

    public void caseTEndKeyword(TEndKeyword node)
    {
        defaultCase(node);
    }

    public void caseTExceptKeyword(TExceptKeyword node)
    {
        defaultCase(node);
    }

    public void caseTGrammarKeyword(TGrammarKeyword node)
    {
        defaultCase(node);
    }

    public void caseTGroupKeyword(TGroupKeyword node)
    {
        defaultCase(node);
    }

    public void caseTIgnoredKeyword(TIgnoredKeyword node)
    {
        defaultCase(node);
    }

    public void caseTInvestigatorKeyword(TInvestigatorKeyword node)
    {
        defaultCase(node);
    }

    public void caseTLeftKeyword(TLeftKeyword node)
    {
        defaultCase(node);
    }

    public void caseTLexerKeyword(TLexerKeyword node)
    {
        defaultCase(node);
    }

    public void caseTListKeyword(TListKeyword node)
    {
        defaultCase(node);
    }

    public void caseTLongestKeyword(TLongestKeyword node)
    {
        defaultCase(node);
    }

    public void caseTLookaheadKeyword(TLookaheadKeyword node)
    {
        defaultCase(node);
    }

    public void caseTLookbackKeyword(TLookbackKeyword node)
    {
        defaultCase(node);
    }

    public void caseTNotKeyword(TNotKeyword node)
    {
        defaultCase(node);
    }

    public void caseTNewKeyword(TNewKeyword node)
    {
        defaultCase(node);
    }

    public void caseTNullKeyword(TNullKeyword node)
    {
        defaultCase(node);
    }

    public void caseTParserKeyword(TParserKeyword node)
    {
        defaultCase(node);
    }

    public void caseTPrecedenceKeyword(TPrecedenceKeyword node)
    {
        defaultCase(node);
    }

    public void caseTProductionKeyword(TProductionKeyword node)
    {
        defaultCase(node);
    }

    public void caseTRightKeyword(TRightKeyword node)
    {
        defaultCase(node);
    }

    public void caseTRootKeyword(TRootKeyword node)
    {
        defaultCase(node);
    }

    public void caseTSelectorKeyword(TSelectorKeyword node)
    {
        defaultCase(node);
    }

    public void caseTSeparatorKeyword(TSeparatorKeyword node)
    {
        defaultCase(node);
    }

    public void caseTShortestKeyword(TShortestKeyword node)
    {
        defaultCase(node);
    }

    public void caseTStartKeyword(TStartKeyword node)
    {
        defaultCase(node);
    }

    public void caseTTokenKeyword(TTokenKeyword node)
    {
        defaultCase(node);
    }

    public void caseTTransformationKeyword(TTransformationKeyword node)
    {
        defaultCase(node);
    }

    public void caseTTreeKeyword(TTreeKeyword node)
    {
        defaultCase(node);
    }

    public void caseTUnaryKeyword(TUnaryKeyword node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTAlternativeName(TAlternativeName node)
    {
        defaultCase(node);
    }

    public void caseTElementName(TElementName node)
    {
        defaultCase(node);
    }

    public void caseTEpsilon(TEpsilon node)
    {
        defaultCase(node);
    }

    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTDecChar(TDecChar node)
    {
        defaultCase(node);
    }

    public void caseTHexChar(THexChar node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    public void caseTBar(TBar node)
    {
        defaultCase(node);
    }

    public void caseTCaret(TCaret node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTQMark(TQMark node)
    {
        defaultCase(node);
    }

    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    public void caseTThreeDots(TThreeDots node)
    {
        defaultCase(node);
    }

    public void caseTTwoDots(TTwoDots node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTLongComment(TLongComment node)
    {
        defaultCase(node);
    }

    public void caseTCtrlZ(TCtrlZ node)
    {
        defaultCase(node);
    }

    public void caseTInvalidKeyword(TInvalidKeyword node)
    {
        defaultCase(node);
    }

    public void caseTInvalidNumber(TInvalidNumber node)
    {
        defaultCase(node);
    }

    public void caseTInvalidNormalIdentifier(TInvalidNormalIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTInvalidRichIdentifier(TInvalidRichIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTInvalidString(TInvalidString node)
    {
        defaultCase(node);
    }

    public void caseTInvalidHexChar(TInvalidHexChar node)
    {
        defaultCase(node);
    }

    public void caseTInvalidDecChar(TInvalidDecChar node)
    {
        defaultCase(node);
    }

    public void caseTInvalidAlternativeName(TInvalidAlternativeName node)
    {
        defaultCase(node);
    }

    public void caseTInvalidElementName(TInvalidElementName node)
    {
        defaultCase(node);
    }

    public void caseTInvalidCharacter(TInvalidCharacter node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
