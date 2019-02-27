package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textView1;
    Button button1;
    ProgressBar progressbar2;

    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        textView1 = (EditText) findViewById(R.id.textView1);
        progressbar2 = (ProgressBar) findViewById(R.id.progressBar2);
        progressbar2.setVisibility(ProgressBar.VISIBLE);
// запускаем длительную операцию


        View.OnClickListener oclbutton1Ok = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = value + Integer.parseInt(textView1.getText().toString());
                progressbar2.setProgress(value);

            }
        };
        button1.setOnClickListener(oclbutton1Ok);
    }
}
