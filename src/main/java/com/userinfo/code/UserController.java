package com.userinfo.code;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@GetMapping("/details")
	public List<Users> getUsers(){
		List<Users> users = this.userRepository.findAll();	
		return users;
	}
	@PutMapping
	public void insert(@RequestBody Users user) {
		this.userRepository.insert(user);
	}
	@PostMapping
	public void update(@RequestBody Users user) {
		this.userRepository.save(user);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.userRepository.deleteById(id);
	}
	@GetMapping("/{id}")
	public Optional<Users> getById(@PathVariable("id") String id) {
		Optional<Users> user = this.userRepository.findById(id);
		return user;
	}
	@GetMapping("/filter/{age}")
	public List<Users> getByAge(@PathVariable("age") int age){
		List<Users> user = this.userRepository.findByAgeLessThan(age);
		return user;
	}
	@GetMapping("/name/{firstName}")
	public List<Users> getByName(@PathVariable("firstName") String name){
		List<Users> user = this.userRepository.findByName(name);
		return user;
	}
}
