public class Member extends Person {

    private String signupDate;

    public Member(String name, String id, String address, String signupDate){
        super(name, id, address);
        this.signupDate = signupDate;
    }
}
