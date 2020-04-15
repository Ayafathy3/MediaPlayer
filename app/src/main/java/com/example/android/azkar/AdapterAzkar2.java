package com.example.android.azkar;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterAzkar2 extends RecyclerView.Adapter<AdapterAzkar2.AzkarHolder> {
    Context context;
    ArrayList<String> arrayList;

    public AdapterAzkar2(Context context) {
        this.context =context;
        arrayList = new ArrayList<>();
        arrayList.add("الله اكبر");



    }

    @NonNull
    @Override
    public AzkarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.azkar_item, parent, false);

        return new AzkarHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AzkarHolder holder, int position) {


        String azkar = arrayList.get(position);
        holder.textView.setText(azkar);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class AzkarHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public AzkarHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.azkar_item);

        }
    }


}
