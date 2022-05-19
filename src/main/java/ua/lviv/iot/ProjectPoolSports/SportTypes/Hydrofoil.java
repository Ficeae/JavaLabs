package ua.lviv.iot.ProjectPoolSports.SportTypes;

public class Hydrofoil extends WaterSports {

    public Hydrofoil (String sessionName, int lengthInMinutes, int minimumNumberOfParticipants,
                     int currentNumberOfParticipants, int pricePerPersonInUAH) {
        super(sessionName, lengthInMinutes, minimumNumberOfParticipants, currentNumberOfParticipants,
                pricePerPersonInUAH);
    }
}
