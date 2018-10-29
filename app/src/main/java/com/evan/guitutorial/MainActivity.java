package com.evan.guitutorial;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            this.setupImages();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupImages() throws IOException {
        ImageView kittenView = findViewById(R.id.kittenView);
        this.setImageViewDrawableFromPath(kittenView, "KittenPictures/Fran.JPG");
    }

    public void setImageViewDrawableFromPath(ImageView view, String filePath) throws IOException {
        InputStream imageStream = getAssets().open(filePath);
        Drawable image = Drawable.createFromStream(imageStream, null);
        view.setImageDrawable(image);
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
