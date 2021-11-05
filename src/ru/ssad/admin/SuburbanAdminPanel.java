package ru.ssad.admin;

public class SuburbanAdminPanel implements AdminPanel {
    @Override
    public void drawGUI() {
        // Implements some GUI to work with DB (SuburbanDB)
    }

    private void markAsArrived() {
        // Notes that the train has arrived in DB (SuburbanDB)
    }

    private void updateArrivalTime(String newTime) {
        // Gets new arrival time from GUI and updates time in DB (SuburbanDB)
    }

    private void updateDepartureTime(String newTime) {
        // Gets new departure time from GUI and updates time in DB (SuburbanDB)
    }
}
