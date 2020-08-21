package com.mohamedhashim.playground;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * Created by Mohamed Hashim on 8/21/2020.
 */
@Database(entities = Post.class, version = 1)
abstract class PostsDatabase extends RoomDatabase {

    private static PostsDatabase instance;  // to make a singelton pattern to make only one instance from DB to use in all app
    public abstract PostsDao postsDao();

    public static synchronized PostsDatabase getInstance(Context context) {  //static to be used in all app and synchronized to prevent any writing in the same time
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    PostsDatabase.class, "posts_Database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
