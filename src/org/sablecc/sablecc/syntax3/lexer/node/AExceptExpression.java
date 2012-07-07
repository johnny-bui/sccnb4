/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AExceptExpression extends PExpression
{
    private PExpression _left_;
    private TExceptKeyword _exceptKeyword_;
    private PExpression _right_;

    public AExceptExpression()
    {
        // Constructor
    }

    public AExceptExpression(
        @SuppressWarnings("hiding") PExpression _left_,
        @SuppressWarnings("hiding") TExceptKeyword _exceptKeyword_,
        @SuppressWarnings("hiding") PExpression _right_)
    {
        // Constructor
        setLeft(_left_);

        setExceptKeyword(_exceptKeyword_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AExceptExpression(
            cloneNode(this._left_),
            cloneNode(this._exceptKeyword_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExceptExpression(this);
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

    public TExceptKeyword getExceptKeyword()
    {
        return this._exceptKeyword_;
    }

    public void setExceptKeyword(TExceptKeyword node)
    {
        if(this._exceptKeyword_ != null)
        {
            this._exceptKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exceptKeyword_ = node;
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
            + toString(this._exceptKeyword_)
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

        if(this._exceptKeyword_ == child)
        {
            this._exceptKeyword_ = null;
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

        if(this._exceptKeyword_ == oldChild)
        {
            setExceptKeyword((TExceptKeyword) newChild);
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
