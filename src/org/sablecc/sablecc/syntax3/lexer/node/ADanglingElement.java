/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class ADanglingElement extends PDanglingElement
{
    private TDanglingKeyword _danglingKeyword_;
    private TElementName _elementName_;
    private TIdentifier _identifier_;
    private TQMark _qMark_;

    public ADanglingElement()
    {
        // Constructor
    }

    public ADanglingElement(
        @SuppressWarnings("hiding") TDanglingKeyword _danglingKeyword_,
        @SuppressWarnings("hiding") TElementName _elementName_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TQMark _qMark_)
    {
        // Constructor
        setDanglingKeyword(_danglingKeyword_);

        setElementName(_elementName_);

        setIdentifier(_identifier_);

        setQMark(_qMark_);

    }

    @Override
    public Object clone()
    {
        return new ADanglingElement(
            cloneNode(this._danglingKeyword_),
            cloneNode(this._elementName_),
            cloneNode(this._identifier_),
            cloneNode(this._qMark_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADanglingElement(this);
    }

    public TDanglingKeyword getDanglingKeyword()
    {
        return this._danglingKeyword_;
    }

    public void setDanglingKeyword(TDanglingKeyword node)
    {
        if(this._danglingKeyword_ != null)
        {
            this._danglingKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._danglingKeyword_ = node;
    }

    public TElementName getElementName()
    {
        return this._elementName_;
    }

    public void setElementName(TElementName node)
    {
        if(this._elementName_ != null)
        {
            this._elementName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementName_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public TQMark getQMark()
    {
        return this._qMark_;
    }

    public void setQMark(TQMark node)
    {
        if(this._qMark_ != null)
        {
            this._qMark_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qMark_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._danglingKeyword_)
            + toString(this._elementName_)
            + toString(this._identifier_)
            + toString(this._qMark_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._danglingKeyword_ == child)
        {
            this._danglingKeyword_ = null;
            return;
        }

        if(this._elementName_ == child)
        {
            this._elementName_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._qMark_ == child)
        {
            this._qMark_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._danglingKeyword_ == oldChild)
        {
            setDanglingKeyword((TDanglingKeyword) newChild);
            return;
        }

        if(this._elementName_ == oldChild)
        {
            setElementName((TElementName) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._qMark_ == oldChild)
        {
            setQMark((TQMark) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
