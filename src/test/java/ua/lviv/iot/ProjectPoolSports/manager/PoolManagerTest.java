package ua.lviv.iot.ProjectPoolSports.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.ProjectPoolSports.SportTypes.*;

import java.util.LinkedList;
import java.util.List;

class PoolManagerTest {

    private List<WaterSports> createTestingList() {
        List<WaterSports> testingSportsList = new LinkedList<>();
        testingSportsList.add(new Swimming("swiming 1", 70, 5, 5, 50));
        testingSportsList.add(new Flyboarding("flyboarding 1", 15, 2, 2, 250));
        testingSportsList.add(new Hydrofoil("hydrofoil 1", 10, 1, 0, 400));
        testingSportsList.add(new Freediving("freediving 1", 30, 3, 4, 100));
        return testingSportsList;
    }

    @Test
    void testSortSportsByAscendingPrice() {
        PoolManager testingManager = new PoolManager(createTestingList());
        List<WaterSports> sortedByAscendingPrice = testingManager.sortSportsByAscendingPrice();
        for (int i = 0; i < sortedByAscendingPrice.size() - 1; i++) {
            Assertions.assertTrue(sortedByAscendingPrice.get(i).getPricePerPersonInUAH()
                    <= sortedByAscendingPrice.get(i + 1).getPricePerPersonInUAH());
        }
    }

    @Test
    void testSortSportsByDescendingPrice() {
        PoolManager testingManager = new PoolManager(createTestingList());
        List<WaterSports> sortedByDescendingPrice = testingManager.sortSportsByDescendingPrice();
        for (int i = 0; i < sortedByDescendingPrice.size() - 1; i++) {
            Assertions.assertTrue(sortedByDescendingPrice.get(i).getPricePerPersonInUAH()
                    >= sortedByDescendingPrice.get(i + 1).getPricePerPersonInUAH());
        }
    }

    @Test
    void testFindByMinimumParticipants() {
        PoolManager testingManager = new PoolManager(createTestingList());
        List<WaterSports> byMinimumParticipants = testingManager.findByMinimumParticipants();
        for (int i = 0; i < byMinimumParticipants.size() - 1; i++) {
            Assertions.assertTrue(byMinimumParticipants.get(i).getMinimumNumberOfParticipants()
                    <= PoolManager.getSearchedMaxNumOfParticipants());
        }
    }

    @Test
    void testGetSearchedMaxNumOfParticipants() {
        Assertions.assertEquals(4, PoolManager.getSearchedMaxNumOfParticipants());
    }
}