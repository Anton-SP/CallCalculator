package com.home.callcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton call_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call_calc = findViewById(R.id.call_button);

        call_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("project://calculator");
                Intent call_intent = new Intent(Intent.ACTION_VIEW, uri);
                ActivityInfo activityInfo = call_intent.resolveActivityInfo(getPackageManager(), call_intent.getFlags());
                if (activityInfo != null) {
                    startActivity(call_intent);
                }


            }
        });

    }
}