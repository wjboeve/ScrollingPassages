package com.example.scrollingpassages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String PASSAGE = "com.example.scrollingpassages.PASSAGE";
    private String mPassage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setP1(View view) {
        mPassage = getResources().getString(R.string.passage1);
        launch2(view);
    }

    public void setP2(View view) {
        mPassage = getResources().getString(R.string.passage2);
        launch2(view);
    }

    public void setP3(View view) {
        mPassage = getResources().getString(R.string.passage3);
        launch2(view);
    }

    public void launch2 (View view) {
        Intent intent = new Intent(this,PassageDisplayer.class );
        intent.putExtra(PASSAGE, mPassage);
        startActivity(intent);

    }
}
