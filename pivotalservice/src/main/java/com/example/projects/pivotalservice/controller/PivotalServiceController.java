package com.example.projects.pivotalservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.projects.pivotalservice.dao.PivotalDAOService;
import com.example.projects.pivotalservice.model.Users;
@RestController
public class PivotalServiceController {
	@Autowired
	PivotalDAOService pivotalDAOService;
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List < Users > getUsers() {
		return pivotalDAOService.getUsers();
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String createUser(@RequestBody Users user) {
		pivotalDAOService.createUser(user);
		return "User created successfully";
	}
}