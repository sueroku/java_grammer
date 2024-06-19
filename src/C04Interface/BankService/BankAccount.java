package C04Interface.BankService;

// 작업의 대상이 되는 객체 즉, Entity
public class BankAccount{
    static long static_id =0L;
    private long id;
    private String accountNumber;
    private int balance;
    BankAccount(String accountNumber){
        static_id +=1 ;
        id = static_id;
        this.accountNumber = accountNumber;
    }

    public void updateBalance(int balance){
        this.balance += balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public Long getId() {
        return id;
    }
}



//package C04Interface.BankService;
//
//// 개발시 몇가지 요소
//// entity (작업주체)
//// service(기능)
//// controller(사용자 최접점)
//
//
//// 작업의 대상이 되는 객체, 즉 ENTITY
//public class BankAccount{
//    static long static_id =0L;
//    private long id;
//    private String accountNumber;
//    private int balance;
//    BankAccount(String accountNumber){
//        static_id +=1 ;
//        id = static_id;
//        this.accountNumber = accountNumber;
//    }
//
//    public void updateBalance(int money){
//        this.balance = money;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    public int getBalance() {
//        return balance;
//    }
//
//    public Long getId() {
//        return id;
//    }
//}