package com.example.collegeapp.ebook;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.widget.TintableCheckedTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.collegeapp.R;

import java.util.List;

public class EbookAdapter extends RecyclerView.Adapter<EbookAdapter.EbookViewHolder> {

    private Context context;
    private List<EbookData> list;
    private int position;


    public EbookAdapter(android.content.Context context, List<EbookData> list) {
        this.context = context;
        this.list = list;
        this.position=getItemViewType(position);
    }

    @NonNull
    @Override
    public EbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view= LayoutInflater.from(context).inflate(R.layout.branch_item_layout,parent,false);

        return new EbookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EbookViewHolder holder, @SuppressLint("RecyclerView") final int position) {


        holder.ebookName.setText(list.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,PdfViewerActivity.class);
                intent.putExtra("PdfUrl",list.get(position).getPdfUrl());
                context.startActivity(intent);
                Toast.makeText(context,list.get(position).getName() ,Toast.LENGTH_SHORT).show();
            }
        });
        holder.ebookDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(list.get(position).getPdfUrl()));
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class EbookViewHolder extends RecyclerView.ViewHolder {
        private TextView ebookName;
        private ImageView ebookDownload;
        public EbookViewHolder(@NonNull View itemView) {
            super(itemView);

            ebookDownload= itemView.findViewById(R.id.EbookDownload);
            ebookName=itemView.findViewById(R.id.ebookName);


        }
    }
}
