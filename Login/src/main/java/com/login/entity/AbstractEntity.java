package com.login.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
