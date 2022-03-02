package com.example.test;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mOutput = findViewById(R.id.textView);
        process();
    }
    private void addToEditText(String string) {
        mOutput.setText("" + mOutput.getText() + string);
    }

    public void resetText() {
        mOutput.setText("");
    }

    public void print(Object obj) {
        String text = (obj != null ? obj.toString() : "null");
        addToEditText(text);
        String debug = text.replace("\n", "\\n");
    }
    public void process() {
        print("Hello");
        print("\n");
        print("Hello");
    }
    }
