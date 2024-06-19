package C08Thread;

public class Library {
    static int bookCount = 100;
//    public static void borrow() throws InterruptedException {
//    public static void borrow(){
//    syncronized 키워드를 통해서 해당 메서드에 한해서 lock 걸도록 설정
    public synchronized static void borrow(){
        if(bookCount>0){
            try {
                Thread.sleep(30);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
//            Thread.sleep(1000); // 읽고 세팅하는 사이가 짧아서 읽은 값(>0) 그대로 들고 올 수 있었는데 시간을 줘보니, 책 빌린 사람 900 명 책은 100... 이게 보인다.
            bookCount= bookCount-1; // -까지 안가냐... 본인이 읽은 값(>0) 을 가지고 들어와서 세팅하기 때문에...?? 위에 답이 있다...
            System.out.println("대출완료");
            System.out.println("남아있는 책수량은 " + bookCount);
        }else {
            System.out.println("대출불가");
        }
    }
}
