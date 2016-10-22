package com.geeksolutions.pos.dao;

import java.util.List;

import com.geeksolutions.pos.model.UserProfile;

public interface UserProfileDao {
	
	List<UserProfile> findAll();
    
    UserProfile findByType(String type);
     
    UserProfile findById(int id);

}
