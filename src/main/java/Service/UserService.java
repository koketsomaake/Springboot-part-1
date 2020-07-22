package Service;

public interface UserService {
    String addUser(long id ,String name,String surname);

    String removeUser(long id);

    String getUser(long id);
}