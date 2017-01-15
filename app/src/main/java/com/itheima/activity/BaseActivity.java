package com.itheima.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Allison on 2017/1/15.
 *
 * @des 对activity进行抽取,减少代码量,方便添加共性功能
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        init();
    }

    //这是提供给子类做初始化的方法
    public void init() {
    }

    /**
     * 初始化视图交给子类实现
     * @return
     */
    public abstract int getLayoutResId();


}
