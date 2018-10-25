package com.example.heriprastio.latihanrecyclerview;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemView[] datagetres = new ItemView[]{
                new ItemView("Default Image", R.drawable.ic_launcher_background),
                new ItemView("Try Image", R.drawable.image),
                new ItemView("Home Asset", R.drawable.homeasset),
                new ItemView("Image Jetpack Android", R.drawable.imgandroidjetpack),
                new ItemView("Android", R.drawable.andr),
                new ItemView("Android Studio", R.drawable.asst),
                new ItemView("Avengers",R.drawable.avengers_image),
                new ItemView("Neptune", R.drawable.neptune)
        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rview);
        MyRecyclerView myRecyclerView = new MyRecyclerView(datagetres);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myRecyclerView);
    }
}
