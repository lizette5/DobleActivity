package com.example.dobleactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo del boton
    public void Siguiente(View view){
        Intent paso=new Intent(this,ActivitySaludo.class);
        startActivity(paso);

    }
}