package by.itstep.myapp.controller;

import by.itstep.myapp.model.User;
import by.itstep.myapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserRepository repo;

    @GetMapping(path = "/insert")
    public @ResponseBody String insert(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email,@RequestParam String password, @RequestParam Long date) {
        User user = new User(firstName, lastName, email, password, date);
        repo.save(user);
        return "INSERTED";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> showAll() {
        List<User> users = repo.findAll();
        return users;
    }

}
