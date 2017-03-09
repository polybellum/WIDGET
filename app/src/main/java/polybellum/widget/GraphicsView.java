// Copyright (C) 2017 polybellum
// Licensed under http://www.apache.org/licenses/LICENSE-2.0 <see LICENSE file>

package polybellum.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Nic Wilson on 3/8/17.
 */

/**
 * An android view for drawing custom hardware accelerated graphics
 */
public class GraphicsView extends View {

    /**************************************
     *            PRIVATE MEMEBERS
     *************************************/

    /**
     * A reference to who will render graphics on this View
     */
    private GraphicsRenderer _graphicsCallback = null;

    /**************************************
     *            CONSTRUCTORS
     *************************************/

    /**
     * Initialize the View with a Context
     *
     * @param context The Android Context to initialize the view with
     */
    public GraphicsView(Context context){
        super(context);
    }

    /**************************************
     *         PROTECTED METHODS
     *************************************/

    /**
     * Draw the Graphics onto this View
     *
     * @param c This View's Canvas
     */
    @Override
    protected void onDraw(Canvas c){
        if(_graphicsCallback ==  null) return;
        _graphicsCallback.onDraw(c);
        postInvalidate();
    }

    /**************************************
     *            PUBLIC METHODS
     *************************************/

    /**
     * Set who will render graphics on this View
     *
     * @param renderer The renderer who will render on this View
     * @return A reference to this View
     */
    public GraphicsView setRenderer(GraphicsRenderer renderer){
        this._graphicsCallback = renderer;
        postInvalidate();
        return this;
    }

}
