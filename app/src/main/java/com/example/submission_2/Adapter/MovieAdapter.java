package com.example.submission_2.Adapter;

import android.content.Context;
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
import com.example.submission_2.MovieDetailActivity;
import com.example.submission_2.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    List<Model> models;
    Context context;

    private String URL_IMAGE = "https://image.tmdb.org/t/p/w185";
    public MovieAdapter( List<Model> models,Context context){
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_movie,viewGroup,false);
        return new MovieAdapter.MovieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder,final int i) {
        final Model model = models.get(i);
        Picasso.with(context).load(URL_IMAGE+model.getImage()).into(holder.ivImage);
        holder.tvTitle.setText(model.getTitle());
//
//        holder.llMovie.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), MovieDetailActivity.class);
//                intent.putExtra("Movie", data[i]);
//                v.getContext().startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_fotoMovie)
        ImageView ivImage;
        @BindView(R.id.tv_namaMovie)
        TextView tvTitle;
        @BindView(R.id.tv_ratingMovie)
        TextView tvRating;
        @BindView(R.id.tv_descMovie)
        TextView tvDesc;
        @BindView(R.id.ll_movie)
        LinearLayout llMovie;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
