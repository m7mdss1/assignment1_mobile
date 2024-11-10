package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.models.Disease;
import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    int flag=0;
    Spinner spinner5;
    ListView listView;
    ArrayList<Disease> arrayList11;
    static ArrayList<String> I=new ArrayList<>();
    static ArrayList<String> I1=new ArrayList<>();
    static ArrayList<String> I2=new ArrayList<>();
    static ArrayList<String> I3=new ArrayList<>();
    ArrayAdapter arrayAdapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        flag=0;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        fillTheArray();


    }

    public void backbutton(View view) {
        Intent intent=new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
    public void fillTheArray(){
        Intent intent=getIntent();
        String type=intent.getStringExtra("Disease Type");
        String name =intent.getStringExtra("Disease Name");

        Disease disease=new Disease(name,type);
        arrayList11=new ArrayList<>();
        arrayList11.add(disease);
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1=intent.getStringArrayListExtra("array");
        arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList1);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5= findViewById(R.id.spinner21);
        Log.d("hi",String.valueOf(spinner5));
        spinner5.setAdapter(arrayAdapter2);
    }

    public void search(View view) {
        if(flag==0){
            if(listView!=null) {
                listView.setAdapter(null);
            }
            for (int i=0;i<arrayList11.size();i++){
                if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("infectious diseases")){


                    I.add(arrayList11.get(i).getDiseaseName());
                    arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I);
                    arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    listView=findViewById(R.id.listView);

                    listView.setAdapter(arrayAdapter2);
                }
                else if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("deficiency diseases")){


                    I1.add(arrayList11.get(i).getDiseaseName());
                    arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I1);
                    arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    listView=findViewById(R.id.listView);

                    listView.setAdapter(arrayAdapter2);
                }
                else if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("hereditary diseases")){


                    I2.add(arrayList11.get(i).getDiseaseName());
                    arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I2);
                    arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    listView=findViewById(R.id.listView);

                    listView.setAdapter(arrayAdapter2);
                }
                else if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("physiological diseases")){


                    I3.add(arrayList11.get(i).getDiseaseName());
                    arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I3);
                    arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    listView=findViewById(R.id.listView);

                    listView.setAdapter(arrayAdapter2);
                }
            }
            flag=1;
        }
        else{
            for (int i=0;i<arrayList11.size();i++){
            if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("infectious diseases")){


                arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I);
                arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                listView=findViewById(R.id.listView);

                listView.setAdapter(arrayAdapter2);
            }
            else if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("deficiency diseases")){


                arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I1);
                arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                listView=findViewById(R.id.listView);

                listView.setAdapter(arrayAdapter2);
            }
            else if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("hereditary diseases")){


                arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I2);
                arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                listView=findViewById(R.id.listView);

                listView.setAdapter(arrayAdapter2);
            }
            else if(arrayList11.get(i).getDiseaseType().equalsIgnoreCase(spinner5.getSelectedItem().toString())&&arrayList11.get(i).getDiseaseType().equalsIgnoreCase("physiological diseases")){


                arrayAdapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,I3);
                arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                listView=findViewById(R.id.listView);

                listView.setAdapter(arrayAdapter2);
            }
            else{
                listView.setAdapter(null);
            }
        }}

    }
}