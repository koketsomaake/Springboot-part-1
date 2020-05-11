package Service;

import Intefaces.FakeRepo;


import org.springframework.beans.factory.annotation.Autowired;



public class UserServiceImpl implements UserService {

    @Autowired
    FakeRepo fakeRepo;


    @Override
    public void removeUser(long id) {
        fakeRepo.deleteUser(id);
    }

    @Override
    public void addUser(long id, String name, String surname) {

    }

    @Override
    public void getUser(long Id) {
        fakeRepo.findUserById(Id);
    }
}
