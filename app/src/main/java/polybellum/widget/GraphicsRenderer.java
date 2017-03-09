// Copyright (C) 2017 polybellum
// Licensed under http://www.apache.org/licenses/LICENSE-2.0 <see LICENSE file>

package polybellum.widget;

import android.graphics.Canvas;

/**
 * Created by Nic Wilson on 3/8/17.
 */

/**
 * An interface that this object can render graphics onto a Canvas
 */
public interface GraphicsRenderer {

    /**************************************
     *            PUBLIC METHODS
     *************************************/

    /**
     * Draw graphics onto a Canvas
     *
     * @param c The Canvas to draw on
     */
    public void onDraw(Canvas c);

}
