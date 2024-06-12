package C02ClassBasic;

import java.util.Locale;

public class C0205Constructor {
    public static void main(String[] args) {
//        Calendar c1 = new Calendar("2024","07","15");
////        c1.setYear("2024");
////        c1.setMonth("07");
////        c1.setDay("15");
//        System.out.println(c1.getYear()+"년 "+c1.getMonth()+"월 "+c1.getDay()+"일");

//        BankAccount acc = new BankAccount(1234);
//        acc.deposit(30000);
//        acc.withdraw(50000);
//        acc.withdraw(25000);

    }
}
//
//// 내부 클래스 calendar
//// 객체변수 : year month day 모두 String
//// 메서드 getter setter 정의
//
//class Calendar {
//    private String year;
//    private String month;
//    private String day;
//
////    생성자 : 클래스명과 동일 초기화하고 싶은 변수명 나열
////    별도의 생성자를 만들경우, 초기 생성자를 따로 선언 필요
////    별도의 생성자가 없는 경우, 내부에 초기 생성자가 존재
//    Calendar(String year, String month, String day){
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
////    같은 클래스내의 다른 생성자 호출시 this() 사용
//    Calendar(String year, String month){
//        this(year,month,null);
//    }
//
//    Calendar(){
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//// setter는 잘 안쓰인다 의도가 잘 안보여서.. update메서드로 만든다.
////    public void setYear(String year) {
////        this.year = year;
////    }
//
//    public String getMonth() {
//        return month;
//    }
//
////    public void setMonth(String month) {
////        this.month = month;
////    }
//
//    public String getDay() {
//        return day;
//    }
//
////    public void setDay(String day) {
////        this.day = day;
////    }
//}

//class BankService{
//
//}

//class BankAccount{
//    int accountNumber;
//    int balance;
//
//    BankAccount(int accountNumber){
//        this.accountNumber = accountNumber;
//    }
//    BankAccount(){}
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void deposit(int balance){
//        this.balance += balance;
//        System.out.println(balance+"원이 입금되었습니다.");
//    }
//    public void withdraw(int money){
//        if(money>this.balance){
//            System.out.println("잔액이 부족합니다.");
//        }else {
//            this.balance -= money;
//            System.out.println(money+"원이 출금되었습니다.");
//        }
//    }
//}