package com.example.crudfirebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class TrackList extends ArrayAdapter<Track> {
    private Activity context;
    private List<Track> trackList;

    public TrackList(Activity context, List<Track> trackList) {
        super(context, R.layout.layout_track_list, trackList);
        this.context = context;
        this.trackList = trackList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.layout_track_list, null, true);

        TextView tvName = (TextView) listViewItem.findViewById(R.id.tvName);
        TextView tvRating = (TextView) listViewItem.findViewById(R.id.tvRating);

        Track track = trackList.get(position);

        tvName.setText(track.getTrackName());
        tvRating.setText(track.getTrackRating()+"");

        return listViewItem;
    }
}