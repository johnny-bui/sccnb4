/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class ALeftListReferenceListElement extends PListElement
{
    private PElementReference _elementReference_;
    private TLeftKeyword _leftKeyword_;

    public ALeftListReferenceListElement()
    {
        // Constructor
    }

    public ALeftListReferenceListElement(
        @SuppressWarnings("hiding") PElementReference _elementReference_,
        @SuppressWarnings("hiding") TLeftKeyword _leftKeyword_)
    {
        // Constructor
        setElementReference(_elementReference_);

        setLeftKeyword(_leftKeyword_);

    }

    @Override
    public Object clone()
    {
        return new ALeftListReferenceListElement(
            cloneNode(this._elementReference_),
            cloneNode(this._leftKeyword_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeftListReferenceListElement(this);
    }

    public PElementReference getElementReference()
    {
        return this._elementReference_;
    }

    public void setElementReference(PElementReference node)
    {
        if(this._elementReference_ != null)
        {
            this._elementReference_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementReference_ = node;
    }

    public TLeftKeyword getLeftKeyword()
    {
        return this._leftKeyword_;
    }

    public void setLeftKeyword(TLeftKeyword node)
    {
        if(this._leftKeyword_ != null)
        {
            this._leftKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftKeyword_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementReference_)
            + toString(this._leftKeyword_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementReference_ == child)
        {
            this._elementReference_ = null;
            return;
        }

        if(this._leftKeyword_ == child)
        {
            this._leftKeyword_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementReference_ == oldChild)
        {
            setElementReference((PElementReference) newChild);
            return;
        }

        if(this._leftKeyword_ == oldChild)
        {
            setLeftKeyword((TLeftKeyword) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}