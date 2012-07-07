/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TExceptKeyword extends Token
{
    public TExceptKeyword()
    {
        super.setText("Except");
    }

    public TExceptKeyword(int line, int pos)
    {
        super.setText("Except");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExceptKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExceptKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExceptKeyword text.");
    }
}