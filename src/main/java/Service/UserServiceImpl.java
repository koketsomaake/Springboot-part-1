package Service;

import Intefaces.FakeRepoInterface;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private FakeRepoInterface fakeRepoInterface;


    public UserServiceImpl(FakeRepoInterface fakeRepoInterface) {
        this.fakeRepoInterface = fakeRepoInterface;
    }


    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepoInterface.insertUser(id,name,surname);
    }

    @Override
    public void removeUser(long id) {
        fakeRepoInterface.deleteUser(id);

    }

    @Override
    public void getUser(long id) {
        fakeRepoInterface.findUserById(id);
    }
}