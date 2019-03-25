package com.example.tarea_labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tarea_labo3.utils.appConstants;

public class Main2Activity extends AppCompatActivity {

    private TextView name2, psswd2, mail2, gender2;
    private EditText invisible;
    private Button shareB;
    private String txt1, txt2, txt3, txt4, cadena, cadena2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        invisible = findViewById(R.id.todo);
        name2 = findViewById(R.id.edit_name2);
        psswd2 = findViewById(R.id.edit_psswd2);
        mail2 = findViewById(R.id.edit_mail2);
        gender2 = findViewById(R.id.edit_gender2);
        Intent mintent = getIntent();

        if(mintent != null){
            String name = mintent.getStringExtra("NOMBRE");
            name2.setText(name);
            txt1 = name2.getText().toString();
            String key = mintent.getStringExtra("CONTRA");
            psswd2.setText(key);
            txt2 = psswd2.getText().toString();
            String mail = mintent.getStringExtra("CORREO");
            mail2.setText(mail);
            txt3 = mail2.getText().toString();
            String gender = mintent.getStringExtra("GENERO");
            gender2.setText(gender);
            txt4 = gender2.getText().toString();

            cadena = txt1 + "\n" + txt2 + "\n" + txt3 + "\n"+ txt4;
            //cree una cadena de texto para meterla en un eddittext del cual agarrare los datos previamente unidos llamados "cadena"
            invisible.setText(cadena);
            cadena2 = invisible.getText().toString();
            //guardo en una cadena 2 el texto dentro del eddittext para luego hacerlo invisible sin perder la cadena de texto
            invisible.setVisibility(View.GONE);
        }
        shareB = findViewById(R.id.share_btn);
        shareB.setOnClickListener( v->{
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, cadena2);
            startActivity(i);
            Log.d("FTP", invisible.getText().toString());
        });


    }
}
