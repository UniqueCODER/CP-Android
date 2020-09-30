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
        TextView txtHello = findViewById(R.id.textView);
        TextView textViewlastname = findViewById(R.id.textView);
        TextView textViewEmail = findViewById(R.id.textView);

        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText editTextLastname = findViewById(R.id.editTextLastname);
        EditText editTextEmail = findViewById(R.id.editTextEmail);


        txtHello.setText("Hello , "+edtTxtName.getText().toString());
        textViewlastname.setText(editTextLastname.getText().toString());
        textViewEmail.setText(editTextEmail.getText().toString());
    }
}