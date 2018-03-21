package com.userinfo.code;


import java.util.List;
import java.util.Optional;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, String>{
	Optional<Users> findById(String id);
	List<Users> findByAgeLessThan(int age);
	
	@Query(value = "{firstName:?0}")
	List<Users> findByName(String name);
}
