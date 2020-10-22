package com.example.samplerecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public Adapter(Context ct, String s1[], String s2[], int img[]){

        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.Image.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {

        return data1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;
        ImageView Image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text1 = itemView.findViewById(R.id.txt1);
            text2 = itemView.findViewById(R.id.txt2);
            Image = itemView.findViewById(R.id.imgView);
        }
    }
}
