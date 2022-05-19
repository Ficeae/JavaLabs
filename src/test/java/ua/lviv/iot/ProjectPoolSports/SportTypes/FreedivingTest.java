package ua.lviv.iot.ProjectPoolSports.SportTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreedivingTest {

    Freediving freediving = new Freediving("sink for free", 66, 1, 0, 0);

    @Test
    void testAddNewParticipants() {
        freediving.addNewParticipants(1);
        Assertions.assertEquals(freediving.getMinimumNumberOfParticipants(), freediving.getCurrentNumberOfParticipants());
    }

    @Test
    void testGetSessionName() {
        Assertions.assertEquals("sink for free", freediving.getSessionName());
    }

    @Test
    void testGetPricePerPersonInUAH() {
        Assertions.assertEquals(0, freediving.getPricePerPersonInUAH());
    }

    @Test
    void testGetMinimumNumberOfParticipants() {
        Assertions.assertEquals(1, freediving.getMinimumNumberOfParticipants());
    }

    @Test
    void testGetLengthInMinutes() {
        Assertions.assertEquals(66, freediving.getLengthInMinutes());
    }

    @Test
    void testGetCurrentNumberOfParticipants() {
        Assertions.assertEquals(0, freediving.getCurrentNumberOfParticipants());
    }
}