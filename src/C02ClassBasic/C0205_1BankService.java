package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class C0205_1BankService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BankAccount acc1 = new BankAccount("1234");
//        acc1.deposit(30000);
////        acc1.withdraw(50000);
////        acc1.withdraw(25000);
//        BankAccount acc2 = new BankAccount("5678");
//        acc2.deposit(30000);
//        acc2.transfer(acc1, 20000); // 현재로서는 이게 최선
////        System.out.println(acc1.getBalance());
////        System.out.println(acc2.getBalance());

        List<BankAccount> bankAccountList = new ArrayList<>();

        loop1:
        while(true){
            System.out.println("--------------------------------");
            System.out.println("서비스 이용을 위해 번호를 입력하십시오");
            System.out.println("1. 계좌 개설 2. 입금 3. 출금 4. 계좌 송금 5. 종료");
            String account = null;
            String account2 =null;
            int money = 0;
            BankAccount acc1 = null;
            BankAccount acc2 = null;
            switch (Integer.parseInt(br.readLine())){
                case 1:
                    System.out.println("계좌를 계설합니다. 계좌번호를 입력해주십시오");
                    bankAccountList.add(new BankAccount(br.readLine()));
                    break;
                case 2:
                    System.out.println("입금할 계좌를 입력해주십시오");
                    account = br.readLine();
                    System.out.println("입금할 금액을 입력해주십시오");
                    money = Integer.parseInt(br.readLine());
                    for (BankAccount value : bankAccountList) {
                        if (account.equals(value.getAccountNumber())) {
                            acc1=value;
                            acc1.deposit(money);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("출금할 계좌를 입력해주십시오");
                    account = br.readLine();
                    System.out.println("출금할 금액을 입력해주십시오");
                    money = Integer.parseInt(br.readLine());
                    for(int i=0;i<bankAccountList.size();i++){
                        if(account.equals(bankAccountList.get(i).getAccountNumber())){
                            acc1 = bankAccountList.get(i);
                            acc1.withdraw(money);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("출금할 계좌를 입력해주십시오");
                    account = br.readLine();
                    System.out.println("입금할 계좌를 입력해주십시오");
                    account2 = br.readLine();
                    System.out.println("송금할 금액을 입력해주십시오");
                    money = Integer.parseInt(br.readLine());
//                    BankAccount myAccount = null;
//                    BankAccount yourAccount = null; // 강사님 if-elseif(case마다) 변수 이름 새로 만들어줌.
                    for (BankAccount bankAccount : bankAccountList) {
                        if (account.equals(bankAccount.getAccountNumber())) {
                            acc1 = bankAccount;
                        }
                        if (account2.equals(bankAccount.getAccountNumber())) {
                            acc2 = bankAccount;
                        }
                    }
                    if (acc1 != null && acc2!=null) {
                        acc1.transfer(acc2, money);
                    }
                    break;
                default:
                    break loop1;

            }
        }

    }
}
class BankAccount{
    private String accountNumber;
    private int balance;

    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }
    BankAccount(){}
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int money){
        this.balance += money;
        System.out.println(money+"원이 입금되었습니다.");
        System.out.println("현재 계좌" +this.accountNumber +"의 잔액은 "+this.balance+"원 입니다.");
    }
    public void withdraw(int money){
        if(money>this.balance){
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 계좌" +this.accountNumber +"의 잔액은 "+this.balance+"원 입니다.");
        }else {
            this.balance -= money;
            System.out.println(money+"원이 출금되었습니다.");
            System.out.println("현재 계좌" +this.accountNumber +"의잔액은 "+this.balance+"원 입니다.");
        }
    }
    public void transfer(BankAccount acc, int money){
        if(money>this.balance){
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 계좌" +this.accountNumber +"의잔액은 "+this.balance+"원 입니다.");
        }else {
            this.balance-=money;
            acc.deposit(money);
            System.out.println(money+"원이 송금되었습니다.");
            System.out.println("현재 계좌" +this.accountNumber +"의잔액은 "+this.balance+"원 입니다.");
        }
    }
}
