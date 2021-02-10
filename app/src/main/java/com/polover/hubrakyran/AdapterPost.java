package com.polover.hubrakyran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.ListViewHolder> {

    Context context;
    private ArrayList<ModelPost> postList;

    public AdapterPost(Context context, ArrayList<ModelPost> movieList) {
        this.context = context;
        this.postList = movieList;
    }

    @NonNull
    @Override
    public AdapterPost.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_post, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPost.ListViewHolder holder, int position) {
        ModelPost post = postList.get(position);

        holder.userDisplayNameTv.setText(post.getDisplayName());
        holder.userPicIv.setImageResource(post.getProfilePic());
        holder.postTimeTv.setText(post.getPostTime());
        holder.postDescTv.setText(post.getDescription());
        holder.postPicIv.setImageResource(post.getPostPic());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView userDisplayNameTv, postTimeTv, postDescTv;
        ImageView userPicIv, postPicIv;

        ListViewHolder(View itemView) {
            super(itemView);

            userDisplayNameTv = itemView.findViewById(R.id.userDisplayNameTv);
            postTimeTv = itemView.findViewById(R.id.postTimeTv);
            postDescTv = itemView.findViewById(R.id.postDescTv);
            userPicIv = itemView.findViewById(R.id.userPicIv);
            postPicIv = itemView.findViewById(R.id.postPicIv);
        }
    }
}

