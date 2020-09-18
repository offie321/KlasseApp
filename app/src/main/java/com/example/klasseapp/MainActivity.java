package com.example.klasseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    String Klas;

    EditText nameInput;
    String inputName;
    Button addStud;
    ListView lv;




    //AMO1
    ArrayList<String> arrayList1;
    ArrayAdapter<String> adapter1;

    //AMO2
    ArrayList<String> arrayList2;
    ArrayAdapter<String> adapter2;

    //AMO3
    ArrayList<String> arrayList3;
    ArrayAdapter<String> adapter3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        addStud.setOnClickListener(this);

        nameInput = findViewById(R.id.personNameInput);



        addStud = findViewById(R.id.btnAdd);
        lv = findViewById(R.id.listView1);


        final Spinner spinData = findViewById(R.id.spinData);

        //AMO1
        arrayList1 = new ArrayList<String>();
        adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList1);

        lv.setAdapter(adapter1);

        //AMO2
        arrayList2 = new ArrayList<String>();
        adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList2);

        lv.setAdapter(adapter2);

        //AMO3
        arrayList3 = new ArrayList<String>();
        adapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList3);

        lv.setAdapter(adapter3);





        //Spinner OnItemSelectedListener
        // Hier kun je de klas kiezen.
        spinData.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        getKlas(spinData.getSelectedItem().toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );


    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAdd:
                inputName = nameInput.getText().toString();
                fillList();
                break;
        }
    }

    //TODO Pak de geselecteerde klas.
    //In de variabele klas wordt de waarde van de geselecteerde klas opgeslagen.
    public void getKlas(String m) {
//        Toast.makeText(this, m, Toast.LENGTH_LONG).show();
        Klas = m;
    }

    //TODO List kunnen vullen per klas. Dus bij juiste klas.
    public void fillList() {
        switch (Klas) {
            case "AMO1":
                Toast.makeText(this, "hello AMO1", Toast.LENGTH_SHORT).show();

                arrayList1.add(inputName);
                adapter1.notifyDataSetChanged();


                break;

            case "AMO2":
                arrayList2.add(inputName);
                adapter2.notifyDataSetChanged();
                break;

            case "AMO3":
                arrayList3.add(inputName);
                adapter3.notifyDataSetChanged();
                break;
        }
    }


//    //TODO Pak de geselecteerde klas.
//    //In de variabele klas wordt de waarde van de geselecteerde klas opgeslagen.
//
//    public void getKlas(String m){
////        Toast.makeText(this, m, Toast.LENGTH_LONG).show();
//        Klas = m;
//    }
//
//    //Niet zeker of dit nodig is !!!!
//    //Wat er gebeurd als er op de student toevoegen knop is gedrukt.
//    //TODO Voeg student toe aan de list bij de juiste klas.
//    public void addStudent(String name){
//        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
//    }
//
//    public void fillListResource(){
//        ArrayAdapter<CharSequence> lvAdapter = ArrayAdapter.createFromResource(this, R.array.list_data, android.R.layout.test_list_item);
//        lvAdapter.setDropDownViewResource(android.R.layout.test_list_item);
//        lvData.setAdapter(lvAdapter);
//    }
//
//
//    //TODO List kunnen vullen per klas. Dus bij juiste klas.
//    public void fillList(){
//        switch (Klas){
//            case "AMO1":
////                addStudent("Gert");
//
////                ArrayAdapter<String> lvAdapter = new ArrayAdapter<String>(
////                        this, android.R.layout.simple_list_item_1, lvDataArray
////                );
////
////                lvData.setAdapter(lvAdapter);
//
//                break;
//        }
//    }


//-------------------


    //Dit gaf de naam "Gert" weer in een toast message als er op de knop werd geklikt en de klas was ingesteld op AMO1

//    public void onClick(View view){
//        switch (view.getId()){
//            case R.id.btnAdd:
//                fillList();
//                break;
//        }
//    }
//
//
//    //TODO Pak de geselecteerde klas.
//    public void getKlas(String m){
////        Toast.makeText(this, m, Toast.LENGTH_LONG).show();
//        Klas = m;
//    }
//
//    //Wat er gebeurd als er op de student toevoegen knop is gedrukt.
//    //TODO Voeg student toe aan de list bij de juiste klas.
//    public void addStudent(String name){
//        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
//    }
//
//
//    //TODO List kunnen vullen per klas. Dus bij juiste klas.
//    public void fillList(){
//        switch (Klas){
//            case "AMO1":
//                addStudent("Gert");
//                break;
//        }
//    }


}

