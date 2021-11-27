package ru.ssad.train;

import ru.ssad.db.LongDistantDB;

public class LongDistantTrain extends Train {
    public LongDistantTrain() {
        this.db = LongDistantDB.getInstance();
    }
}
