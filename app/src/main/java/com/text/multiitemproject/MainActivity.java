package com.text.multiitemproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.text.multiitemproject.adapter.MultiTypeAdapter;
import com.text.multiitemproject.bean.StudentBean;
import com.text.multiitemproject.decorate.Visitable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        List<Visitable> visitables = new ArrayList<>();
        visitables.add(new StudentBean());
        visitables.add(new StudentBean());
        visitables.add(new StudentBean());
        visitables.add(new StudentBean());
        MultiTypeAdapter multiTypeAdapter = new MultiTypeAdapter(visitables);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(multiTypeAdapter);
    }
}
