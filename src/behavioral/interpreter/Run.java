package behavioral.interpreter;

import behavioral.interpreter.expression.*;
import behavioral.interpreter.expression.Constant;
import behavioral.interpreter.expression.opeartion.AndExp;
import behavioral.interpreter.expression.opeartion.NotExp;
import behavioral.interpreter.expression.opeartion.OrExp;
import behavioral.interpreter.expression.VariableExp;

/**
 * Created by Администратор on 14.11.2015.
 */
public class Run {
    public static void main(String[] args) {


        // Часть 1: (true and x) or (у and (not x)) c

        Context context = new Context();
        VariableExp x = new VariableExp("X");
        VariableExp y = new VariableExp("Y");
        BooleanExp expression = new OrExp(
                new AndExp(new Constant(true), x),
                new AndExp(y, new NotExp(x))
        );
        context.assign(x, false);
        context.assign(y, true);
        boolean result = expression.evaluate(context);
        System.out.println(result);

        // Часть 2: замена значения y

        NotExp not_y = new NotExp(y) ;
        BooleanExp replacement = expression.replace("Y", not_y);
        context.assign(y, true);
        result = replacement.evaluate(context);
        System.out.println(result);
    }

}
