package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button shareBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shareBtn=findViewById(R.id.share);
    shareBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String body="Download the app plz";
            String Sub="http://play.google.com";
            intent.putExtra(Intent.EXTRA_TEXT,body);
            intent.putExtra(Intent.EXTRA_TEXT,Sub);
            startActivity(Intent.createChooser(intent,"Share using"));
        }
    });

    }
}