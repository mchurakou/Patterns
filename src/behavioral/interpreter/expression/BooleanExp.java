package behavioral.interpreter.expression;

import behavioral.interpreter.Context;

/**
 * Created by Администратор on 14.11.2015.
 */
public interface BooleanExp {
    boolean evaluate(Context c);

    BooleanExp replace(String str, BooleanExp exp);

    BooleanExp copy();
}
