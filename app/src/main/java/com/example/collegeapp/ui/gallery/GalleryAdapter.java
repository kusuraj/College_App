package com.example.collegeapp.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.collegeapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.galleryViewAdapter> {

    private Context context;
    private List<String> images;

    public GalleryAdapter(Context context, List<String> imagelist) {
    }

    @NonNull
    @Override
    public galleryViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.gallery_image,parent,false);

        return new galleryViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull galleryViewAdapter holder, int position) {
        Picasso.get().load(images.get(position)).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class galleryViewAdapter extends RecyclerView.ViewHolder {
ImageView imageView;

        public galleryViewAdapter(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.image);
        }
    }
}
