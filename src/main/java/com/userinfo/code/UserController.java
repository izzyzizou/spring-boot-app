package com.userinfo.code;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	//Get All Data
	@GetMapping("/details")
	public List<Users> getUsers(){
		List<Users> users = this.userRepository.findAll();	
		return users;
	}
	//Insert a new data without mongo_id, /user path
	@PutMapping
	public void insert(@RequestBody Users user) {
		this.userRepository.insert(user);
	}
	
	//Add changes to existing data with mongo_id
	@PostMapping
	public void update(@RequestBody Users user) {
		this.userRepository.save(user);
	}
	
	//Deleting record using mongo_id, /user/id
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.userRepository.deleteById(id);
	}
	
	//Get data using mongo_id
	@GetMapping("/{id}")
	public Optional<Users> getById(@PathVariable("id") String id) {
		Optional<Users> user = this.userRepository.findById(id); //findById
		return user;
	}
	
	//filter age using findBy{Age}LessThan 
	@GetMapping("/age/{age}")
	public List<Users> getByAge(@PathVariable("age") int age){
		List<Users> user = this.userRepository.findByAgeLessThan(age); //findByLessThan
		return user;
	}
	
	//filter name using findBy{Name}
	@GetMapping("/name/{firstName}")
	public List<Users> getByName(@PathVariable("firstName") String name){
		List<Users> user = this.userRepository.findByName(name); //findByName
		return user;
	}
	@GetMapping("/address/{dist}")
	public List<Users> getByDist(@PathVariable("dist") String dist){
		List<Users> address = this.userRepository.findByDist(dist);
		return address;
	}
}
