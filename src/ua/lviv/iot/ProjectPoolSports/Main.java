package ua.lviv.iot.ProjectPoolSports;

import ua.lviv.iot.ProjectPoolSports.SportTypes.*;
import ua.lviv.iot.ProjectPoolSports.manager.PoolManager;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	Swimming swimming1 = new Swimming("Freestyle at 10am", 60, 6, 4, 60);
    Hydrofoil hydrofoil1 = new Hydrofoil("Hydrofoiling at 3pm", 20, 3, 3, 350);
    Flyboarding flyboarding1 = new Flyboarding("Flyboarding", 8, 1, 0, 500);
    Freediving freediving1 = new Freediving("Freediving at 12am", 60, 5, 7, 110);

    System.out.println(swimming1);
    swimming1.addNewParticipants(2);
    System.out.println(swimming1);

    List<WaterSports> sportsList = new LinkedList<>();
    sportsList.add(swimming1);
    sportsList.add(hydrofoil1);
    sportsList.add(flyboarding1);
    sportsList.add(freediving1);

    PoolManager undrownedManager = new PoolManager(sportsList);

    System.out.println("\n// By ascending price");
    undrownedManager.sortSportsByAscendingPrice()
            .forEach(sport -> System.out.println("| " + sport.getSessionName() + " "
                    + sport.getPricePerPersonInUAH()));

    System.out.println("\n// By descending price");
    undrownedManager.sortSportsByDescendingPrice()
            .forEach(sport -> System.out.println("| " + sport.getSessionName() + " "
                    + sport.getPricePerPersonInUAH()));

    System.out.println("\n// Minimum participants is less than 5");
    undrownedManager.findByMinimumParticipants()
            .forEach(sport -> System.out.println("| " + sport.getSessionName()));
    }
}
