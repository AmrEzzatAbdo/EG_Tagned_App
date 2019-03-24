package com.example.amr.tagned;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent I;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         I=new Intent(MainActivity.this,WebViewActivity.class);
    }

    public void trainingbtn(View view) {
        I.putExtra("url", "https://tagned.mod.gov.eg/TravelPermissionApplication.aspx#StartContent");
        startActivity(I);
    }

    public void checkTrain(View view) {
        I.putExtra("url", "https://tagned.mod.gov.eg/TravelPermissionSearch.aspx#StartContent");
        startActivity(I);
    }

    public void e3faa(View view) {
        I.putExtra("url", "https://tagned.mod.gov.eg/CertificateApplication.aspx#StartContent");
        startActivity(I);
    }

    public void checkE3fa(View view) {
        I.putExtra("url", "https://tagned.mod.gov.eg/CertificateSearch.aspx#StartContent");
        startActivity(I);
    }

    public void tagned(View view) {
        I.putExtra("url", "https://tagned.mod.gov.eg/Default.aspx");
        startActivity(I);
    }
}
