package com.example.android.azkar;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class azkaradapter1 extends RecyclerView.Adapter<azkaradapter1.AzkarHolder> {
    Context context;
    ArrayList<Azkar> arrayList;
    MediaPlayer mediaPlayer;


    public azkaradapter1(Context context) {
        this.context = context;
        arrayList = new ArrayList<>();
        arrayList.add(new Azkar("azkar", R.raw.raw1));

        arrayList.add(new Azkar("الله", R.raw.alfel));
        arrayList.add(new Azkar("اكبر", R.raw.azkar));
        arrayList.add(new Azkar("azkar", R.raw.raw1));

    }

    public void relase() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @NonNull
    @Override
    public AzkarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.azkar_item, parent, false);

        return new AzkarHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AzkarHolder holder, int position) {
        Azkar azkar = arrayList.get(position);

        holder.textView.setText(azkar.text);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class AzkarHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView;
        Button pervious, play, pause, after;
        MediaPlayer mediaPlayer;

        public AzkarHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.azkar_item);
            play = itemView.findViewById(R.id.play);
            pause = itemView.findViewById(R.id.pause);
            after = itemView.findViewById(R.id.after);
            pervious = itemView.findViewById(R.id.pervious);


            play.setOnClickListener(this);
            pause.setOnClickListener(this);
            after.setOnClickListener(this);
            pervious.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            Azkar azkar = arrayList.get(position);
            switch (v.getId()) {

                case R.id.play:
                    mediaPlayer = MediaPlayer.create(context, azkar.sound);
                    mediaPlayer.start();
                    break;

                case R.id.pause:
                    mediaPlayer.pause();
                    break;

                case R.id.after:
                    mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() + 5000);
                    break;

                case R.id.pervious:
                    mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() - 5000);
                    break;


            }
        }
    }
}