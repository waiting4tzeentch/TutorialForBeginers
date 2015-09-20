package com.flapdoodle.michaelmoser.tutorialforbeginers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    TextView mainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // 1. Access the TextView defined in layout XML
        // and the set its text

        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }

    // removed public boolean onOptionsItemSelected on instructions from tutorial
}
