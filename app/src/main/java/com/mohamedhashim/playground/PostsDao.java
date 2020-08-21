package com.mohamedhashim.playground;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * Created by Mohamed Hashim on 8/21/2020.
 */
@Dao
interface PostsDao {
    @Insert
    void insert(Post post);

    @Query("select * from post")
    void getPost();
}
