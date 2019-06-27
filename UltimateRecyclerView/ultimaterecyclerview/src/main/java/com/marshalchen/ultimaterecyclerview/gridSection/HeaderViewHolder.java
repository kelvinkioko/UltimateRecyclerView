package com.marshalchen.ultimaterecyclerview.gridSection;

import androidx.annotation.IdRes;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hesk on 01/06/15.
 */
public class HeaderViewHolder extends RecyclerView.ViewHolder {

    protected TextView titleText = null;

    public HeaderViewHolder(View itemView, @IdRes int titleID) {
        super(itemView);
        titleText = (TextView) itemView.findViewById(titleID);
    }

    public void render(String title) {
        titleText.setText(title);
    }

}