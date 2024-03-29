/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TLineComment extends Token
{
    public TLineComment(String text)
    {
        setText(text);
    }

    public TLineComment(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLineComment(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLineComment(this);
    }
}
