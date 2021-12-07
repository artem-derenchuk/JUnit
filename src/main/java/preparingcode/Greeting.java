package preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Greeting {
    public static String[] knownNames = {"Artem", "Dasha", "Andrey", "Diana", "Gareth", "Eric", "Martin"};
    public static String[] specialNames = {"Eric", "Martin", "Gareth", "Ludmila", "Kriss"};


    public String greetUser(String name) {
        String greetUser = "";
        if (Arrays.stream(knownNames).anyMatch(name::equals)) {
            greetUser += "I know you, " + name + ".";
            if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greetUser += "You're even on our VIP list!";
            }
        } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
            greetUser += "I don't know you, " + name + ". But you are on our VIP list!";
        } else {
            greetUser += "stranger";
        }
        return greetUser;
    }

    public String greetDay(LocalDateTime dateTime) {
        String greetDayPart = "";
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            greetDayPart = "Good night, ";
        }
        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            greetDayPart = "Good morning, ";
        }
        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            greetDayPart = "Good afternoon, ";
        }
        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            greetDayPart = "Good evening, ";
        }
        return greetDayPart;
    }
//    public String greetUser(String name) {
//        LocalDateTime dateTime = LocalDateTime.now();
//        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
//            greeting = "Good night, ";
//            if (Arrays.stream(knownNames).anyMatch(name::equals)) {
//                greeting += "I know you, " + name + ".";
//                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                    greeting += "You're even on our VIP list!";
//                }
//
//            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                greeting += "I don't know you, " + name + ". But you are on our VIP list!";
//            } else {
//                greeting += "stranger";
//            }
//        }
//        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
//            greeting = "Good morning, ";
//            if (Arrays.stream(knownNames).anyMatch(name::equals)) {
//                greeting += "I know you, " + name + ".";
//                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                    greeting += "You're even on our VIP list!";
//                }
//
//            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                greeting += "I don't know you, " + name + ". But you are on our VIP list!";
//            } else {
//                greeting += "stranger";
//            }
//        }
//        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
//            greeting = "Good afternoon, ";
//            if (Arrays.stream(knownNames).anyMatch(name::equals)) {
//                greeting += "I know you, " + name + ".";
//                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                    greeting += "You're even on our VIP list!";
//                }
//
//            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                greeting += "I don't know you, " + name + ". But you are on our VIP list!";
//            } else {
//                greeting += "stranger";
//            }
//        }
//        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
//            greeting = "Good evening, ";
//            if (Arrays.stream(knownNames).anyMatch(name::equals)) {
//                greeting += "I know you, " + name + ".";
//                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                    greeting += "You're even on our VIP list!";
//                }
//
//            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
//                greeting += "I don't know you, " + name + ". But you are on our VIP list!";
//            } else {
//                greeting += "stranger";
//            }
//        }
//        return greeting;
//    }
}
