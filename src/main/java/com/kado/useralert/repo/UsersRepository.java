package com.kado.useralert.repo;

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

@Repository
public class UsersRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        String sql = "SELECT * FROM T_USERS";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    public Integer insertUser(final User user) {
        final String sql = "insert into T_USERS (seasame_id,email,windows_id,indiana_id) values (?,?,?,?) ;";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(sql, new String[] {"user_id"});
                        ps.setString(1, user.getSeasameId());
                        ps.setString(2, user.getEmail());
                        ps.setString(3, user.getWindowsId());
                        ps.setString(4, user.getIndianaId());
                        return ps;
                    }
                },
                keyHolder);
        return (Integer) keyHolder.getKey() ;
    }
}
