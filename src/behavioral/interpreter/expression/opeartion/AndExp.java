package behavioral.interpreter.expression.opeartion;

import behavioral.interpreter.Context;
import behavioral.interpreter.expression.BooleanExp;

/**
 * Created by Администратор on 14.11.2015.
 */
public class AndExp implements BooleanExp {
    private BooleanExp operand1, operand2;

    public AndExp(BooleanExp operand1, BooleanExp operand2) {
        super();
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public boolean evaluate(Context c) {
        return operand1.evaluate(c) && operand2.evaluate(c);
    }

    public BooleanExp replace(String str, BooleanExp exp) {
        return new AndExp(operand1.replace(str, exp), operand2.replace(str, exp));
    }

    public BooleanExp copy() {
        return new AndExp(operand1.copy(), operand2.copy());
    }
}
