package com.cole.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cole.myapplication.util.Counter;

public class MainActivity extends AppCompatActivity {

    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = new Counter(getString(R.string.counter));
    }

    public void increment(View view) {
        TextView number = findViewById(R.id.number);
        number.setText(counter.increment());
    }
}