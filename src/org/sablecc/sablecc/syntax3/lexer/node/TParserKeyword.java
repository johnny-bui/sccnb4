/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TParserKeyword extends Token
{
    public TParserKeyword()
    {
        super.setText("Parser");
    }

    public TParserKeyword(int line, int pos)
    {
        super.setText("Parser");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParserKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParserKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParserKeyword text.");
    }
}