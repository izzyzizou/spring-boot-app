package com.userinfo.code;

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
		Address primaryAddress1 = new Address("PA", "2706 Davison Ave", "Auburn Hills", "MI");
		Address secondaryAddress1 = new Address("SA", "501 Edgecombe Dr", "Milford", "OH");
		Address officeAddress1 = new Address("OA","1075 W Entrance Dr", "Auburn Hills", "MI");
		CombinedAddress combinedAddress = new CombinedAddress(primaryAddress1, secondaryAddress1, officeAddress1);
		Users user1 = new Users(
				"Georgia",
				"Nguyen",
				"MiddleName",
				"https://randomuser.me/api/portraits/women/75.jpg",
				"384-352-2351",
				65,
				combinedAddress
		);
		Users user2 = new Users(
				"Emily",
				"Edwards",
				"MiddleName",
				"https://randomuser.me/api/portraits/women/33.jpg",
				"384-352-2351",
				35,
				combinedAddress
		);
		Users user3 = new Users(
				"Dave",
				"Adams",
				"MiddleName",
				"https://randomuser.me/api/portraits/men/97.jpg",
				"384-352-2351",
				25,
				combinedAddress
		);
		this.userRepository.deleteAll();
		List<Users> users = Arrays.asList(user1, user2, user3);
		this.userRepository.saveAll(users);
	}
	
	
}