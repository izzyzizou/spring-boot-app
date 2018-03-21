package com.userinfo;

import java.util.List;

//import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dbSeeder implements CommandLineRunner{
	private UserRepository userRepository;
	
	public dbSeeder(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void run(String... strings) throws Exception{
		Users user1 = new Users(
				"Georgia",
				"Nguyen",
				"MiddleName",
				"https://randomuser.me/api/portraits/women/75.jpg",
				"384-352-2351",
				65
		);
		Users user2 = new Users(
				"Emily",
				"Edwards",
				"MiddleName",
				"https://randomuser.me/api/portraits/women/33.jpg",
				"384-352-2351",
				35
		);
		Users user3 = new Users(
				"Dave",
				"Adams",
				"MiddleName",
				"https://randomuser.me/api/portraits/men/97.jpg",
				"384-352-2351",
				25
		);
		
		this.userRepository.deleteAll();
		
		List<Users> users = Arrays.asList(user1, user2, user3);
		
		this.userRepository.saveAll(users);
	}
	
	
}
