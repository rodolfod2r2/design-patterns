package org.framework.rodolfo.freire.git.design.pattern.interpreter.terminal;

import org.framework.rodolfo.freire.git.design.pattern.interpreter.expression.Expression;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }

}
