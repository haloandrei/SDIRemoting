package com.haloandrei.remoting.server.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int line) throws SQLException {
        DomainResultSetExtractor extractor = new DomainResultSetExtractor();
        return extractor.extractData(rs);
    }

}
