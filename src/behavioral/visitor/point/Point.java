package behavioral.visitor.point;

import behavioral.visitor.visitor.Visitor;

/**
 * Created by mikalai on 19.11.2015.
 */
public abstract class Point {
    public abstract void accept ( Visitor v );
    private double metric = -1;
    public double getMetric () {
        return metric;
    }
    public void setMetric ( double metric ) {
        this.metric = metric;
    }
}
