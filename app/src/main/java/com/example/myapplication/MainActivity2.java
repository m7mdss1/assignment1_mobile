package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;
    Button button;
    List<String> arrayList;

    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        arrayList=new ArrayList<>();
        arrayList.add("infectious diseases");
        arrayList.add("deficiency diseases");
        arrayList.add("hereditary diseases");
        arrayList.add("physiological diseases");
        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText=findViewById(R.id.editText);
                if (spinner.isSelected()) {
                    Toast.makeText(MainActivity2.this, "Please choose the Disease type", Toast.LENGTH_SHORT).show();

                } else if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please choose the Disease Name", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("Disease Name", editText.getText().toString());
                    intent.putExtra("Disease Type", spinner.getSelectedItem().toString());
                    startActivity(intent);

                }
            }


    });

    }



}