/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TSeparatorKeyword extends Token
{
    public TSeparatorKeyword()
    {
        super.setText("Separator");
    }

    public TSeparatorKeyword(int line, int pos)
    {
        super.setText("Separator");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSeparatorKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSeparatorKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSeparatorKeyword text.");
    }
}
