package ru.ssad.admin;

import ru.ssad.db.Database;
import ru.ssad.tracking_screen.TrackingScreen;
import ru.ssad.train.Train;

import java.util.ArrayList;

public class StationAdmin extends Admin {
    public ArrayList<Train> upcomingTrains;
    public Database DB;
    public TrackingScreen Screen;

    public StationAdmin(String panelType) {
        super(panelType);
    }

    public void handleTrainNotification(int delay) {
        // Shows notification
    }

    public void handleServerNotification(TrackingScreen table) {
        // Shows notification
    }
}
