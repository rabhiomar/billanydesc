package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class friendService {
@Autowired
private frienRepository Repository;
	
	public List<friend>getfriends() {
		
		return Repository.findAll();
	}
	
	public void addfrienf(friend friendd) {
		 Repository.save(friendd);
		
	}
	public void updatefriend(friend friendd) {
		
		 Repository.save(friendd);

	}
	public  void deletefriend(Integer id) {
		
		 Repository.deleteById(id);;

	}
	
	
	
}
