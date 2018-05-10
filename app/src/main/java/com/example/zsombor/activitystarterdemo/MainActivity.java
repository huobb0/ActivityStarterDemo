package com.example.zsombor.activitystarterdemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = this;
        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                //Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.zsombor.activitydemo");
                Intent intent = new Intent();
                intent.setClassName("com.example.zsombor.activitydemo","com.example.zsombor.activitydemo.Secret");

                startActivity(intent);
            }
        });
    }
}
