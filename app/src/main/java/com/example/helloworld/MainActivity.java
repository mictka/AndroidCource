package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        emailEditText = findViewById(R.id.emailEditText);
    }

    public void onBtnClick(View view) {
        TextView firstNameTextView = findViewById(R.id.firstNameTextView);
        firstNameTextView.setText(firstNameEditText.getText().toString() );

        TextView lastNameTextView = findViewById(R.id.lastNameTextView);
        lastNameTextView.setText(lastNameEditText.getText().toString() );

        TextView emailTextView = findViewById(R.id.emailTextView);
        emailTextView.setText(emailEditText.getText().toString() );
    }
}
