/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TInvestigatorKeyword extends Token
{
    public TInvestigatorKeyword()
    {
        super.setText("Investigator");
    }

    public TInvestigatorKeyword(int line, int pos)
    {
        super.setText("Investigator");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInvestigatorKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInvestigatorKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInvestigatorKeyword text.");
    }
}