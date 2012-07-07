/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.lexer.node;

import org.sablecc.sablecc.syntax3.lexer.analysis.*;

@SuppressWarnings("nls")
public final class TTransformationKeyword extends Token
{
    public TTransformationKeyword()
    {
        super.setText("Transformation");
    }

    public TTransformationKeyword(int line, int pos)
    {
        super.setText("Transformation");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTransformationKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTransformationKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTransformationKeyword text.");
    }
}