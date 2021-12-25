package com.administartor.server.repositories;

import java.util.Optional;

import com.administartor.server.entities.ERole;
import com.administartor.server.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(ERole name);
}
