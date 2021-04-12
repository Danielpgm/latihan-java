package date;

// import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DateTest {
    public DateTest(){
        LocalDate date= LocalDate.now();
        LocalTime time= LocalTime.now();
        LocalDateTime dt= LocalDateTime.now();

        //format date menjadi dd-MM-yyyy ("MM" penulisannya harus besar)
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = date.format(formatter);

        //Date - String
        String date2 = "08-Apr-2021";
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate convert= LocalDate.parse(date2, formatter2);

        LocalDate tomorrow= date.plusDays(2);
        LocalDate yesterday= date.minusDays(1);

        System.out.println("Hari ini tanggal: " + convert);
        System.out.println("Hari ini tanggal: " + formatted);
        System.out.println(time);
        System.out.println(dt);

        System.out.println("2 hari dari sekarang tanggal: " + tomorrow);
        System.out.println("kemarin tanggal: " + yesterday);
    }

    public static void main(String[] args) {
        new DateTest();
    }
}
