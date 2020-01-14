package com.muscle.studio.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.muscle.studio.user.dto.RoleName;
import com.muscle.studio.user.dto.RolesDto;
@Repository
public interface RolesRepository extends CrudRepository<RolesDto, Long>{
	Optional<RolesDto> findById(Long id);
	Optional<RolesDto> findByName(RoleName roleName);
}
