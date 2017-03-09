// Copyright (C) 2017 polybellum
// Licensed under http://www.apache.org/licenses/LICENSE-2.0 <see LICENSE file>

package polybellum.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Nic Wilson on 3/8/17.
 */

/**
 * An easy to use ArrayAdapter for making ListViews
 *
 * @param <T> The type of object for the ArrayList
 */
public class EasyArrayAdapter<T> extends ArrayAdapter<T> {

    /**************************************
     *           PRIVATE MEMBERS
     *************************************/

    /**
     * The resource id of the layout to inflate the rows with
     */
    private int layout_id;

    /**
     * The organizer who will style the rows
     */
    private EasyAdapterOrganizer _organizer;

    /**************************************
     *            CONSTRUCTORS
     *************************************/

    /**
     * Initialize the object
     *
     * @param context The Android context for this View
     * @param items The array of items to show in the ListView
     * @param layout_id The resource id to inflate for each row
     * @param organizer The organizer who will style each row
     */
    public EasyArrayAdapter(Context context, ArrayList<T> items,
                            int layout_id, EasyAdapterOrganizer organizer){
        super(context, 0, items);
        this.layout_id = layout_id;
    }

    /**************************************
     *            PUBLIC METHODS
     *************************************/

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Get the item
        T item = getItem(position);
        //Check for an existing View for reuse
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(layout_id, parent, false);
        }

        return _organizer.getListItem(position, convertView, item);
    }

}
