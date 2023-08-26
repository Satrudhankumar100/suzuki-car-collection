package com.suzuki.spring.suzukicars.altovarient.dao;

import com.suzuki.spring.suzukicars.altovarient.dto.AltoVarient;

public interface AltoVarientDao {
	int create(AltoVarient altoVarient);
	int delete(AltoVarient altoVarient);
	int update(AltoVarient altoVarient);
	AltoVarient read(String model);
}
