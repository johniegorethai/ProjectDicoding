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

public class TvShowDetailActivity extends AppCompatActivity {

    @BindView(R.id.tv_TvShowTitleDetail)
    TextView TvTitleDetail;

    @BindView(R.id.tv_TvShowRatingDetail)
    TextView TvRatingDetail;

    @BindView(R.id.tv_TvShowDateDetail)
    TextView TvDateDetail;

    @BindView(R.id.tv_TvShowGenreDetail)
    TextView TvGenreDetail;

    @BindView(R.id.tv_TvShowDirectorDetail)
    TextView TvDirectorDetail;

    @BindView(R.id.tv_TvShowCastDetail)
    TextView TvCastDetail;

    @BindView(R.id.tv_TvShowDescDetail)
    TextView TvDescriptionDetail;

    @BindView(R.id.iv_TvShowImageDetail)
    ImageView IvImageDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show_detail);
        ButterKnife.bind(this);

        Model model = getIntent().getParcelableExtra("TvShow");

        Toolbar toolbar = findViewById(R.id.toolbarTvShowDetail);
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
