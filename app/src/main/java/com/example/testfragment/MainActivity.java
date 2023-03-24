package com.example.testfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3;
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;
    
    private static String TAG = "MainActivity.java";
    
    private void init(){
        blankFragment = new BlankFragment();
      //  blankFragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        blankFragment2 = new BlankFragment2();
        blankFragment3 = new BlankFragment3();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment).commit();

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        init();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(this,"button1",Toast.LENGTH_SHORT).show();
                try{
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment).commit();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case R.id.btn2:
                Toast.makeText(this,"button2",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment2).commit();

                break;
            case R.id.btn3:
                Toast.makeText(this,"button3",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,blankFragment3).commit();

                break;
        }
    }
}