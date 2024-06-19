package C06EtcClass;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calendar {
    public static void main(String[] args) {
////        java.util 패키지의 Calendar 클래스
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH)+1);
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c.get(Calendar.DAY_OF_WEEK));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.SECOND));

//        java.time 패키지 Local~어쩌구 클래스
//        날짜(LocalDate) - date타입, 시간(LocalTime), 날짜와시간(LocalDateTime)-datetime타입
        LocalDate  presentDate = LocalDate.now();
        System.out.println(presentDate);
        System.out.println(presentDate.getYear());
        System.out.println(presentDate.getMonth());
        System.out.println(presentDate.getDayOfMonth());
        System.out.println(presentDate.getDayOfWeek());

        LocalTime presentTIme = LocalTime.now();
        System.out.println(presentTIme);
        System.out.println(presentTIme.getHour());
        System.out.println(presentTIme.getMinute());
        System.out.println(presentTIme.getSecond());

        LocalDateTime presentDateTime = LocalDateTime.now();
        System.out.println(presentDateTime.getYear());
        System.out.println(presentDateTime.getHour());

//        임의로 특정 시간을 만들어 내고 싶을때 of 메서드 사용
        LocalDate birthday = LocalDate.of(2024,9,20);
        System.out.println(birthday.getYear());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getDayOfMonth());

        LocalTime birthTime = LocalTime.of(1998,0,20);

        LocalDateTime birth = LocalDateTime.of(2000,9,10,10,10,10);
//      매개변수로 크로노필드 enum타입을 사용하여 프로그램의 유연성 향상
        System.out.println(birth.get(ChronoField.YEAR));
        System.out.println(birth.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birth.get(ChronoField.HOUR_OF_DAY));
//        0 : 오전 1 : 오후
        System.out.println(birth.get(ChronoField.AMPM_OF_DAY));

    }
}
