package com.mohamedhashim.playground;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Mohamed Hashim on 8/21/2020.
 */
@Entity
class Post {
    @PrimaryKey(autoGenerate = true)
    int id;
    String title;
    String body;
    int userId;

    public Post(int userId, String title, String body) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }
}
