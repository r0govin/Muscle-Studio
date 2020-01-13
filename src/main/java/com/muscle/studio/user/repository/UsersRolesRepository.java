package com.muscle.studio.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muscle.studio.user.dto.UserRoleDto;
@Repository
public interface UsersRolesRepository extends CrudRepository<UserRoleDto,Integer> {
	Optional<UserRoleDto> findById(Integer id);
}
