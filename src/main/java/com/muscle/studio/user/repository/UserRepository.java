package com.muscle.studio.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muscle.studio.user.dto.UserDto;

@Repository
public interface UserRepository extends CrudRepository<UserDto, Integer> {
	Optional<UserDto> findById(Integer id);
}
