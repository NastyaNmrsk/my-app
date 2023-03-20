package by.itstep.myapp.service;

import by.itstep.myapp.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void saveUser(User user);

    void deleteUserById(long id);

    Page<User> pagination(int page, int size, String sortByField, String sortDir);

}
