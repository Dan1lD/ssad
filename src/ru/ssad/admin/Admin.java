package ru.ssad.admin;

public class Admin {
    private AdminPanel panel;

    public Admin(String panelType) {
        switch (panelType) {
            case "Freight" -> this.panel = new FreightAdminPanel();
            case "LongDistant" -> this.panel = new LongDistantAdminPanel();
            case "Suburban" -> this.panel = new SuburbanAdminPanel();
        }
    }

    public AdminPanel getPanel() {
        return panel;
    }

    public void changeSchedule() {
        // Here we can implement some GUI that helps to change schedule
        String info = "info";
        this.panel.changeInfoInDB(info);
    }
}
