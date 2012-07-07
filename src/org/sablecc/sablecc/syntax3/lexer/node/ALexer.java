/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import java.util.*;
import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class ALexer extends PLexer
{
    private TLexerKeyword _lexerKeyword_;
    private final LinkedList<PNamedExpression> _namedExpressions_ = new LinkedList<PNamedExpression>();
    private final LinkedList<PLexerContext> _lexerContexts_ = new LinkedList<PLexerContext>();
    private final LinkedList<PLexerPriority> _lexerPriorities_ = new LinkedList<PLexerPriority>();
    private final LinkedList<PInvestigator> _investigators_ = new LinkedList<PInvestigator>();
    private final LinkedList<PSelector> _selectors_ = new LinkedList<PSelector>();

    public ALexer()
    {
        // Constructor
    }

    public ALexer(
        @SuppressWarnings("hiding") TLexerKeyword _lexerKeyword_,
        @SuppressWarnings("hiding") List<PNamedExpression> _namedExpressions_,
        @SuppressWarnings("hiding") List<PLexerContext> _lexerContexts_,
        @SuppressWarnings("hiding") List<PLexerPriority> _lexerPriorities_,
        @SuppressWarnings("hiding") List<PInvestigator> _investigators_,
        @SuppressWarnings("hiding") List<PSelector> _selectors_)
    {
        // Constructor
        setLexerKeyword(_lexerKeyword_);

        setNamedExpressions(_namedExpressions_);

        setLexerContexts(_lexerContexts_);

        setLexerPriorities(_lexerPriorities_);

        setInvestigators(_investigators_);

        setSelectors(_selectors_);

    }

    @Override
    public Object clone()
    {
        return new ALexer(
            cloneNode(this._lexerKeyword_),
            cloneList(this._namedExpressions_),
            cloneList(this._lexerContexts_),
            cloneList(this._lexerPriorities_),
            cloneList(this._investigators_),
            cloneList(this._selectors_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALexer(this);
    }

    public TLexerKeyword getLexerKeyword()
    {
        return this._lexerKeyword_;
    }

    public void setLexerKeyword(TLexerKeyword node)
    {
        if(this._lexerKeyword_ != null)
        {
            this._lexerKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lexerKeyword_ = node;
    }

    public LinkedList<PNamedExpression> getNamedExpressions()
    {
        return this._namedExpressions_;
    }

    public void setNamedExpressions(List<PNamedExpression> list)
    {
        this._namedExpressions_.clear();
        this._namedExpressions_.addAll(list);
        for(PNamedExpression e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PLexerContext> getLexerContexts()
    {
        return this._lexerContexts_;
    }

    public void setLexerContexts(List<PLexerContext> list)
    {
        this._lexerContexts_.clear();
        this._lexerContexts_.addAll(list);
        for(PLexerContext e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PLexerPriority> getLexerPriorities()
    {
        return this._lexerPriorities_;
    }

    public void setLexerPriorities(List<PLexerPriority> list)
    {
        this._lexerPriorities_.clear();
        this._lexerPriorities_.addAll(list);
        for(PLexerPriority e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PInvestigator> getInvestigators()
    {
        return this._investigators_;
    }

    public void setInvestigators(List<PInvestigator> list)
    {
        this._investigators_.clear();
        this._investigators_.addAll(list);
        for(PInvestigator e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PSelector> getSelectors()
    {
        return this._selectors_;
    }

    public void setSelectors(List<PSelector> list)
    {
        this._selectors_.clear();
        this._selectors_.addAll(list);
        for(PSelector e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lexerKeyword_)
            + toString(this._namedExpressions_)
            + toString(this._lexerContexts_)
            + toString(this._lexerPriorities_)
            + toString(this._investigators_)
            + toString(this._selectors_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lexerKeyword_ == child)
        {
            this._lexerKeyword_ = null;
            return;
        }

        if(this._namedExpressions_.remove(child))
        {
            return;
        }

        if(this._lexerContexts_.remove(child))
        {
            return;
        }

        if(this._lexerPriorities_.remove(child))
        {
            return;
        }

        if(this._investigators_.remove(child))
        {
            return;
        }

        if(this._selectors_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lexerKeyword_ == oldChild)
        {
            setLexerKeyword((TLexerKeyword) newChild);
            return;
        }

        for(ListIterator<PNamedExpression> i = this._namedExpressions_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PNamedExpression) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PLexerContext> i = this._lexerContexts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PLexerContext) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PLexerPriority> i = this._lexerPriorities_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PLexerPriority) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PInvestigator> i = this._investigators_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PInvestigator) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PSelector> i = this._selectors_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSelector) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}