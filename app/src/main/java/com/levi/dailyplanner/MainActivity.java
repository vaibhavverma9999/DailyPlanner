package com.levi.dailyplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.levi.dailyplanner.model.Item;
import com.levi.dailyplanner.utls.ItemUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ItemAdapter itemAdapter;

    // TODO: replace to a source data store
    List<Item> itemList;
    ItemUtils itemUtils = new ItemUtils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.itemRecyclerView);

        itemList = itemUtils.getData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        itemAdapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);

    }
}