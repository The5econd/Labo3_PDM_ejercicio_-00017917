package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private TextView sharedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        sharedText = findViewById(R.id.shared_txt);
        Intent intent = getIntent();
        if(intent != null){
            sharedText.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
