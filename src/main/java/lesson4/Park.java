package lesson4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void infoAboutAttractions() {
        System.out.printf("Добро пожаловать в Парк %s!\n", parkName);
        for (Attraction at : attractions) {
            at.info();
        }
    }

    public class Attraction {
        private String attractionName;
        private LocalTime timeStart;
        private LocalTime timeEnd;
        private int ticketCost;

        public Attraction(String attractionName, LocalTime timeStart, LocalTime timeEnd, int ticketCost) {
            this.attractionName = attractionName;
            this.timeStart = timeStart;
            this.timeEnd = timeEnd;
            this.ticketCost = ticketCost;
        }

        public void info() {
            String text = String.format("Аттракицон %s работает с %s до %s. Стоимость билета %d рублей.",
                    attractionName, timeStart, timeEnd, ticketCost);
            System.out.println(text);
        }
    }
}
