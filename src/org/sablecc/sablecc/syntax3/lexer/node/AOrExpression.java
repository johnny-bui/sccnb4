/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AOrExpression extends PExpression
{
    private PExpression _left_;
    private TBar _bar_;
    private PExpression _right_;

    public AOrExpression()
    {
        // Constructor
    }

    public AOrExpression(
        @SuppressWarnings("hiding") PExpression _left_,
        @SuppressWarnings("hiding") TBar _bar_,
        @SuppressWarnings("hiding") PExpression _right_)
    {
        // Constructor
        setLeft(_left_);

        setBar(_bar_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AOrExpression(
            cloneNode(this._left_),
            cloneNode(this._bar_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrExpression(this);
    }

    public PExpression getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExpression node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TBar getBar()
    {
        return this._bar_;
    }

    public void setBar(TBar node)
    {
        if(this._bar_ != null)
        {
            this._bar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bar_ = node;
    }

    public PExpression getRight()
    {
        return this._right_;
    }

    public void setRight(PExpression node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._bar_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._bar_ == child)
        {
            this._bar_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExpression) newChild);
            return;
        }

        if(this._bar_ == oldChild)
        {
            setBar((TBar) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
