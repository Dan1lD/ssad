package ru.ssad.db;

import ru.ssad.admin.Admin;

public class LocalDB {
    private Admin admin;
    private Database DB;

    public void checkData(int id, int delay, String station) {
        // Pulls data from global DB to local DB
    }

    private void sendUpdateToDatabase(int id, int delay, String station) {
        // Push changes from local DB to global DB
    }

    public void notifyAdmin(int delay) {

    }
}
