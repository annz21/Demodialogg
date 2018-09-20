package com.example.weerawatp.demodialogg;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Dialog dialog;
        dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().getAttributes().windowAnimations= R.style.animation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(
                Color.TRANSPARENT
        ));
        dialog.setContentView(R.layout.dialog_layout);
        Button bnClick = (Button) findViewById(R.id.bnClick);
        TextView close = (TextView) dialog.findViewById(R.id.close);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(true);
        bnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                dialog.dismiss();
            }
        });


    }
}
