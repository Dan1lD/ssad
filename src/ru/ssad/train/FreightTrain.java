package ru.ssad.train;

import ru.ssad.db.FreightDB;

public class FreightTrain extends Train {
    public FreightTrain() {
        this.db = FreightDB.getInstance();
    }
}
