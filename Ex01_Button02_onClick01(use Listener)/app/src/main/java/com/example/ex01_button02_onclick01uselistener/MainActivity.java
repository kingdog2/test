package com.example.ex01_button02_onclick01uselistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtMsg;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = this.findViewById(R.id.txtMsg);
        btn1 = this.findViewById(R.id.btn1);
        btn2 = this.findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        int id = view.getId();
//        switch (id){
//            case R.id.btn1:
//
//                break;
//            case R.id.btn2:
//
//                break;
//        }
        //Button btn = (Button)view;
        String str = ((Button)view).getText().toString();
        //txtMsg.setText(btn.getText()+" is ckicked");
        txtMsg.setText(str+" is ckicked");

    }
}