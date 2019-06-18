package com.example.scrollingpassages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PassageDisplayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage_displayer);
        Intent intent = getIntent();
        String passage = intent.getStringExtra(MainActivity.PASSAGE);
        TextView textView = findViewById(R.id.display);
        textView.setText(passage);
    }
}
