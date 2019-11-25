package com.ankamma.batch.batch;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.ankamma.batch.model.User;

@Component
public class UserProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		user.setId(1L);
		user.setDate(new Date());
		return user;
	}
}
