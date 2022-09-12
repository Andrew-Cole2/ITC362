package com.cole.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleState(View view) {
        TextView text = findViewById(R.id.textView);
        View helloImage = findViewById(R.id.helloImage);
        View goodbyeImage = findViewById(R.id.goodbyeImage);
        if (helloImage.getVisibility() == View.INVISIBLE) {
            text.setText("Hello");
            goodbyeImage.setVisibility(View.INVISIBLE);
            helloImage.setVisibility(View.VISIBLE);
        }
        else {
            text.setText("Good Bye");
            helloImage.setVisibility(View.INVISIBLE);
            goodbyeImage.setVisibility(View.VISIBLE);
        }
    }
}