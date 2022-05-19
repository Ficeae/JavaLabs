package ua.lviv.iot.ProjectPoolSports.manager;

import ua.lviv.iot.ProjectPoolSports.SportTypes.WaterSports;

import java.util.List;
import java.util.stream.Collectors;

public class PoolManager {

    private List<WaterSports> waterSports;

    public PoolManager(List<WaterSports> waterSports) {
        this.waterSports = waterSports;
    }

    public List<WaterSports> sortSportsByAscendingPrice() {
        List <WaterSports> listByAscending = this.waterSports;
        listByAscending.sort((s1, s2) -> {
            return Float.compare(s1.getPricePerPersonInUAH(), s2.getPricePerPersonInUAH());
        });
        return listByAscending;
    }

    public List<WaterSports> sortSportsByDescendingPrice() {
        List <WaterSports> listByDescending = this.waterSports;
        listByDescending.sort((s1, s2) -> {
            return -Float.compare(s1.getPricePerPersonInUAH(), s2.getPricePerPersonInUAH());
        });
        return listByDescending;
    }

    public List<WaterSports> findByMinimumParticipants() {
        return waterSports.stream()
                .filter(sport -> sport.getMinimumNumberOfParticipants() < 5)
                .collect(Collectors.toList());
    }
}
