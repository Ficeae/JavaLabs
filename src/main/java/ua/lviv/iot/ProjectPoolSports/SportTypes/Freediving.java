package ua.lviv.iot.ProjectPoolSports.SportTypes;

public class Freediving extends WaterSports {

    public Freediving(String sessionName, int lengthInMinutes, int minimumNumberOfParticipants,
                      int currentNumberOfParticipants, int pricePerPersonInUAH) {
        super(sessionName, lengthInMinutes, minimumNumberOfParticipants, currentNumberOfParticipants,
                pricePerPersonInUAH);
    }
}
