/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class ASeparatedExpression extends PExpression
{
    private PExpression _base_;
    private TSeparatorKeyword _separatorKeyword_;
    private PExpression _separator_;
    private PManyOperator _manyOperator_;

    public ASeparatedExpression()
    {
        // Constructor
    }

    public ASeparatedExpression(
        @SuppressWarnings("hiding") PExpression _base_,
        @SuppressWarnings("hiding") TSeparatorKeyword _separatorKeyword_,
        @SuppressWarnings("hiding") PExpression _separator_,
        @SuppressWarnings("hiding") PManyOperator _manyOperator_)
    {
        // Constructor
        setBase(_base_);

        setSeparatorKeyword(_separatorKeyword_);

        setSeparator(_separator_);

        setManyOperator(_manyOperator_);

    }

    @Override
    public Object clone()
    {
        return new ASeparatedExpression(
            cloneNode(this._base_),
            cloneNode(this._separatorKeyword_),
            cloneNode(this._separator_),
            cloneNode(this._manyOperator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeparatedExpression(this);
    }

    public PExpression getBase()
    {
        return this._base_;
    }

    public void setBase(PExpression node)
    {
        if(this._base_ != null)
        {
            this._base_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._base_ = node;
    }

    public TSeparatorKeyword getSeparatorKeyword()
    {
        return this._separatorKeyword_;
    }

    public void setSeparatorKeyword(TSeparatorKeyword node)
    {
        if(this._separatorKeyword_ != null)
        {
            this._separatorKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separatorKeyword_ = node;
    }

    public PExpression getSeparator()
    {
        return this._separator_;
    }

    public void setSeparator(PExpression node)
    {
        if(this._separator_ != null)
        {
            this._separator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separator_ = node;
    }

    public PManyOperator getManyOperator()
    {
        return this._manyOperator_;
    }

    public void setManyOperator(PManyOperator node)
    {
        if(this._manyOperator_ != null)
        {
            this._manyOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._manyOperator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._base_)
            + toString(this._separatorKeyword_)
            + toString(this._separator_)
            + toString(this._manyOperator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._base_ == child)
        {
            this._base_ = null;
            return;
        }

        if(this._separatorKeyword_ == child)
        {
            this._separatorKeyword_ = null;
            return;
        }

        if(this._separator_ == child)
        {
            this._separator_ = null;
            return;
        }

        if(this._manyOperator_ == child)
        {
            this._manyOperator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._base_ == oldChild)
        {
            setBase((PExpression) newChild);
            return;
        }

        if(this._separatorKeyword_ == oldChild)
        {
            setSeparatorKeyword((TSeparatorKeyword) newChild);
            return;
        }

        if(this._separator_ == oldChild)
        {
            setSeparator((PExpression) newChild);
            return;
        }

        if(this._manyOperator_ == oldChild)
        {
            setManyOperator((PManyOperator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}