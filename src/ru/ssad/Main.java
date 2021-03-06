package ru.ssad;

import ru.ssad.tracking_screen.FreightSubstationScreen;
import ru.ssad.tracking_screen.LongDistantTrackingScreen;
import ru.ssad.tracking_screen.SuburbanTrackingScreen;

// Example of usage
public class Main {

    public static void main(String[] args) {
        FreightSubstationScreen freightSubstationScreen = new FreightSubstationScreen();
        SuburbanTrackingScreen suburbanTrackingScreen = new SuburbanTrackingScreen();
        LongDistantTrackingScreen longDistantTrackingScreen = new LongDistantTrackingScreen();

        freightSubstationScreen.createTracking(1234);
        freightSubstationScreen.drawTimetable();

        suburbanTrackingScreen.createTracking(1324);
        suburbanTrackingScreen.drawTimetable();

        longDistantTrackingScreen.createTracking(1243);
        longDistantTrackingScreen.drawTimetable();
    }
}
