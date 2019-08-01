package com.example.submission_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.submission_2.Model.Model;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity {

    @BindView(R.id.tv_MovieTitleDetail)
    TextView TvTitleDetail;

    @BindView(R.id.tv_MovieRatingDetail)
    TextView TvRatingDetail;

    @BindView(R.id.tv_MovieDateDetail)
    TextView TvDateDetail;

    @BindView(R.id.tv_MovieGenreDetail)
    TextView TvGenreDetail;

    @BindView(R.id.tv_MovieDirectorDetail)
    TextView TvDirectorDetail;

    @BindView(R.id.tv_MovieCastDetail)
    TextView TvCastDetail;

    @BindView(R.id.tv_MovieDescDetail)
    TextView TvDescriptionDetail;

    @BindView(R.id.iv_MovieImageDetail)
    ImageView IvImageDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);

        Model model = getIntent().getParcelableExtra("Movie");

        Toolbar toolbar = findViewById(R.id.toolbarMovieDetail);
        toolbar.setTitle(model.getTitle());
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


//        IvImageDetail.setImageResource(model.getImage());
//        TvTitleDetail.setText(model.getTitle());
//        TvRatingDetail.setText(model.getRating());
//        TvDateDetail.setText(getResources().getString(R.string.date)+ "\n" + getResources().getString(model.getDate()));
//        TvGenreDetail.setText(getResources().getString(R.string.genre)+ "\n" + getResources().getString(model.getGenre()));
//        TvDirectorDetail.setText(getResources().getString(R.string.director)+ "\n" + getResources().getString(model.getDirector()));
//        TvCastDetail.setText(getResources().getString(R.string.cast)+ "\n" + getResources().getString(model.getCast()));
//        TvDescriptionDetail.setText(getResources().getString(R.string.desc)+ "\n" + getResources().getString(model.getDesc()));
    }
}
