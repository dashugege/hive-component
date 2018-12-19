package hive.soyoung.com.reader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/reader/readeractivity")
public class ReaderActivity extends Activity {

    @Autowired
    String name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        ARouter.getInstance().inject(this);

        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();

    }
}
