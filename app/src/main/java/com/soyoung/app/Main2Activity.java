package com.soyoung.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;

public class Main2Activity extends Activity {

    RecyclerView recyclerView;
//    https://blog.csdn.net/jxf_access/article/details/79564669
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        recyclerView = findViewById(R.id.recyclerView);


    }
}
