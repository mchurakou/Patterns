package behavioral.visitor;

import behavioral.visitor.point.Point;
import behavioral.visitor.point.Point2d;
import behavioral.visitor.visitor.Chebyshev;
import behavioral.visitor.visitor.Visitor;

/**
 * Created by mikalai on 19.11.2015.
 */
public class Run {
    public static void main(String[] args) {
        Point p = new Point2d( 1, 2 );
        Visitor v = new Chebyshev();
        p.accept( v );
        System.out.println( p.getMetric() );

    }
}
