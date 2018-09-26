package com.kado.useralert;

import com.kado.useralert.model.SingleUserAlerts;
import com.kado.useralert.model.User;
import com.kado.useralert.repo.SingleUserAlertsRepository;
import com.kado.useralert.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author ahmeddammak
 */
@RestController
public class UserController {

    @Autowired
    private UsersRepository usersRepository ;

    @Autowired
    private SingleUserAlertsRepository singleUserAlertsRepository ;


    @RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = "application/json")
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/getAllSingleUsersAlert", method = RequestMethod.GET, produces = "application/json")
    public List<SingleUserAlerts> getAllSingleUsersAlert() {
        return singleUserAlertsRepository.findAll();
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Integer insertUser(@RequestBody User user) {
        return usersRepository.insertUser(user);
    }


    @RequestMapping(value = "/insertSingleUserAlert", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public void insertSingleUserAlert(@RequestBody SingleUserAlerts user) {
        if (isUserAlreadyRegistered(user)) {
            return ;
        }
        singleUserAlertsRepository.insertSingleUserAlert(user);
    }

    private boolean isUserAlreadyRegistered(SingleUserAlerts user) {
        return getAllSingleUsersAlert().stream().filter(i -> i.getSeasameId().equals(user.getSeasameId())).findAny().isPresent() ;
    }

}
