/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TContextKeyword extends Token
{
    public TContextKeyword()
    {
        super.setText("Context");
    }

    public TContextKeyword(int line, int pos)
    {
        super.setText("Context");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TContextKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTContextKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TContextKeyword text.");
    }
}
