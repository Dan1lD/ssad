package ru.ssad.train;

import ru.ssad.admin.Admin;
import ru.ssad.db.Database;

public abstract class Train {
    Database db = null;

    private Admin getAdminOfNextStation() {
        // Somehow gets admin from DB
        return null;
    }

    private void notifyAdmin(int delay, Admin admin) {
        admin.handleNotification(delay);
    }
}
