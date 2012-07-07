/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class AGrammar extends PGrammar
{
    private TGrammarKeyword _grammarKeyword_;
    private TIdentifier _name_;
    private PLexer _lexer_;
    private PParser _parser_;
    private PTransformation _transformation_;
    private PTree _tree_;

    public AGrammar()
    {
        // Constructor
    }

    public AGrammar(
        @SuppressWarnings("hiding") TGrammarKeyword _grammarKeyword_,
        @SuppressWarnings("hiding") TIdentifier _name_,
        @SuppressWarnings("hiding") PLexer _lexer_,
        @SuppressWarnings("hiding") PParser _parser_,
        @SuppressWarnings("hiding") PTransformation _transformation_,
        @SuppressWarnings("hiding") PTree _tree_)
    {
        // Constructor
        setGrammarKeyword(_grammarKeyword_);

        setName(_name_);

        setLexer(_lexer_);

        setParser(_parser_);

        setTransformation(_transformation_);

        setTree(_tree_);

    }

    @Override
    public Object clone()
    {
        return new AGrammar(
            cloneNode(this._grammarKeyword_),
            cloneNode(this._name_),
            cloneNode(this._lexer_),
            cloneNode(this._parser_),
            cloneNode(this._transformation_),
            cloneNode(this._tree_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGrammar(this);
    }

    public TGrammarKeyword getGrammarKeyword()
    {
        return this._grammarKeyword_;
    }

    public void setGrammarKeyword(TGrammarKeyword node)
    {
        if(this._grammarKeyword_ != null)
        {
            this._grammarKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._grammarKeyword_ = node;
    }

    public TIdentifier getName()
    {
        return this._name_;
    }

    public void setName(TIdentifier node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public PLexer getLexer()
    {
        return this._lexer_;
    }

    public void setLexer(PLexer node)
    {
        if(this._lexer_ != null)
        {
            this._lexer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lexer_ = node;
    }

    public PParser getParser()
    {
        return this._parser_;
    }

    public void setParser(PParser node)
    {
        if(this._parser_ != null)
        {
            this._parser_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parser_ = node;
    }

    public PTransformation getTransformation()
    {
        return this._transformation_;
    }

    public void setTransformation(PTransformation node)
    {
        if(this._transformation_ != null)
        {
            this._transformation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transformation_ = node;
    }

    public PTree getTree()
    {
        return this._tree_;
    }

    public void setTree(PTree node)
    {
        if(this._tree_ != null)
        {
            this._tree_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tree_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._grammarKeyword_)
            + toString(this._name_)
            + toString(this._lexer_)
            + toString(this._parser_)
            + toString(this._transformation_)
            + toString(this._tree_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._grammarKeyword_ == child)
        {
            this._grammarKeyword_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._lexer_ == child)
        {
            this._lexer_ = null;
            return;
        }

        if(this._parser_ == child)
        {
            this._parser_ = null;
            return;
        }

        if(this._transformation_ == child)
        {
            this._transformation_ = null;
            return;
        }

        if(this._tree_ == child)
        {
            this._tree_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._grammarKeyword_ == oldChild)
        {
            setGrammarKeyword((TGrammarKeyword) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TIdentifier) newChild);
            return;
        }

        if(this._lexer_ == oldChild)
        {
            setLexer((PLexer) newChild);
            return;
        }

        if(this._parser_ == oldChild)
        {
            setParser((PParser) newChild);
            return;
        }

        if(this._transformation_ == oldChild)
        {
            setTransformation((PTransformation) newChild);
            return;
        }

        if(this._tree_ == oldChild)
        {
            setTree((PTree) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
