package ua.lviv.iot.ProjectPoolSports.writer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import ua.lviv.iot.ProjectPoolSports.SportTypes.WaterSports;

import java.io.FileWriter;
import java.util.List;

@SuppressFBWarnings("DM_DEFAULT_ENCODING")
public class WaterSportsWriter {
    public void writeToFile(final List<WaterSports> waterSportsList) {
        try (FileWriter writer = new FileWriter("result.csv")) {
            writer.write(waterSportsList.get(0).getHeaders() + "\r\n");
            for (WaterSports w : waterSportsList) {
                writer.write(w.toCSV() + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
