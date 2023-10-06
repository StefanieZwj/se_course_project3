package com.example.asimplecounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {


    int counter=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Button AddBtn=(Button) findViewById(R.id.btn_add);//计数器+1
        Button ReduceBtn=(Button) findViewById(R.id.btn_reduce);//计数器-1
        Button ClearBtn=(Button) findViewById(R.id.btn_clear);//计数器清零
        TextView CounterView=(TextView) findViewById(R.id.tv_counter);
        CounterView.setText(String.valueOf(counter));

        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                CounterView.setText(String.valueOf(counter));
            }
        });

        ReduceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                CounterView.setText(String.valueOf(counter));
            }
        });

        ClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                CounterView.setText(String.valueOf(counter));
            }
        });

    }
}