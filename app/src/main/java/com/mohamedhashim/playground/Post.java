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
    int userId;

    public Post(int id, String title, int userId) {
        this.id = id;
        this.title = title;
        this.userId = userId;
    }
}
