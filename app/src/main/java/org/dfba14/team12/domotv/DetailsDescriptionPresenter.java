package org.dfba14.team12.domotv;

import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;

public class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {
    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object item) {
        if (item!= null)
            if (item instanceof Movie) {
                Movie movie = (Movie) item;
                viewHolder.getTitle().setText(movie.getTitle());
                viewHolder.getSubtitle().setText(movie.getSubtitle());
                viewHolder.getBody().setText(movie.getDescription());
            } else if(item instanceof Light) {
                Light light = (Light) item;
                viewHolder.getTitle().setText(light.getName());
                viewHolder.getSubtitle().setText(light.getPosition());
                viewHolder.getBody().setText(light.getStatus());
            }
    }
}
