package Sem3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Igor","Kolisnichenko",22);
        User user2 = new User("Vasya","Gelakov",54);
        User user3 = new User("Egor","Kreed",12);
        User user4 = new User("Egor","Kreed",30);
        User user5 = new User("Anton","Gelakov",16);

        Personal personal = new Personal(List.of(user1, user2, user3, user4, user5));
//
//        for (User user: personal){
//            System.out.println(user);
//        }

        List<User> users = personal.toList();
        Collections.sort(users);
//        for (User user: users){
//            System.out.println(user);
//        }

        User boss = new User("Ivan","Ivanov",50);
        User cto = new User("Bill", "Black", 44);
        User ceo = new User("John", "Travolta", 34);
        User manager1 = new User("Jane","Foster", 38);
        User manager2 = new User("Clara","Foster", 39);
        User manager3 = new User("Maxim","Lavrova", 24);

        Personal managers1 = new Personal(List.of(manager1, manager2));
        Personal managers2 = new Personal(List.of(manager3));
        Personal chiefs = new Personal(List.of(cto,ceo));
        boss.setPersonal(chiefs);
        cto.setPersonal(managers1);
        ceo.setPersonal(managers2);

        Company company = new Company(boss);
        for (User user: company){
            System.out.println(user);
        }

    }
}
