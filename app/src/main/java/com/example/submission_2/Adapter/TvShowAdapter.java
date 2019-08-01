package com.example.submission_2.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.submission_2.Model.Model;
import com.example.submission_2.R;
import com.example.submission_2.TvShowDetailActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder> {

    List<Model> models;

    private String URL_IMAGE = "https://image.tmdb.org/t/p/w185";

    public TvShowAdapter(List<Model> models){
        this.models = models;
    }


    @NonNull
    @Override
    public TvShowViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_tvshow,viewGroup, false);


        return new TvShowAdapter.TvShowViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TvShowViewHolder holder, final int i) {
//        holder.IvImage.setImageResource(data[i].getImage());
//        holder.TvTitle.setText(data[i].getTitle());
//        holder.TvRating.setText(data[i].getRating());
//        holder.TvDesc.setText(data[i].getDesc());
//
//        holder.llTvShow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), TvShowDetailActivity.class);
//                intent.putExtra("TvShow", data[i]);
//                v.getContext().startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class TvShowViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_fotoTvShow)
        ImageView IvImage;
        @BindView(R.id.tv_namaTvShow)
        TextView TvTitle;
        @BindView(R.id.tv_ratingTvShow)
        TextView TvRating;
        @BindView(R.id.tv_descTvShow)
        TextView TvDesc;
        @BindView(R.id.ll_tvshow)
        LinearLayout llTvShow;

        public TvShowViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
