package Sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{

    List<User> users = new ArrayList<>();

    public Personal(List<User> users) {
        this.users = users;
    }

    public Personal() {

    }


    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }

    public List<User> toList(){
        List<User> users = new ArrayList<>();
        for(User user : this){
            users.add(user);

        }
        return users;
    }
}
