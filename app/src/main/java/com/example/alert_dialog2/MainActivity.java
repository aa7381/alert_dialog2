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

/**
 *  MainActivity show the alert dialog .
 */
public class MainActivity extends AppCompatActivity {

    /** AlertDialog builder  */
    AlertDialog.Builder adb;

    /** all the button  */
    Button button1, button2, button3, button4, button5;

    /**  create Random  */
    Random random = new Random();

    /** create this to change the background color  */
    View mainLayout;

    /** here is  when the activity is starting. Initialize views and layout .*/
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

    /**
     *  the first  click for button1. Displays a basic alertdialog.
     *
     * @param view button .
     */
    public void clicked1(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random message");
        adb.setMessage("hello");
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     *  the second  click for button2. displays  alertdialog with  icon.
     *
     * @param view button .
     */
    public void clicked2(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random message");
        adb.setMessage("hello");
        adb.setIcon(R.drawable.ic_launcher_background);
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * the third  click for button3. display  alertdialog with  button to close the alert dialog .
     *
     * @param view button , negative .
     */
    public void clicked3(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random message");
        adb.setMessage("hello");
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

    /**
     *  the firth  click for button4. display alertdialog with
     *  two buttons one to close the alert dialog and
     *  the second to change the back ground color .
     *
     * @param view button  negative ,positive .
     */
    public void clicked4(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random message");
        adb.setMessage("hello");
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

    /**
     * this func change the background color .
     */
    public void changeBackgroundColor() {
        int color = Color.rgb(random.nextInt(256) + 1, random.nextInt(256) + 1, random.nextInt(256) + 1);
        if (mainLayout != null) {
            mainLayout.setBackgroundColor(color);
        }
    }

    /**
     * this func reset the background color to the defult (white ) .
     */
    public void reset() {
        int color = Color.rgb(255, 255, 255);
        if (mainLayout != null) {
            mainLayout.setBackgroundColor(color);
        }
    }

    /**
     * the fifth  click for button5. is display tree button :   one is to close the alert dialog , the second is to change the background color
     * the third is reset the background color to deflut (white)
     *
     * @param view button negative , positive , neutral  .
     */
    public void clicked5(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("random message");
        adb.setMessage("hello");
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

        adb.setNeutralButton("RESET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }
}
