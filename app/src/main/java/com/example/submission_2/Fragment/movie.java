package com.example.submission_2.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.submission_2.Adapter.MovieAdapter;
import com.example.submission_2.Model.Model;
import com.example.submission_2.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static com.android.volley.Request.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class movie extends Fragment {

    private String URL = "https://api.themoviedb.org/3/discover/movie?api_key=";
    private String APIKEY = "dba3be5b8079762af05e26a33a403ee9";
    private static MovieAdapter movieAdapter;
    private static RecyclerView recyclerView;
    private static List<Model> modelList = new ArrayList<>();
    private static Context context;
    private static RequestQueue requestQueue;

    public movie() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_movie, container, false);

        requestQueue = Volley.newRequestQueue(getContext());

        recyclerView = view.findViewById(R.id.rv_movie);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager setLayout = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(setLayout);

        getMovie(modelList);

        return  view;
    }

    public void getMovie(final List<Model>model){
        final JsonObjectRequest req = new JsonObjectRequest(Method.GET,URL+APIKEY+"&language=en-US", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                JSONArray models = null;
                try {
                    models = response.getJSONArray("results");
                    model.clear();
                    //Log.d("datanya", models+"");
                    for(int i = 0 ; i<models.length() ; i++){
                        try {
                            JSONObject obj = models.getJSONObject(i);
                            model.add(new Model(
                                    obj.getString("id"),
                                    obj.getString("poster_path"),
                                    obj.getString("title"),
                                    obj.getString("overview"),
                                    obj.getString("vote_average"),
                                    obj.getString("release_date"),
                                    obj.getString("original_language")
                            ));

                            //Toast.makeText(getContext(), obj.getString("poster_path"), Toast.LENGTH_SHORT).show();
                        }catch (JSONException e1){
                            e1.printStackTrace();
                        }
                    }
                    movieAdapter = new MovieAdapter(model,getContext());
                    recyclerView.setAdapter(movieAdapter);
                    movieAdapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(req);
    }

}
