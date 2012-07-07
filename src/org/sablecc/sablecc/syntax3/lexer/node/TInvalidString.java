/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TInvalidString extends Token
{
    public TInvalidString(String text)
    {
        setText(text);
    }

    public TInvalidString(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInvalidString(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInvalidString(this);
    }
}
