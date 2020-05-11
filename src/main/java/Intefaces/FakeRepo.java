package Intefaces;

import Models.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

@Repository
public class FakeRepo implements FakeRepoInterface{


    private static Map<String, User> database;

    static {
        database = new HashMap<String, User>();{
            {
            put(1, new User(1, "koketso", "Maake"));
        }

        }
    }

    @Override
    public User insertUser(long id, String name, String surname) {
        return (User) this.database.values();
    }

    @Override
    public void findUserById(long id) {
        database.get((int) id);
    }

    @Override
    public void deleteUser(long id) {
        database.remove(id);
    }

}
