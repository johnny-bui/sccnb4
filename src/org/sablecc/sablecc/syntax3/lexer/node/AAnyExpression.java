/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AAnyExpression extends PExpression
{
    private TAnyKeyword _anyKeyword_;

    public AAnyExpression()
    {
        // Constructor
    }

    public AAnyExpression(
        @SuppressWarnings("hiding") TAnyKeyword _anyKeyword_)
    {
        // Constructor
        setAnyKeyword(_anyKeyword_);

    }

    @Override
    public Object clone()
    {
        return new AAnyExpression(
            cloneNode(this._anyKeyword_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnyExpression(this);
    }

    public TAnyKeyword getAnyKeyword()
    {
        return this._anyKeyword_;
    }

    public void setAnyKeyword(TAnyKeyword node)
    {
        if(this._anyKeyword_ != null)
        {
            this._anyKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._anyKeyword_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._anyKeyword_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._anyKeyword_ == child)
        {
            this._anyKeyword_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._anyKeyword_ == oldChild)
        {
            setAnyKeyword((TAnyKeyword) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
