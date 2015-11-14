package behavioral.interpreter.expression;

import behavioral.interpreter.Context;

/**
 * Created by Администратор on 14.11.2015.
 */
public class VariableExp implements BooleanExp {

    private String name;

    public VariableExp(String name) {
        this.name = name;
    }


    public boolean evaluate(Context c) {
        return c.lookup(name);
    }

    public BooleanExp copy() {
        return new VariableExp(name);
    }


    public BooleanExp replace(String name, BooleanExp exp) {
        if (this.name.equals(name)) {
            return exp.copy();
        } else {
            return copy();
        }
    }

    public String getName() {
        return name;
    }
}
