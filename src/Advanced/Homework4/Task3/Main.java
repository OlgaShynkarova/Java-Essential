package Advanced.Homework4.Task3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String dateOfBirth = "2015-02-06 06:55:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime birthDateTime = LocalDateTime.parse(dateOfBirth, formatter);
        String result = getTimePassed(birthDateTime);
        System.out.println(result);
    }
    public static String getTimePassed(LocalDateTime fromDateTime) {
        LocalDateTime toDateTime = LocalDateTime.now();
        System.out.println("Now is: " + toDateTime);
        Period period = Period.between(fromDateTime.toLocalDate(), toDateTime.toLocalDate());
        LocalDateTime tempDateTime = fromDateTime.plusYears(period.getYears())
                .plusMonths(period.getMonths())
                .plusDays(period.getDays());
        Duration duration = Duration.between(tempDateTime, toDateTime);
        long seconds = duration.toSecondsPart();
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        String time;
        return time = "Now you are " + period.getYears() + " years, "
                + period.getMonths() + " months, " + period.getDays() + " days, "
                + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.";
    }
}