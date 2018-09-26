package com.kado.useralert;

import com.kado.useralert.model.Commands;
import com.kado.useralert.repo.CommandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author ahmeddammak
 */
@RestController
public class CommandsController {

    @Autowired
    private CommandsRepository commandsRepository ;

    @RequestMapping(value = "/getCommands", method = RequestMethod.GET, produces = "application/json")
    public List<Commands> getAllCommands() {
        return commandsRepository.getAllCommands() ;
    }
}
