package com.example.assecotestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
    }

    public void onFirstButtonClick(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://asseco.com/"));
        startActivity(browserIntent);
    }

    public void onSecondButtonClick(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://see.asseco.com/"));
        startActivity(browserIntent);
    }
    public void onThirdButtonClick(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.payten.com/en/"));
        startActivity(browserIntent);

    }
    public void onFourthButtonClick(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://see.asseco.com/about/contact/company-contacts/"));
        startActivity(browserIntent);


    }
}
