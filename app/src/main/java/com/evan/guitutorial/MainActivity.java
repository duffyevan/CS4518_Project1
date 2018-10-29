package com.evan.guitutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonPressed(View v){
        Log.d("Button Event Recieved!", v.toString());
        Toast toast = Toast.makeText(getApplicationContext(), "Thanks For Pressing!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
