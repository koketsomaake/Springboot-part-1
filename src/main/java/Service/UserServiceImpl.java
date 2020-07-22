package Service;

import Intefaces.FakeRepo;
import Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private final FakeRepo fakeRepo ;

    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }
    @Override
    public String addUser(long id, String name, String surname) {
        fakeRepo.insertUser(id,name,surname);
        return User.getName("KTSTHEDJ ") + "ENTERED";
    }
    @Override
    public String removeUser(long id) {
        fakeRepo.deleteUser(id);
        return User.getName("KTsTHEdj ") + "removed";
    }
    @Override
    public String getUser(long id) {
        fakeRepo.findUserById(id);
        return "Hello " + User.getName("ktsthedj");
    }
}