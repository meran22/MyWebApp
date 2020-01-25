package com.bkt.Entites;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="login")
public @Data class UserEntity 
{
	@Id
	@Column
	private String name;
	@Column(name="PHONE_NO")
	private String phoneNo;
	@Column
	private String email;
	@Column(name="DEPARTMENT_CD")
	private String department;
	
	
}
