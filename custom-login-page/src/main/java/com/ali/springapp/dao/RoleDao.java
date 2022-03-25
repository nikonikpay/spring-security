package com.ali.springapp.dao;


import com.ali.springapp.entity.Role;
public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
