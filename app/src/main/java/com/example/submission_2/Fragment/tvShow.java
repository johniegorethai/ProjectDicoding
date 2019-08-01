package com.example.submission_2.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.submission_2.Adapter.TvShowAdapter;
import com.example.submission_2.Model.Model;
import com.example.submission_2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class tvShow extends Fragment {


    public tvShow() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_movie, container, false);

//
//        RecyclerView recyclerView = view.findViewById(R.id.rv_tvshow);
//        TvShowAdapter tvShowAdapter = new TvShowAdapter(data);
//        recyclerView.setHasFixedSize(true);
//        LinearLayoutManager setLayout = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(setLayout);
//        recyclerView.setAdapter(tvShowAdapter);

        return  view;
    }

}
