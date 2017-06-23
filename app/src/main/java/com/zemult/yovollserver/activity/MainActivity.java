package com.zemult.yovollserver.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zemult.yovollserver.R;
import com.zemult.yovollserver.app.BaseActivity;

/**
 * Created by Wikison on 2017/6/20.
 */

public class MainActivity extends BaseActivity{
    @Override
    public void setContentView() {

    }

    @Override
    public void init() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}
