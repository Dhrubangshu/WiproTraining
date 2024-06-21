package com.wipro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import com.wipro.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
