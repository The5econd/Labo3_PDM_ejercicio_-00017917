package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button btn1;
    EditText name, psswd, email, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.enviar1);
        name = findViewById(R.id.edit_name);
        psswd = findViewById(R.id.edit_psswd);
        email = findViewById(R.id.edit_mail);
        gender = findViewById(R.id.edit_gender);

        btn1.setOnClickListener(v->{
            Intent int1 = new Intent(MainActivity.this,Main2Activity.class);
            int1.putExtra("NOMBRE", name.getText().toString());
            int1.putExtra("CONTRA", psswd.getText().toString());
            int1.putExtra("CORREO", email.getText().toString());
            int1.putExtra("GENERO", gender.getText().toString());
            startActivity(int1);
        });

    }
}
