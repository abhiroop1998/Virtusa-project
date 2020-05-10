package com.clothstore.service;

import java.util.Set;

import com.clothstore.domain.User;
import com.clothstore.domain.security.PasswordResetToken;
import com.clothstore.domain.security.UserRole;

public interface UserService {
	
	PasswordResetToken getPasswordResetToken(final String Token);
	
	void createPasswordResetTokenForUser(final User user,final String token);
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	User createUser(User user, Set<UserRole> userRoles) throws Exception;

}
