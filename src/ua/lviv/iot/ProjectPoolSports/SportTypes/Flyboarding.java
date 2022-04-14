package ua.lviv.iot.ProjectPoolSports.SportTypes;

public class Flyboarding extends WaterSports {

    public Flyboarding (String sessionName, int lengthInMinutes, int minimumNumberOfParticipants,
                     int currentNumberOfParticipants, int pricePerPersonInUAH) {
        super(sessionName, lengthInMinutes, minimumNumberOfParticipants, currentNumberOfParticipants,
                pricePerPersonInUAH);
    }
}
