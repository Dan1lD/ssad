package ru.ssad.admin;

abstract public class Admin {
    protected AdminPanel panel;

    public Admin(String panelType) {
        switch (panelType) {
            case "Freight" -> this.panel = new FreightAdminPanel();
            case "LongDistant" -> this.panel = new LongDistantAdminPanel();
            case "Suburban" -> this.panel = new SuburbanAdminPanel();
            default -> throw new IllegalStateException("Unexpected value: " + panelType);
        }
    }

    public AdminPanel getPanel() {
        return panel;
    }

    abstract void changeSchedule();
}
