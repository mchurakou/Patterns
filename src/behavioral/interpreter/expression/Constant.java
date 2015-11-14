package behavioral.interpreter.expression;

import behavioral.interpreter.Context;

/**
 * Created by Администратор on 14.11.2015.
 */
public class Constant implements BooleanExp {
    private boolean constant;

    public Constant(boolean constant) {
        super();
        this.constant = constant;
    }

    public BooleanExp copy() {
        return new Constant(this.constant);
    }

    public boolean evaluate(Context c) {
        return this.constant;
    }

    public BooleanExp replace(String str, BooleanExp exp) {
        return copy();
    }
}
