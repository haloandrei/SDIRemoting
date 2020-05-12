package com.haloandrei.remoting.server.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.haloandrei.remoting.server.service.MovieRowMapper;
import com.haloandrei.remoting.common.domain.Movie;

public class SQLDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource ds) {
        dataSource = ds;
    }

    public void create(Long id, String name, String type, int rating, int price) {
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update("INSERT INTO movie (id,name,type,rating,price) VALUES(?,?,?,?,?)",
                new Object[] { id,name,type,rating,price });
    }

    public List<Movie> select(Long id, String name, String type, int rating, int price) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select
                .query(
                        "select  id,name,type,rating,price from movie where id = ? AND name= ? AND type= ? AND rating= ? AND price= ?",
                        new Object[] { id,name,type,rating,price },
                        new MovieRowMapper());
    }

    public List<Movie> selectAll() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("select id,name,type,rating,price from movie",
                new MovieRowMapper());
    }

    public void deleteAll() {
        JdbcTemplate delete = new JdbcTemplate(dataSource);
        delete.update("DELETE from movie");
    }

    public void delete(Long id) {
        JdbcTemplate delete = new JdbcTemplate(dataSource);
        delete.update("DELETE from movie where id= ?",
                new Object[] { id });
    }

}