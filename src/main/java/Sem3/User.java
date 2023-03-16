package Sem3;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    private Personal personal = new Personal();

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return "User{" +
                "firstName: " + firstName +
                 ", lastName: " + lastName +
                 ", Age: " + age + "}";
    }

    @Override
    public int compareTo(User o) {
        int compareFirstName = this.firstName.compareTo(o.firstName);
        if (compareFirstName !=0) {
            return compareFirstName;
        }

        int compareLastName = this.lastName.compareTo(o.lastName);
        if (compareLastName!=0){
            return compareLastName;
        }

        return this.age - o.age;
    }
}
