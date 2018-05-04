package com.example.dogoodsoft_app.lessismore;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.dogoodsoft_app.lessismore.aboutFile.FileActivity;
import com.example.dogoodsoft_app.lessismore.base.BaseActivity;
import com.example.dogoodsoft_app.lessismore.retrofit.RetrofitActvity;
import com.example.dogoodsoft_app.lessismore.rxjvaa.RxActivity;
import com.example.dogoodsoft_app.lessismore.test.MainActivity;
import com.example.dogoodsoft_app.lessismore.test.X5WebViewActivity;
import com.example.dogoodsoft_app.lessismore.widget.ColorPickerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3Activity extends BaseActivity {

    @BindView(R.id.colorview)
    ColorPickerView colorPickerView;

    @OnClick(R.id.jump_1)
    public void jump1(){

        startActivity(new Intent(Main3Activity.this, MainActivity.class));

    }

    @OnClick(R.id.jump2)
    public void jump2(){

        startActivity(new Intent(Main3Activity.this, X5WebViewActivity.class));

    }

    @OnClick(R.id.jump3)
    public void jump3(){


        startActivity(new Intent(Main3Activity.this, RxActivity.class));
    }


    @OnClick(R.id.retrofit)
    public void retrofit(){


        startActivity(new Intent(Main3Activity.this, RetrofitActvity.class));
    }

    @OnClick(R.id.file)
    public void file(){


        startActivity(new Intent(Main3Activity.this, FileActivity.class));
    }

    @OnClick(R.id.rounter)
    public void rounter(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ButterKnife.bind(this);


        colorPickerView.setOnColorPickerChangeListener(new ColorPickerView.OnColorPickerChangeListener() {
            @Override
            public void onColorChanged(ColorPickerView picker, int color) {


                getWindow().setBackgroundDrawable(new ColorDrawable(color));

            }

            @Override
            public void onStartTrackingTouch(ColorPickerView picker) {

            }

            @Override
            public void onStopTrackingTouch(ColorPickerView picker) {

            }
        });


    }
}
