package com.miduo.mylibrary;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.miduo.libservice.LibraryService;

@Route(path = "/mylibrary/LibraryServiceImpl" ,name = "test service")
public class LibraryServiceImpl implements LibraryService {

    @Override
    public String getContent() {
        return "这是组件中的内容";
    }

    @Override
    public void init(Context context) {

    }
}
