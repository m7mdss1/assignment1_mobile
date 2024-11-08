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
    Spinner spinner5;
    ListView listView;
    ArrayList<Disease> arrayList11;
    ArrayList<String> arrayList1;
    ArrayList<String> I;
    List<Disease> list;
    Button button;
    ArrayAdapter arrayAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        Disease disease=new Disease(intent.getStringExtra("Disease Name"),intent.getStringExtra("Disease Type"));
        arrayList11=new ArrayList<>();
        arrayList11.add(disease);
        arrayList1=new ArrayList<>();
        arrayList1.add(disease.getDiseaseType());
        arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList1);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5=findViewById(R.id.spinner21);
            spinner5.setAdapter(arrayAdapter2);
        I=new ArrayList<>();
        list = new ArrayList<>();
        button=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                for (int i=0;i<list.size();i++){
                    if(list.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())){
                        I.add(list.get(i).getDiseaseName().toString());
                    }
                }
            }
        });
        arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList11);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listView=findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter2);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);



    }

    public void backbutton(View view) {
        Intent intent=new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
}