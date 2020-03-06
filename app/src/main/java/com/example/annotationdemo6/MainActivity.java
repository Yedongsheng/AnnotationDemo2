package com.example.annotationdemo6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.annotation.BindView;
import com.example.annotation.OnClick;
import com.example.binder.Binding;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding.bind(this);
        mTextView.setText("Hello world");
    }
    @OnClick(R.id.btn)
    void clickByBtn(View v){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,JumpActivity.class);
        startActivity(intent);
    }
}
