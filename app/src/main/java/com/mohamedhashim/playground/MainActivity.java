package com.mohamedhashim.playground;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //starting Database transactions
        PostsDatabase postsDatabase = PostsDatabase.getInstance(this);
        postsDatabase.postsDao.insert(new Post(1, "Hello", 10));

    }
}
