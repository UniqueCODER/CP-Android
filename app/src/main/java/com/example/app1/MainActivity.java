package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view ) {

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);



        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtName2 = findViewById(R.id.edtTxtName2);
        EditText edtTxtName3 = findViewById(R.id.edtTxtName3);



        textView.setText("First Name  "+edtTxtName.getText().toString());
        textView2.setText("Last Name "+edtTxtName2.getText().toString());
        textView3.setText("E-mail "+edtTxtName3.getText().toString());

    }
}