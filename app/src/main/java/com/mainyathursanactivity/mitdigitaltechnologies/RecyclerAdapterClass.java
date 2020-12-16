package com.mainyathursanactivity.mitdigitaltechnologies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapterClass extends RecyclerView.Adapter<RecyclerAdapterClass.FeaturedViewHolder> {
    ArrayList<RecycleAdaptor> studentships;

    public RecyclerAdapterClass(ArrayList<RecycleAdaptor> studentships) {
        this.studentships = studentships;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_comment_recycle, parent,false);
        FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
RecycleAdaptor recycleAdaptor = studentships.get(position);
holder.image.setImageResource(recycleAdaptor.getImage());
        holder.title.setText(recycleAdaptor.getTitle());
        holder.subtitle.setText(recycleAdaptor.getSubtitle());
        holder.desc.setText(recycleAdaptor.getDescription());

    }

    @Override
    public int getItemCount() {
        return studentships.size() ;
    }

    public  static  class FeaturedViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title,subtitle, desc;
        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.std_Image);
            title = itemView.findViewById(R.id.std_Name);
            subtitle = itemView.findViewById(R.id.std_subtitle);
            desc = itemView.findViewById(R.id.std_Comment);

        }
    }
}





