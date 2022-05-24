package ua.lviv.iot.ProjectPoolSports.SportTypes;

public class Swimming extends WaterSports {

    public Swimming(String sessionName, int lengthInMinutes, int minimumNumberOfParticipants,
                    int currentNumberOfParticipants, int pricePerPersonInUAH) {
        super(sessionName, lengthInMinutes, minimumNumberOfParticipants, currentNumberOfParticipants,
                pricePerPersonInUAH);
    }
}
