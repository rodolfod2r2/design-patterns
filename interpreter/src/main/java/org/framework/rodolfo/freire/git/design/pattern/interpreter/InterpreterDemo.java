package org.framework.rodolfo.freire.git.design.pattern.interpreter;

import org.framework.rodolfo.freire.git.design.pattern.interpreter.expression.AndExpression;
import org.framework.rodolfo.freire.git.design.pattern.interpreter.expression.Expression;
import org.framework.rodolfo.freire.git.design.pattern.interpreter.expression.OrExpression;
import org.framework.rodolfo.freire.git.design.pattern.interpreter.terminal.TerminalExpression;

public class InterpreterDemo {

    public static Expression getMaleExpression() {
        Expression captain = new TerminalExpression("Steve");
        Expression thor = new TerminalExpression("Thor");
        return new OrExpression(captain, thor);
    }

    public static Expression getMarriedWomanExpression() {
        Expression natasha = new TerminalExpression("Natasha");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(natasha, married);
    }

    public static void main(String[] args) {

        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Steve is male? " + isMale.interpret("Steve"));
        System.out.println("Natasha is a married women? " + isMarriedWoman.interpret("Married Hulk"));

    }

}
