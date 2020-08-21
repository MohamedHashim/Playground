package com.mohamedhashim.playground;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * Created by Mohamed Hashim on 8/21/2020.
 */
@Dao
interface PostsDao {
    @Insert
    Completable insertPost(Post post);

    @Query("select * from post")
    Single<List<Post>> getPosts();
}
