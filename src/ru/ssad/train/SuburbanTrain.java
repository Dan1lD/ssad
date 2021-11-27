package ru.ssad.train;

import ru.ssad.db.SuburbanDB;

public class SuburbanTrain extends Train {
    public SuburbanTrain() {
        this.db = SuburbanDB.getInstance();
    }
}
