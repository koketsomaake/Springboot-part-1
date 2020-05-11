package Intefaces;


import Models.User;

public interface FakeRepoInterface {
    User insertUser(long id, String name, String surname);

    void findUserById(long id);

    void deleteUser(long id);
}