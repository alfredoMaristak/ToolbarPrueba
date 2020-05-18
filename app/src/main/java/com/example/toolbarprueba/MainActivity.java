package com.example.toolbarprueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tb_toolbar);
        setSupportActionBar(toolbar);//Esto se pone para enganchar un toolbar a una actividad
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.acercade:
                Toast.makeText(getApplicationContext(), "Click en Acerca de", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buscar:
                Toast.makeText(getApplicationContext(), "Click en Buscar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.salir:
                Toast.makeText(getApplicationContext(), "Click en Salir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.config:
                Toast.makeText(getApplicationContext(), "Click en Configuración", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
