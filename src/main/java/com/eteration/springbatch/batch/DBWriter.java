package com.eteration.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eteration.springbatch.model.User;
import com.eteration.springbatch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> items) throws Exception {
		for(User user: items)
			userRepository.save(user);		
	}

}
