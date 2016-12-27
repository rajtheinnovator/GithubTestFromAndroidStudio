package com.example.android.githubtestfromandroidstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    public void newActivity(View view){
        Intent newActivityIntent = new Intent(NewActivity.this, ThirdActivity.class);
        startActivity(newActivityIntent);
    }
}
