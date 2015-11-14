package behavioral.interpreter;

import behavioral.interpreter.expression.VariableExp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 14.11.2015.
 */
public class Context {
    Map<String, Boolean> vars = new HashMap<>();

    public boolean lookup(String name) {
        if (vars.get(name) == null) return false;
        return vars.get(name);

    }
    public void assign(VariableExp exp, boolean val) {
        vars.put(exp.getName(), val);
    }
}
