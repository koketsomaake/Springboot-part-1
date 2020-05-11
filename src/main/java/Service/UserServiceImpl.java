package Service;

import Intefaces.FakeRepo;
import Intefaces.UserService;

import org.springframework.beans.factory.annotation.Autowired;



public class UserServiceImpl implements UserService {

    @Autowired
    FakeRepo fakeRepo;

    @Override
    public void addUser(String name, String surname) {
        System.out.println("Hello " + fakeRepo.insertUser(1,name,surname));
    }

    @Override
    public void removeUser(long Id) {
        fakeRepo.deleteUser(Id);
        System.out.println(fakeRepo.deleteUser(Id));

    }

    @Override
    public void getUser(long Id) {
        System.out.println("Hello " + fakeRepo.findUserById(Id));
    }
}
