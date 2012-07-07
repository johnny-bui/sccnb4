/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AStartUnit extends PUnit
{
    private TStartKeyword _startKeyword_;

    public AStartUnit()
    {
        // Constructor
    }

    public AStartUnit(
        @SuppressWarnings("hiding") TStartKeyword _startKeyword_)
    {
        // Constructor
        setStartKeyword(_startKeyword_);

    }

    @Override
    public Object clone()
    {
        return new AStartUnit(
            cloneNode(this._startKeyword_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStartUnit(this);
    }

    public TStartKeyword getStartKeyword()
    {
        return this._startKeyword_;
    }

    public void setStartKeyword(TStartKeyword node)
    {
        if(this._startKeyword_ != null)
        {
            this._startKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._startKeyword_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._startKeyword_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._startKeyword_ == child)
        {
            this._startKeyword_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._startKeyword_ == oldChild)
        {
            setStartKeyword((TStartKeyword) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
