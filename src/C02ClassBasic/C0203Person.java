package C02ClassBasic;

public class C0203Person {
    String name;
    private String nickname;
    String email;
    private String emails;
    int age;
    private int birth;

    public void eating(){
        System.out.println(this.name+"이 밥을 먹는다.");
    }
//    setter
    public void setNickname(String name){
        this.nickname = name;
    }
//    getter
    public String getNickname(){
        return this.nickname;
    }
    public void doing(){
        System.out.println(this.nickname+"이 활동을 한다.");
    }


    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
