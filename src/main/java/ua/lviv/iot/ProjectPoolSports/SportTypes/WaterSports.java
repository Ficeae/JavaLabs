package ua.lviv.iot.ProjectPoolSports.SportTypes;

public abstract class WaterSports {

    private final String sessionName;
    private final int lengthInMinutes;
    private final int minimumNumberOfParticipants;
    private final int pricePerPersonInUAH;
    private int currentNumberOfParticipants;

    public WaterSports(String sessionName, int lengthInMinutes, int minimumNumberOfParticipants,
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

    public String getHeaders() {
        return "sessionName, lengthInMinutes, minimumNumberOfParticipants, currentNumberOfParticipants,pricePerPersonInUAH";
    }

    public String toCSV() {
        return sessionName + ", " + lengthInMinutes + ", " + minimumNumberOfParticipants
                + ", " + currentNumberOfParticipants + ", " + pricePerPersonInUAH;
    }
}
