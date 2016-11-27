package com.example.oroni.ladieshack;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oroni on 11/26/16.
 */

public class DangerZoneAdaptor extends ArrayAdapter<DangerZone> {

    public DangerZoneAdaptor(Context context,  ArrayList<DangerZone> dangerZones) {
        super(context,0, dangerZones);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        DangerZone currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentAttraction.getMdangerzoneName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentAttraction.getMdangerzoneAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Improve picture loading..
       /** Picasso.with(getContext())
                .load(currentAttraction.getImageResourceUrl())
                .resizeDimen(R.dimen.list_item_image_width,R.dimen.list_item_image_height)
                .centerInside()
                .into(imageView);\
        **/

        return listItemView;
    }
}
