package ua.lviv.iot.ProjectPoolSports.SportTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SwimmingTest {

    Swimming swimming = new Swimming("swimming at 1:11am", 121, 7, 3, 44);

    @Test
    void testAddNewParticipants() {
        swimming.addNewParticipants(4);
        Assertions.assertEquals(swimming.getMinimumNumberOfParticipants(), swimming.getCurrentNumberOfParticipants());
    }

    @Test
    void testGetSessionName() {
        Assertions.assertEquals("swimming at 1:11am", swimming.getSessionName());
    }

    @Test
    void testGetPricePerPersonInUAH() {
        Assertions.assertEquals(44, swimming.getPricePerPersonInUAH());
    }

    @Test
    void testGetMinimumNumberOfParticipants() {
        Assertions.assertEquals(7, swimming.getMinimumNumberOfParticipants());
    }

    @Test
    void testGetLengthInMinutes() {
        Assertions.assertEquals(121, swimming.getLengthInMinutes());
    }

    @Test
    void testGetCurrentNumberOfParticipants() {
        Assertions.assertEquals(3, swimming.getCurrentNumberOfParticipants());
    }
}