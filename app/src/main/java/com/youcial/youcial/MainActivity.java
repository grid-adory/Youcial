package com.youcial.youcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText textEmail;
    private EditText textPwd;
    private TextView textSignUp;
    private TextView textForgetPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textEmail = (EditText) findViewById(R.id.editLoginEmail);
        textPwd = (EditText) findViewById(R.id.editLoginPwd);
        textSignUp = (TextView) findViewById(R.id.buttonSignUp);
        textForgetPwd = (TextView) findViewById(R.id.buttonForgotPass);

        textEmail.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textEmail.setText("");
                return false;
            }
        });
        textPwd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                textPwd.setText("");
                textPwd.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                textPwd.setSelection(textPwd.getText().length());
                return false;
            }
        });

        textSignUp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                return false;
            }
        });
    }
}
