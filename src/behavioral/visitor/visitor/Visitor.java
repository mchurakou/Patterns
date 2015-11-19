package behavioral.visitor.visitor;

import behavioral.visitor.point.Point2d;
import behavioral.visitor.point.Point3d;

/**
 * Created by mikalai on 19.11.2015.
 */
public interface Visitor {
    public void visit ( Point2d p );
    public void visit ( Point3d p );
}
