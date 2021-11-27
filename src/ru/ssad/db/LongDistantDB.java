package ru.ssad.db;

public class LongDistantDB extends Database {
    public static LongDistantDB instance;

    private LongDistantDB() {
    }

    public static Database getInstance() {
        if (LongDistantDB.instance == null)
            LongDistantDB.instance = new LongDistantDB();
        return LongDistantDB.instance;
    }
}
