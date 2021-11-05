package ru.ssad.admin;

public class SuburbanAdminPanel implements AdminPanel {
    @Override
    public void drawGUI() {
        // Implements some GUI to work with DB
    }

    private void markAsArrived() {
        // Notes that the train has arrived
    }

    private void updateDepartureTime(String newTime) {
        // Gets new departure time from GUI and updates time in DB
    }
}
