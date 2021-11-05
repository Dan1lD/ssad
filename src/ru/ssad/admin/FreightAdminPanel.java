package ru.ssad.admin;

public class FreightAdminPanel implements AdminPanel {
    @Override
    public void drawGUI() {
        // Implements some GUI to work with DB (FreightDB)
    }

    private void markAsArrived() {
        // Notes that the train has arrived (FreightDB)
    }

    private void updateArrivalTime(String newTime) {
        // Gets new arrival time from GUI and updates time in DB (FreightDB)
    }

    private void updateDepartureTime(String newTime) {
        // Gets new departure time from GUI and updates time in DB (FreightDB)
    }
}
