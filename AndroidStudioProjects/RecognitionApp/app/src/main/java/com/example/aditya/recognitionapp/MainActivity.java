package com.example.aditya.recognitionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button firstButtonClick ,secondButtonClick,thirdButtonClick;
    private EditText user_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstButtonClick =(Button) findViewById(R.id.first_button);
        secondButtonClick=(Button) findViewById(R.id.second_button);
        thirdButtonClick=(Button) findViewById(R.id.third_button);
        user_name=(EditText) findViewById(R.id.Edit_text);
    }

    public void FirstButton(View view) {
        String firstmsg=String.valueOf(user_name.getText());
        String first_res= "You clicked First Button, Mr."+ firstmsg;
        Toast.makeText(this,first_res,Toast.LENGTH_SHORT).show();
    }


    public void Second_button(View view) {
        String firstmsg=String.valueOf(user_name.getText());
        String first_res= "You clicked Second Button , Mr."+ firstmsg;
        Toast.makeText(this,first_res,Toast.LENGTH_SHORT).show();
    }

    public void third_button(View view) {
        String firstmsg=String.valueOf(user_name.getText());
        String first_res= "You Clicked Third Button, Mr."+ firstmsg;
        Toast.makeText(this,first_res,Toast.LENGTH_SHORT).show();
    }
}
