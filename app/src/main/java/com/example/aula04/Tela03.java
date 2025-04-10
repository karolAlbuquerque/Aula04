package com.example.aula04;

import static com.example.aula04.R.layout.activity_main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Tela03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_03);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tela_03), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listView = (ListView) findViewById(R.id.lista_03);
        Log.d("MainActivity","onCreate: Started.");

        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Item 01");
        nomes.add("Item 02");
        nomes.add("Item 03");
        nomes.add("Item 04");
        nomes.add("item 05");
        nomes.add("Item 06");
        nomes.add("Item 07");
        nomes.add("Item 08");
        nomes.add("Item 09");
        nomes.add("item 10");
        nomes.add("Item 11");
        nomes.add("Item 12");
        nomes.add("Item 13");
        nomes.add("item 14");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,nomes);
        listView.setAdapter(adapter);

    }
    public void button4(View v) {
        Intent intent = new Intent(v.getContext(), Tela04.class);
        v.getContext().startActivity(intent);
    }
    public void button5(View v) {
        Intent intent = new Intent(v.getContext(), Tela02.class);
        v.getContext().startActivity(intent);
    }
}