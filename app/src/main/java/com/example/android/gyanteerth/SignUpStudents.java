package com.example.android.gyanteerth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUpStudents extends AppCompatActivity {

    Spinner spinner,branchspinner;
    ArrayAdapter<CharSequence> collegenames,branchnames;
    DatePicker datePicker;
    Button studentcontinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_students);
        spinner=(Spinner) findViewById(R.id.collegetype);
        branchspinner=(Spinner) findViewById(R.id.branchtype);
        datePicker=(DatePicker) findViewById(R.id.datepicker);
        studentcontinue=(Button) findViewById(R.id.studentcontbtn);



        collegenames=ArrayAdapter.createFromResource(this,R.array.college_names,android.R.layout.simple_spinner_item);
        collegenames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(collegenames);

        branchnames=ArrayAdapter.createFromResource(this,R.array.college_names,android.R.layout.simple_spinner_item);
        branchnames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchspinner.setAdapter(branchnames);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"pos "+position+" selected",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        branchspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"pos "+position+" selected",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void continueOnClick(View view)
    {
        Intent i= new Intent(this,SignupTeacher.class);
        startActivity(i);

    }






}
