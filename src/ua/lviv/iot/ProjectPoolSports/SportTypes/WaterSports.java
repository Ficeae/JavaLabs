package ua.lviv.iot.ProjectPoolSports.SportTypes;

public abstract class WaterSports {

    private String sessionName;
    private int lengthInMinutes;
    private int minimumNumberOfParticipants;
    private int currentNumberOfParticipants;
    private int pricePerPersonInUAH;

    public WaterSports (String sessionName, int lengthInMinutes, int minimumNumberOfParticipants,
                        int currentNumberOfParticipants, int pricePerPersonInUAH) {
        this.sessionName = sessionName;
        this.lengthInMinutes = lengthInMinutes;
        this.minimumNumberOfParticipants = minimumNumberOfParticipants;
        this.currentNumberOfParticipants = currentNumberOfParticipants;
        this.pricePerPersonInUAH = pricePerPersonInUAH;
    }

    public int addNewParticipants(int amountOfIncomers) {
        this.currentNumberOfParticipants = currentNumberOfParticipants + amountOfIncomers;
        return currentNumberOfParticipants;
    }

    public String getSessionName() {
        return sessionName;
    }

    public int getPricePerPersonInUAH() {
        return pricePerPersonInUAH;
    }

    public int getMinimumNumberOfParticipants() {
        return minimumNumberOfParticipants;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public int getCurrentNumberOfParticipants() {
        return currentNumberOfParticipants;
    }

    @Override
    public String toString() {
        return "// Name: " + sessionName
                + "\n| Length: " + lengthInMinutes
                + "\n| Minimum participants: " + minimumNumberOfParticipants
                + "\n| Current participants: " + currentNumberOfParticipants
                + "\n| Price: " + pricePerPersonInUAH + "\n";
    };

}
