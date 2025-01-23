package com.example.alert_dialog2;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;

    Button button1, button2, button3, button4, button5;

    Random random = new Random();

    View mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        mainLayout = findViewById(R.id.mainLayout);
    }

    public void clicked1(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random massage ");
        adb.setMessage("hello ");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void clicked2(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random massage ");
        adb.setMessage("hello ");
        adb.setIcon(R.drawable.ic_launcher_background);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void clicked3(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random massage ");
        adb.setMessage("hello ");
        adb.setIcon(R.drawable.ic_launcher_background);

        adb.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }


    public void clicked4(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random massage ");
        adb.setMessage("hello ");
        adb.setIcon(R.drawable.ic_launcher_background);

        adb.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                changeBackgroundColor();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }


    public void changeBackgroundColor() {
        int color = Color.rgb(random.nextInt(256) + 1, random.nextInt(256) + 1, random.nextInt(256) + 1);
        if (mainLayout != null) {
            mainLayout.setBackgroundColor(color);
        }
    }
    public void reset()
    {
        int color = Color.rgb (255, 255, 255);
        if (mainLayout != null) {
            mainLayout.setBackgroundColor(color);
        }
    }

    public void clicked5(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random massage ");
        adb.setMessage("hello ");
        adb.setIcon(R.drawable.ic_launcher_background);

        adb.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                changeBackgroundColor();
            }
        });

        adb.setNeutralButton("RESET",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                reset();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }


}