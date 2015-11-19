package behavioral.visitor.visitor;

import behavioral.visitor.point.Point2d;
import behavioral.visitor.point.Point3d;

/**
 * Created by mikalai on 19.11.2015.
 */
public class Euclid implements Visitor {
    public void visit ( Point2d p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() ) );
    }
    public void visit ( Point3d p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() + p.getZ()*p.getZ() ) );
    }
}
