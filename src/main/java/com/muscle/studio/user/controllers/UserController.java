package com.muscle.studio.user.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muscle.studio.user.dto.RolesDto;
import com.muscle.studio.user.dto.UserDto;
import com.muscle.studio.user.dto.UserRoleDto;
import com.muscle.studio.user.repository.RolesRepository;
import com.muscle.studio.user.repository.UserRepository;
import com.muscle.studio.user.repository.UsersRolesRepository;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RolesRepository rolesRepository;
	
	@Autowired
	private UsersRolesRepository usersRolesRepository;
	  
	@GetMapping(path="/data/{id}",produces = "application/json")
	  public String getData(@ApiParam(value = "ID value for the detail to be retrieved", required = true)@PathVariable("id") Long id) {
		Optional<UserDto> userEntity = userRepository.findById(id);
		Optional<RolesDto> roleDto	= rolesRepository.findById(id);
		Optional<UserRoleDto> userRoleDto=usersRolesRepository.findById(id);
	    return userEntity.toString() + " " + roleDto.toString() + " " + userRoleDto.toString();
	  }
	
	@GetMapping(path="/home",produces = "application/json")
	public String dashboard() {
		return "Welcome Ravikiran" ; 
	}
}
