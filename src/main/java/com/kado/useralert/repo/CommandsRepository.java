package com.kado.useralert.repo;

import com.google.common.collect.Lists;
import com.kado.useralert.model.Commands;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author ahmeddammak
 */
@Repository
public class CommandsRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Commands> getAllCommands() {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from T_COMMANDS", new Object[] { }) ;
        return buildCommands(rows) ;
    }

    private List<Commands> buildCommands(List<Map<String, Object>> rows) {
        List<Commands> commands = Lists.newArrayList() ;
        for (Map<String, Object> row : rows) {
            Commands command = new Commands() ;
            command.setCommandId((Integer) row.get("command_id"));
            command.setChaseTime((Integer) row.get("chase_time"));
            command.setCommandName((String)row.get("command_name"));
            command.setCommandOwner((String) row.get("command_owner"));
            command.setDayOfWeek(parseDaysOfWeek((String) row.get("day_of_week")));
            command.setChaseGroupId((String) row.get("chase_group_id"));
            command.setProcessType((String) row.get("process_type"));
            commands.add(command) ;
        }
        return commands;
    }

    private List<Integer> parseDaysOfWeek(String day_of_week) {
        return Arrays.asList(day_of_week.split(",")).stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
