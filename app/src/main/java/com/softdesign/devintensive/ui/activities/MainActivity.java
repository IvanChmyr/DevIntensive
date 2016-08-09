package com.softdesign.devintensive.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";

   /* //для сохранения цвета при переворачивании экрана
    protected EditText mEditText;
    protected Button mRedButton, mGreenButon;
    protected int mColorMode;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

       /* //для сохранения цвета при переворачивании экрана
        mRedButton = (Button) findViewById(R.id.red_btn);
        mGreenButon = (Button) findViewById(R.id.green_btn);
        mEditText = (EditText) findViewById(R.id.textView);

        mRedButton.setOnClickListener(this);
        mGreenButon.setOnClickListener(this);*/


        if (savedInstanceState == null) {
            //активити запускаеться впервые
        } else {
            //активити уже создавалось
            /*//для сохранения цвета при переворачивании экрана
           mColorMode = savedInstanceState.getInt(ConstantManager.COLOR_MOD_KEY);

            if (mColorMode == Color.RED) {
                mEditText.setBackgroundColor(Color.RED);
            } else if (mColorMode == Color.GREEN) {
                mEditText.setBackgroundColor(Color.GREEN);
            }*/
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /* //для сохранения цвета при переворачивании экрана
            case R.id.green_btn:
                mEditText.setBackgroundColor(Color.GREEN);
                mColorMode = Color.GREEN;
                break;
            case R.id.red_btn:
                mEditText.setBackgroundColor(Color.RED);
                mColorMode = Color.RED;
                break;*/
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

       /* //для сохранения цвета при переворачивании экрана
        Log.d(TAG,"onSaveInstanceState");
        outState.putInt(ConstantManager.COLOR_MOD_KEY, mColorMode);*/
    }
}
