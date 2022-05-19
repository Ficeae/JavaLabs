package ua.lviv.iot.ProjectPoolSports.SportTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FlyboardingTest {

    Flyboarding flyboarding = new Flyboarding("just flyboard", 22, 2, 2, 333);

    @Test
    void testAddNewParticipants() {
        flyboarding.addNewParticipants(0);
        Assertions.assertEquals(flyboarding.getMinimumNumberOfParticipants(), flyboarding.getCurrentNumberOfParticipants());
    }

    @Test
    void testGetSessionName() {
        Assertions.assertEquals("just flyboard", flyboarding.getSessionName());
    }

    @Test
    void testGetPricePerPersonInUAH() {
        Assertions.assertEquals(333, flyboarding.getPricePerPersonInUAH());
    }

    @Test
    void testGetMinimumNumberOfParticipants() {
        Assertions.assertEquals(2, flyboarding.getMinimumNumberOfParticipants());
    }

    @Test
    void testGetLengthInMinutes() {
        Assertions.assertEquals(22, flyboarding.getLengthInMinutes());
    }

    @Test
    void testGetCurrentNumberOfParticipants() {
        Assertions.assertEquals(2, flyboarding.getCurrentNumberOfParticipants());
    }
}