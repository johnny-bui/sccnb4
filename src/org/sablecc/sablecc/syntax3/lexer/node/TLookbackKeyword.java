/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TLookbackKeyword extends Token
{
    public TLookbackKeyword()
    {
        super.setText("Lookback");
    }

    public TLookbackKeyword(int line, int pos)
    {
        super.setText("Lookback");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLookbackKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLookbackKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLookbackKeyword text.");
    }
}
