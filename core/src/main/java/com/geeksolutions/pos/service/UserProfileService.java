package com.geeksolutions.pos.service;

import java.util.List;

import com.geeksolutions.pos.model.UserProfile;

public interface UserProfileService {
	
	UserProfile findById(int id);
	 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();

}
