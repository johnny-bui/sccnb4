/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TNotKeyword extends Token
{
    public TNotKeyword()
    {
        super.setText("Not");
    }

    public TNotKeyword(int line, int pos)
    {
        super.setText("Not");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNotKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNotKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNotKeyword text.");
    }
}
