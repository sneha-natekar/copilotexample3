package com.example.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

// Define the database configuration and entities
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    // Abstract method to get the UserDao
    public abstract UserDao userDao();
}
