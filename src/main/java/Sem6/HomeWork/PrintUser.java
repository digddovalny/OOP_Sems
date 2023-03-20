package Sem6.HomeWork;

public class PrintUser implements Printable{
    private User user;

    public PrintUser(User user) {
        this.user = user;
    }

    public void print(){
        System.out.println("Print user: " + user.getName());
    }
}
