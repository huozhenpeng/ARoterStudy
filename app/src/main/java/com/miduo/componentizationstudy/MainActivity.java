package com.miduo.componentizationstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.miduo.libservice.LibraryService;

@Route(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void jump(View view) {
        ARouter.getInstance().build("/mylibrary/LibraryActivivty").navigation();
    }

    public void request(View view) {
        LibraryService libraryService=(LibraryService) ARouter.getInstance().build("/mylibrary/LibraryServiceImpl").navigation();
        Toast.makeText(this,libraryService.getContent(),Toast.LENGTH_LONG).show();
    }
}
