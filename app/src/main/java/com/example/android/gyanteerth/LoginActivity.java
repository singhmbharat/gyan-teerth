package com.example.android.gyanteerth;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    TextView newuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        newuser= (TextView) findViewById(R.id.newUser);

    }
    public void newUserOnClick(View view)
    {
        Intent i= new Intent(this,SignupActivity.class);
        startActivity(i);
    }
}
