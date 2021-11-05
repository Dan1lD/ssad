package ru.ssad.admin;

public class FreightAdminPanel implements AdminPanel {
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
}
