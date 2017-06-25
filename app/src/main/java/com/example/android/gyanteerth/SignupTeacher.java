package com.example.android.gyanteerth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SignupTeacher extends AppCompatActivity {

    Spinner teachercollegetype;
    ArrayAdapter<CharSequence> collegenames;
    Button teachercontiue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_teacher);
        teachercollegetype=(Spinner) findViewById(R.id.teacherscollegetype);
        teachercontiue=(Button) findViewById(R.id.teachercontbtn);

        collegenames= ArrayAdapter.createFromResource(this,R.array.college_names,android.R.layout.simple_spinner_item);
        collegenames.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        teachercollegetype.setAdapter(collegenames);

        teachercollegetype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        Intent i= new Intent(this,HomeActivity.class);
        startActivity(i);
    }
}
