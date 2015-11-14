package behavioral.interpreter.expression.opeartion;

import behavioral.interpreter.Context;
import behavioral.interpreter.expression.BooleanExp;

/**
 * Created by Администратор on 14.11.2015.
 */
public class NotExp implements BooleanExp {
    private BooleanExp operand;

    public NotExp(BooleanExp operand) {
        super();
        this.operand = operand;
    }

    public boolean evaluate(Context c) {
        return !operand.evaluate(c);
    }

    public BooleanExp replace(String str, BooleanExp exp) {
        return new NotExp(operand.replace(str, exp));
    }

    public BooleanExp copy() {
        return new NotExp(operand.copy());
    }
}
