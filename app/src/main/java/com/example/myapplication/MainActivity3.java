package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.models.Disease;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    Spinner spinner=findViewById(R.id.spinner);
    ListView listView=findViewById(R.id.listView);
    ArrayList<Disease> arrayList;
    ArrayList<String> arrayList1;
    ArrayList<String> I;
    List<Disease> list;
    Button button=findViewById(R.id.button3);
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        Disease disease=new Disease(intent.getStringExtra("Disease Name"),intent.getStringExtra("Disease Type"));
        arrayList.add(disease);
        arrayList1.add(disease.getDiseaseType());
        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        I=new ArrayList<>();
        list = new ArrayList<>();

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                for (int i=0;i<list.size();i++){
                    if(list.get(i).getDiseaseType().equalsIgnoreCase(spinner.getSelectedItem().toString())){
                        I.add(list.get(i).getDiseaseName().toString());
                    }
                }
            }
        });
        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listView.setAdapter(arrayAdapter);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);



    }

    public void backbutton(View view) {
        Intent intent=new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
}