package com.example.yogatama.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Home extends AppCompatActivity implements OnClickListener {

   private Button button;
   private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

      button = (Button) findViewById(R.id.kirimdata);
      button.setOnClickListener(this);
      button1 = (Button) findViewById(R.id.qr);
      button1.setOnClickListener(this);
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//
//        findAllViewsId();
//        button.setOnClickListener(this);
//    }
//    private void findAllViewsId(){
//        button =(Button) findViewById(R.id.kirimdata);
//    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.kirimdata :
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.qr :
                Intent i2 = new Intent(this, Main3Activity.class);
                startActivity(i2);
                break;

        }
    }

}
