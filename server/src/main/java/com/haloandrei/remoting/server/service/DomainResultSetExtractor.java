package com.haloandrei.remoting.server.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;

import com.haloandrei.remoting.common.domain.Movie;

public class DomainResultSetExtractor implements ResultSetExtractor {
//String type, String name, int rating, int price
    @Override
    public Object extractData(ResultSet rs) throws SQLException {
        Movie movie = new Movie();
        movie.setId(Long.parseLong((rs.getString(1))));
        movie.setName(rs.getString(2));
        movie.setType(rs.getString(3));
        movie.setRating(Integer.parseInt((rs.getString(4))));
        movie.setPrice(Integer.parseInt((rs.getString(5))));
        return movie;
    }

}
