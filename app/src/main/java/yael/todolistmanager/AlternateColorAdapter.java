package yael.todolistmanager;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Yael on 23/03/2017.
 */

public class AlternateColorAdapter<String> extends ArrayAdapter {

    public AlternateColorAdapter(Context context, int layout, ArrayList<String> items) {
        super(context, layout, items);
    }

    /**
     * Display rows in alternating colors
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        if (position % 2 == 1) {
            view.setBackgroundColor(Color.RED);
        } else {
            view.setBackgroundColor(Color.BLUE);
        }
        return view;
    }
}
