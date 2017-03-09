// Copyright (C) 2017 polybellum
// Licensed under http://www.apache.org/licenses/LICENSE-2.0 <see LICENSE file>

package polybellum.widget;

import android.view.View;

/**
 * Created by Nic Wilson on 3/8/17.
 */

/**
 * An interface for an object that can format a ListView row
 */
public interface EasyAdapterOrganizer {

    /**************************************
     *            PUBLIC METHODS
     *************************************/

    /**
     * Populate the ListView row with data.
     *
     * @param index The index in the ListView for this row
     * @param v The row View to style
     * @param item The data item for this row as an Object
     * @return A styled ListView row
     */
    public View getListItem(int index, View v, Object item);

}
