/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source: /cvs/ctree/LiteGO1/src/jar/com/polexis/lite/spatialschema/geometry/primitive/CurveBoundaryImpl.java,v $
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.geotools.geometry.jts.spatialschema.geometry.primitive;

import java.util.HashSet;
import org.opengis.geometry.primitive.CurveBoundary;
import org.opengis.geometry.primitive.Point;
import org.opengis.referencing.crs.CoordinateReferenceSystem;

/**
 * This is Chris's implementation of a CurveBoundary. I started it and realized about halfway
 * through that I won't necessarily need it. So the last few methods are still unimplemented (and
 * just delegate to the superclass, which currently does nothing).
 */
public class CurveBoundaryImpl extends PrimitiveBoundaryImpl implements CurveBoundary {

    // *************************************************************************
    //
    // *************************************************************************

    private Point startPoint;

    private Point endPoint;

    // *************************************************************************
    //
    // *************************************************************************

    public CurveBoundaryImpl(
            final CoordinateReferenceSystem crs, final Point startPoint, final Point endPoint) {

        super(crs);
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        HashSet tempSet = new HashSet();
        if (startPoint != null) {
            tempSet.add(startPoint);
        }
        if (endPoint != null) {
            tempSet.add(endPoint);
        }
    }

    // *************************************************************************
    //
    // *************************************************************************

    /**
     * @inheritDoc
     * @see org.opengis.geometry.primitive.CurveBoundary#getStartPoint()
     */
    public Point getStartPoint() {
        return startPoint;
    }

    /**
     * @inheritDoc
     * @see org.opengis.geometry.primitive.CurveBoundary#getEndPoint()
     */
    public Point getEndPoint() {
        return endPoint;
    }
}
