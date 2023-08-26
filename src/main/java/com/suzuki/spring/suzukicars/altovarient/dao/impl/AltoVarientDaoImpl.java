package com.suzuki.spring.suzukicars.altovarient.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.suzuki.spring.suzukicars.altovarient.dao.AltoVarientDao;
import com.suzuki.spring.suzukicars.altovarient.dao.rowmapper.AltoVarientRowMapper;
import com.suzuki.spring.suzukicars.altovarient.dto.AltoVarient;

public class AltoVarientDaoImpl implements AltoVarientDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(AltoVarient altoVarient) {
		String sql = "INSERT INTO SUZUKICARS VALUES(?,?,?,?)";
		int result = jdbcTemplate.update(sql, altoVarient.getModel(), altoVarient.getColor(), altoVarient.getVersion(),
				altoVarient.getPrice());
		return result;
	}

	@Override
	public int delete(AltoVarient altoVarient) {
		String sql = "DELETE FROM SUZUKICARS WHERE MODEL=?";
		int result2 = jdbcTemplate.update(sql, altoVarient.getModel());
		return result2;
	}

	@Override
	public int update(AltoVarient altoVarient) {
		String sql = "UPDATE SUZUKICARS SET COLOR=? WHERE PRICE=?";
		int result3 = jdbcTemplate.update(sql, altoVarient.getColor(), altoVarient.getPrice());
		return result3;
	}

	@Override
	public AltoVarient read(String model) {
		String sql = "SELECT * FROM SUZUKICARS where model=?";
		AltoVarientRowMapper rowmapper = new AltoVarientRowMapper();
		AltoVarient altovarient=jdbcTemplate.queryForObject(sql, rowmapper,model);
		return altovarient;
	}

}
