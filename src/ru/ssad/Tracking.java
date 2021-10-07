package ru.ssad;

public interface Tracking {

    TrackingSystem system = TrackingSystem.getInstance();
    Timetable showTimetable();
}
