package com.suzuki.spring.suzukicars.altovarient.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.suzuki.spring.suzukicars.altovarient.dto.AltoVarient;

public class AltoVarientRowMapper implements RowMapper<AltoVarient> {

	@Override
	public AltoVarient mapRow(ResultSet rs, int rowNum) throws SQLException {
		AltoVarient alto = new AltoVarient();
		alto.setModel(rs.getString(1));
		alto.setColor(rs.getString(2));
		alto.setVersion(rs.getString(3));
		alto.setPrice(rs.getString(4));
		return alto;
	}

}
