/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AUnaryOperatorExpression extends PExpression
{
    private PExpression _expression_;
    private PUnaryOperator _unaryOperator_;

    public AUnaryOperatorExpression()
    {
        // Constructor
    }

    public AUnaryOperatorExpression(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") PUnaryOperator _unaryOperator_)
    {
        // Constructor
        setExpression(_expression_);

        setUnaryOperator(_unaryOperator_);

    }

    @Override
    public Object clone()
    {
        return new AUnaryOperatorExpression(
            cloneNode(this._expression_),
            cloneNode(this._unaryOperator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryOperatorExpression(this);
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

    public PUnaryOperator getUnaryOperator()
    {
        return this._unaryOperator_;
    }

    public void setUnaryOperator(PUnaryOperator node)
    {
        if(this._unaryOperator_ != null)
        {
            this._unaryOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unaryOperator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._unaryOperator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._unaryOperator_ == child)
        {
            this._unaryOperator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._unaryOperator_ == oldChild)
        {
            setUnaryOperator((PUnaryOperator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
