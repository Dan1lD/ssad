package ru.ssad.admin;

public class LongDistantAdminPanel implements AdminPanel {
    @Override
    public void drawGUI() {
        // Implements some GUI to work with DB
    }

    private void markAsArrived() {
        // Notes that the train has arrived
    }

    private void updateArrivalTime(String newTime) {
        // Gets new arrival time from GUI and updates time in DB
    }

    private void updateDepartureTime(String newTime) {
        // Gets new departure time from GUI and updates time in DB
    }
}
