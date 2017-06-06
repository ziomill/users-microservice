package it.millsoft.ms.users.service.impl;

import it.millsoft.ms.users.dto.User;
import it.millsoft.ms.users.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by a.benvenuto on 23/03/2017.
 */
@RestController
public class UserService implements IUserService
{

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private static Map<String,User> users;
    static
    {
        mockUsers();
    }

    @Override
    @RequestMapping(value = "/ping",method = RequestMethod.GET)
    public String ping() {
        return "pong";
    }

    @Override
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "email") String email)
    {
        User user = users.get(email);
        LOGGER.info(user.toString());
        return user;
    }

    @Override
    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    public Set<User> getUsers() {
        return new HashSet<User>(users.values());
    }

    private static void mockUsers()
    {
        User user1 = new User();
        user1.setId(1);
        user1.setName("Antonio");
        user1.setSurname("Benvenuto");
        user1.setTaxCode("BNVNTN83T27A717X");
        user1.setEmail("ant.benvenuto@gmail.com");

        User user2 = new User();
        user2.setId(2);
        user2.setName("Lorenzo");
        user2.setSurname("Zerillo");
        user2.setTaxCode("LRZZLZ56T34A231C");
        user2.setEmail("lor.zerillo@gmail.com");

        User user3 = new User();
        user3.setId(3);
        user3.setName("Antonella");
        user3.setSurname("Falivena");
        user3.setTaxCode("FLVNTN89A34A342D");
        user3.setEmail("ant.falivena@gmail.com");

        users = new HashMap<String, User>();
        users.put(user1.getEmail(),user1);
        users.put(user2.getEmail(),user2);
        users.put(user3.getEmail(),user3);
    }
}
