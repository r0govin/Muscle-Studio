package com.muscle.studio.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muscle.studio.user.dto.UserDto;

@Repository
public interface UserRepository extends CrudRepository<UserDto, Long> {
	Optional<UserDto> findById(Long id);
	Optional<UserDto> findByEmail(String email);

    Optional<UserDto> findByUsernameOrEmail(String username, String email);

    List<UserDto> findByIdIn(List<Long> userIds);

    Optional<UserDto> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
