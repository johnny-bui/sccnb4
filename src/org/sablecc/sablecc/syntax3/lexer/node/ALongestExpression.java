/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class ALongestExpression extends PExpression
{
    private TLongestKeyword _longestKeyword_;
    private PExpression _expression_;

    public ALongestExpression()
    {
        // Constructor
    }

    public ALongestExpression(
        @SuppressWarnings("hiding") TLongestKeyword _longestKeyword_,
        @SuppressWarnings("hiding") PExpression _expression_)
    {
        // Constructor
        setLongestKeyword(_longestKeyword_);

        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new ALongestExpression(
            cloneNode(this._longestKeyword_),
            cloneNode(this._expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALongestExpression(this);
    }

    public TLongestKeyword getLongestKeyword()
    {
        return this._longestKeyword_;
    }

    public void setLongestKeyword(TLongestKeyword node)
    {
        if(this._longestKeyword_ != null)
        {
            this._longestKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._longestKeyword_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._longestKeyword_)
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._longestKeyword_ == child)
        {
            this._longestKeyword_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._longestKeyword_ == oldChild)
        {
            setLongestKeyword((TLongestKeyword) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
