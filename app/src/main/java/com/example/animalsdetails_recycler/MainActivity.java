package com.example.animalsdetails_recycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalsdetails_recycler.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    private ArrayList<Model> dataList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        buildData();
        setDataToRecycler();
    }

    private void setDataToRecycler() {
        Adapter adapter = new Adapter(dataList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mainBinding.recyclerView.setLayoutManager(layoutManager);
        mainBinding.recyclerView.setAdapter(adapter);
    }

    private void buildData() {
        for (int i = 1; i <= 20; i++) {
            Model model1 = new Model("Wolf", "Howling",R.drawable.wolf);
            dataList.add(model1);

            Model model2 = new Model("Dog", "Bark",R.drawable.dog);
            dataList.add(model2);

            Model model3 = new Model("Lion", "Roar",R.drawable.lion);
            dataList.add(model3);
        }
    }


}