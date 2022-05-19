package ua.lviv.iot.ProjectPoolSports.SportTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HydrofoilTest {

    Hydrofoil hydrofoil = new Hydrofoil("hydrofoil 20.12", 10, 1, 0, 222);

    @Test
    void testAddNewParticipants() {
        hydrofoil.addNewParticipants(1);
        Assertions.assertEquals(hydrofoil.getMinimumNumberOfParticipants(), hydrofoil.getCurrentNumberOfParticipants());
    }

    @Test
    void testGetSessionName() {
        Assertions.assertEquals("hydrofoil 20.12", hydrofoil.getSessionName());
    }

    @Test
    void testGetPricePerPersonInUAH() {
        Assertions.assertEquals(222, hydrofoil.getPricePerPersonInUAH());
    }

    @Test
    void testGetMinimumNumberOfParticipants() {
        Assertions.assertEquals(1, hydrofoil.getMinimumNumberOfParticipants());
    }

    @Test
    void testGetLengthInMinutes() {
        Assertions.assertEquals(10, hydrofoil.getLengthInMinutes());
    }

    @Test
    void testGetCurrentNumberOfParticipants() {
        Assertions.assertEquals(0, hydrofoil.getCurrentNumberOfParticipants());
    }
}