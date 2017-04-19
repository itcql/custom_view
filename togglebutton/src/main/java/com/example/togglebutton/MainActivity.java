package com.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private ToggleButton tbHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbHello= (ToggleButton) findViewById(R.id.tb_hello);
        tbHello.setSwitchBackground(R.mipmap.switch_background);
        tbHello.setSlideImage(R.mipmap.slide_button_background);
    }
}
