/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import java.util.*;
import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AParser extends PParser
{
    private TParserKeyword _parserKeyword_;
    private PRoot _root_;
    private final LinkedList<PParserContext> _parserContexts_ = new LinkedList<PParserContext>();
    private final LinkedList<PInvestigator> _investigators_ = new LinkedList<PInvestigator>();
    private final LinkedList<PSelector> _selectors_ = new LinkedList<PSelector>();

    public AParser()
    {
        // Constructor
    }

    public AParser(
        @SuppressWarnings("hiding") TParserKeyword _parserKeyword_,
        @SuppressWarnings("hiding") PRoot _root_,
        @SuppressWarnings("hiding") List<PParserContext> _parserContexts_,
        @SuppressWarnings("hiding") List<PInvestigator> _investigators_,
        @SuppressWarnings("hiding") List<PSelector> _selectors_)
    {
        // Constructor
        setParserKeyword(_parserKeyword_);

        setRoot(_root_);

        setParserContexts(_parserContexts_);

        setInvestigators(_investigators_);

        setSelectors(_selectors_);

    }

    @Override
    public Object clone()
    {
        return new AParser(
            cloneNode(this._parserKeyword_),
            cloneNode(this._root_),
            cloneList(this._parserContexts_),
            cloneList(this._investigators_),
            cloneList(this._selectors_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParser(this);
    }

    public TParserKeyword getParserKeyword()
    {
        return this._parserKeyword_;
    }

    public void setParserKeyword(TParserKeyword node)
    {
        if(this._parserKeyword_ != null)
        {
            this._parserKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parserKeyword_ = node;
    }

    public PRoot getRoot()
    {
        return this._root_;
    }

    public void setRoot(PRoot node)
    {
        if(this._root_ != null)
        {
            this._root_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._root_ = node;
    }

    public LinkedList<PParserContext> getParserContexts()
    {
        return this._parserContexts_;
    }

    public void setParserContexts(List<PParserContext> list)
    {
        this._parserContexts_.clear();
        this._parserContexts_.addAll(list);
        for(PParserContext e : list)
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
            + toString(this._parserKeyword_)
            + toString(this._root_)
            + toString(this._parserContexts_)
            + toString(this._investigators_)
            + toString(this._selectors_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parserKeyword_ == child)
        {
            this._parserKeyword_ = null;
            return;
        }

        if(this._root_ == child)
        {
            this._root_ = null;
            return;
        }

        if(this._parserContexts_.remove(child))
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
        if(this._parserKeyword_ == oldChild)
        {
            setParserKeyword((TParserKeyword) newChild);
            return;
        }

        if(this._root_ == oldChild)
        {
            setRoot((PRoot) newChild);
            return;
        }

        for(ListIterator<PParserContext> i = this._parserContexts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParserContext) newChild);
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
