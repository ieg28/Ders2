package com.ieg.ders2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context = this;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        btn1 = (Button) findViewById(R.id.btn_activity1);
        btn2 = (Button) findViewById(R.id.btn_activity2);
        btn3 = (Button) findViewById(R.id.btn_activity3);
        btn4 = (Button) findViewById(R.id.btn_activity4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_activity1: {
                Toast.makeText(context, "Bana tıkladın 1", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, LoginActivity1.class);
                startActivity(i);
                break;
            }
            case R.id.btn_activity2: {
                Toast.makeText(context, "Bana tıkladın 2", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, TabActivity2.class);
                startActivity(i);
                break;
            }
            case R.id.btn_activity3: {
                Toast.makeText(context, "Bana tıkladın 3", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, SettingsActivity3.class);
                startActivity(i);
                break;
            }
            case R.id.btn_activity4: {
                Toast.makeText(context, "Bana tıkladın 4", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, FullscreenActivity4.class);
                startActivity(i);
                break;
            }
        }
    }
}
