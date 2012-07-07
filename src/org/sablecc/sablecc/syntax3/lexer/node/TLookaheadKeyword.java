/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TLookaheadKeyword extends Token
{
    public TLookaheadKeyword()
    {
        super.setText("Lookahead");
    }

    public TLookaheadKeyword(int line, int pos)
    {
        super.setText("Lookahead");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLookaheadKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLookaheadKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLookaheadKeyword text.");
    }
}
