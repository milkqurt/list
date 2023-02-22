package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24, "Junior", "Kotlin"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_add_reaction_24, "Junior", "Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sick_24, "Junior", "Scala"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24, "Junior", "Kotlin"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_add_reaction_24, "Junior", "Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sick_24, "Junior", "Scala"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24, "Junior", "Kotlin"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_add_reaction_24, "Junior", "Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sick_24, "Junior", "Scala"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_emoji_emotions_24, "Junior", "Kotlin"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_add_reaction_24, "Junior", "Java"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sick_24, "Junior", "Scala"));
        recyclerView = findViewById(R.id.recyclerView);
        // улучшает проиводительность приложение
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapted(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}