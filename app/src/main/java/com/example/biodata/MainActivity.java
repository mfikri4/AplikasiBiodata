package com.example.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone (View view){
        Uri url =Uri.parse("tel:082136841556");
        Intent it = new Intent(Intent.ACTION_VIEW, url);
        startActivity(it);
    }

    public void showMap(View view) {
        Uri uri = Uri.parse("geo:-6.7800946, 111.2430525=");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri );
        startActivity(it);

    }

    public void emailku(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"fikrial33@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}


