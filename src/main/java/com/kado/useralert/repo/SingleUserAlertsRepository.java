package com.kado.useralert.repo;

import com.kado.useralert.model.SingleUserAlerts;
import com.kado.useralert.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ahmeddammak
 */
@Repository
public class SingleUserAlertsRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<SingleUserAlerts> findAll() {
        String sql = "SELECT * FROM T_USERS_ALERTS";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<SingleUserAlerts>(SingleUserAlerts.class));
    }

    public void insertSingleUserAlert(final SingleUserAlerts user) {
        final String sql = "insert into T_USERS_ALERTS (seasame_id,chase_group_id,chase_time) values (?,?,?) ;";
        jdbcTemplate.update(sql, user.getSeasameId(),user.getChaseGroupId(),String.valueOf(user.getChaseTime())) ;
    }
}
