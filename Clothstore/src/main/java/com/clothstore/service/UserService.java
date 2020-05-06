package com.clothstore.service;

import com.clothstore.domain.User;
import com.clothstore.domain.security.PasswordResetToken;

public interface UserService {
	
	PasswordResetToken getPasswordResetToken(final String Token);
	
	void createPasswordResetTokenForUser(final User user,final String token);
	
	User findByUsername(String username);
	
	User findByEmail(String email);

}
