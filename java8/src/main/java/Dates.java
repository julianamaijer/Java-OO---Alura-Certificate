import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate olympics = LocalDate.of(2022, Month.JUNE, 5);

        int years = olympics.getYear() - today.getYear();

        System.out.println(years);

        Period period = Period.between(today, olympics);

        LocalDate nextOlympics = olympics.plusYears(4);
        System.out.println(nextOlympics);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valueFormated = nextOlympics.format(formatter);
        System.out.println(valueFormated);

        DateTimeFormatter formatterWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatterWithHours));

        LocalTime breakTime = LocalTime.of(15,30);
        System.out.println(breakTime);

        
    }
}
