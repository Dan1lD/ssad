package ru.ssad.db;

public class SuburbanDB extends Database {
    public static SuburbanDB instance;

    private SuburbanDB() {
    }

    public static Database getInstance() {
        if (SuburbanDB.instance == null)
            SuburbanDB.instance = new SuburbanDB();
        return SuburbanDB.instance;
    }
}
