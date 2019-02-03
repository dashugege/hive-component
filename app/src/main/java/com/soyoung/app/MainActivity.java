package com.soyoung.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends Activity {
//        https://blog.csdn.net/guiying712/article/details/55213884

//    https://www.w3cschool.cn/groovy/groovy_overview.html
//    https://blog.csdn.net/u014040795/article/details/81079919
//    http://blog.bugtags.com/2016/03/28/embrace-android-studio-gradle-plugin/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });



    }
}
