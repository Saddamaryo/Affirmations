package com.example.affirmationjava;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    Context context;
    String[] subjects;
    int[] programImages;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowName;
        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rowName = itemView.findViewById(R.id.textView1);
            rowImage = itemView.findViewById(R.id.imageView);

        }
    }

    public AdapterRecyclerView(Context context, String[] subjects, int[] programImages){
        this.context = context;
        this.subjects = subjects;
        this.programImages = programImages;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder((view));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        holder.rowName.setText(subjects[position]);
        holder.rowImage.setImageResource(programImages[position]);
    }

    @Override
    public int getItemCount() {
        return subjects.length;
    }
}
