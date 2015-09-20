package com.flapdoodle.michaelmoser.tutorialforbeginers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener {

    TextView mainTextView;
    Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // 1. Access the TextView defined in layout XML
        // and the set its text

        mainTextView = (TextView) findViewById(R.id.main_textview);
        mainTextView.setText("Set in Java!");

        // 2. Access the Button defined in layout XML
        // and listen for it here

        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // test the button
        mainTextView.setText("Button Pressed!");
    }

    // removed public boolean onOptionsItemSelected on instructions from tutorial
}
