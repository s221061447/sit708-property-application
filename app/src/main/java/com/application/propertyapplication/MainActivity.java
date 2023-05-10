package com.application.propertyapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ObjectMapper objectMapper = new ObjectMapper();

    RecyclerView propertiesRV;
    PropertyAdapter propertiesAdapter;
    RecyclerView.LayoutManager propertiesLayoutManager;

    private List<Property> properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get properties
        InputStream inputStream = getResources().openRawResource(R.raw.properties);
        try {
            properties = objectMapper.readValue(inputStream, new TypeReference<List<Property>>() {});
            System.out.println(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set recycler views
        propertiesRV = findViewById(R.id.propertyRV);
        propertiesLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        propertiesAdapter = new PropertyAdapter(this, properties);
        propertiesRV.setLayoutManager(propertiesLayoutManager);
        propertiesRV.setAdapter(propertiesAdapter);
    }
}