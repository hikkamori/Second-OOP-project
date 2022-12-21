import Exceptions.CheckedTimeException;
import Exceptions.UncheckedHouseOverflowException;
import Persons.*;
import Places.*;
import Enums.*;
import Stuff.Harp;
import Stuff.Reason;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static class TimeResolver {
        public static String resolve(LocalTime localtime) {
            enum DayTime {
                morning,
                day,
                evening,
                night
            }


            switch (localtime.getHour()) {
                case 17, 18, 19, 20, 21, 22 -> {
                    return DayTime.evening.name();
                }
                case 23, 0, 1, 2, 3, 4, 5 -> {
                    return DayTime.night.name();
                }
                case 6, 7, 8, 9, 10, 11 -> {
                    return DayTime.morning.name();
                }
                default -> {
                    return DayTime.day.name();
                }
            }
        }
    }

    public static void main(String[] args) throws CheckedTimeException {
        Babies babies = new Babies();
        Viewer viewer = new Viewer();
        Reason reason = new Reason();
        reason.setName("фруктики");
        Party party = new Party("тусовочка)");
        DandelionsField dandelionsField = new DandelionsField();
        Shurupchik shurupchik = new Shurupchik();
        Bublik bublik = new Bublik();
        Gvozdik gvozdik = new Gvozdik();
        OtherCitizens citizens = new OtherCitizens();
        UnknowingBoy unknowingBoy = new UnknowingBoy();
        City city = new City("Imaginarium", gvozdik, babies);
        Playground playground = new Playground();
        SummerHouse summerHouse = new SummerHouse();
        Musician musician1 = new Musician("виталик");
        Musician musician2 = new Musician("андрюша");
        Musician musician3 = new Musician("говношлеп");

        ArrayList<Place> map = new ArrayList<Place>() {{
            add(dandelionsField);
            add(party);
            add(playground);
            add(summerHouse);
        }};

        while (summerHouse.getVisitorsAmount() < 6) {
            try {
                summerHouse.groupVisitingOfHouse(babies, bublik, citizens, musician1, musician2, musician3);
            } catch (UncheckedHouseOverflowException exception) {
                System.out.println("Секунду...расширяем нашу беседку, чтобы вместить всех!");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }


        Harp harpp = new Harp(HarpСharacteristic.Big);
        Orchestra orchestra = new Orchestra();
        orchestra.addMusicians(musician1, musician2, musician3);
        orchestra.giveInstrument(harpp);
        orchestra.playMusic();
        unknowingBoy.go(map.get(ThreadLocalRandom.current().nextInt(0, map.size())));

        city.arrive(shurupchik);
        city.arrive(bublik);
        city.arrive(citizens);
        city.arrive(unknowingBoy);
        citizens.thank(babies, reason);
        citizens.recieveInvitation(party);
        ChillActions wayOfChill = ChillActions.sit;
        unknowingBoy.chill(wayOfChill, dandelionsField);
        viewer.conclude(unknowingBoy, wayOfChill);
        unknowingBoy.seeSomeoneCome(babies, party);
        party.attendTheParty(unknowingBoy);
        unknowingBoy.setPlace(dandelionsField);


        LocalTime localTime = LocalTime.now();
        try {
            String tt = Main.TimeResolver.resolve(localTime);
            if (tt == "evening" || tt == "night") {
                throw new CheckedTimeException("Эх, вечереет...");
            }
        } catch (CheckedTimeException exception) {
            System.out.println("Подождем, пока встанет солнышко.");
            try {
                Thread.sleep(100);
            } catch (Exception exception1) {
                exception1.initCause(exception);
                var e = new CheckedTimeException("Кто поломал время?");
                e.initCause(exception1);
                throw e;
            }
        }


    }
}

