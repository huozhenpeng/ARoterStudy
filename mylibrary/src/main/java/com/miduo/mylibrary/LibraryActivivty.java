package com.miduo.mylibrary;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/mylibrary/LibraryActivivty")
public class LibraryActivivty extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_li);
    }

    public void jump(View view) {
        ARouter.getInstance().build("/app/MainActivity").navigation();
    }
}
