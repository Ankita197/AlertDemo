package com.example.alertdialogex;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ontheractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onther);
        final WebView webview=findViewById(R.id.webview);

        Button btnclick=findViewById(R.id.buttonclick);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              EditText edittexturl=findViewById(R.id.editTextenterUrl);
                webview.loadUrl(edittexturl.getText().toString());
            }
        });
    }
}
