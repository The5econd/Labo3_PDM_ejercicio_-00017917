package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tarea_labo3.utils.appConstants;

public class Main2Activity extends AppCompatActivity {

    private TextView name2, psswd2, mail2, gender2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name2 = findViewById(R.id.edit_name2);
        psswd2 = findViewById(R.id.edit_psswd2);
        mail2 = findViewById(R.id.edit_mail2);
        gender2 = findViewById(R.id.edit_gender2);

        Intent mintent = getIntent();

        if(mintent != null){
            String name = mintent.getStringExtra("NOMBRE");
            name2.setText(name);
            String key = mintent.getStringExtra("CONTRA");
            psswd2.setText(key);
            String mail = mintent.getStringExtra("CORREO");
            mail2.setText(mail);
            String gender = mintent.getStringExtra("GENERO");
            gender2.setText(gender);
        }


    }
}
