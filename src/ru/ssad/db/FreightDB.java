package ru.ssad.db;

public class FreightDB extends Database {
    public static FreightDB instance;

    private FreightDB() {
    }

    public static Database getInstance() {
        if (FreightDB.instance == null)
            FreightDB.instance = new FreightDB();
        return FreightDB.instance;
    }
}
