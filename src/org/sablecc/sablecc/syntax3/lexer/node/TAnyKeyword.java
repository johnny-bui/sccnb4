/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TAnyKeyword extends Token
{
    public TAnyKeyword()
    {
        super.setText("Any");
    }

    public TAnyKeyword(int line, int pos)
    {
        super.setText("Any");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAnyKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAnyKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAnyKeyword text.");
    }
}
