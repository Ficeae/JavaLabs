package ua.lviv.iot.ProjectPoolSports.writer;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.ProjectPoolSports.SportTypes.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaterSportsWriterTest {

    private List<WaterSports> createTestingList() {
        List<WaterSports> testingSportsList = new LinkedList<>();
        testingSportsList.add(new Swimming("swiming", 70, 5, 5, 50));
        testingSportsList.add(new Flyboarding("flyboarding", 15, 2, 2, 250));
        testingSportsList.add(new Hydrofoil("hydrofoil", 10, 1, 0, 400));
        testingSportsList.add(new Freediving("freediving", 30, 3, 4, 100));
        return testingSportsList;
    }

    @Test
    void testWriteToFile() {
        WaterSportsWriter waterSportsWriter = new WaterSportsWriter();
        waterSportsWriter.writeToFile(createTestingList());
        try (
                FileReader expectedFR = new FileReader("expected.csv");
                BufferedReader expectedBR = new BufferedReader(expectedFR);
                FileReader actualFR = new FileReader("result.csv");
                BufferedReader actualBR = new BufferedReader(actualFR)
        ) {
            assertEquals(expectedBR.readLine(), actualBR.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}