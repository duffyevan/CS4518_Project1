package com.evan.guitutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLeftButtonPressed(View v){
        Toast toast = Toast.makeText(getApplicationContext(), "Thanks For Pressing The Left Button!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onRightButtonPressed(View v){
        Toast toast = Toast.makeText(getApplicationContext(), "Thanks For Pressing The Right Button!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
