package it.millsoft.ms.users.service;

import it.millsoft.ms.users.dto.User;

import java.util.Set;

/**
 * Created by a.benvenuto on 23/03/2017.
 */
public interface IUserService {

    String ping();
    User getUser(String email);
    Set<User> getUsers();

}
