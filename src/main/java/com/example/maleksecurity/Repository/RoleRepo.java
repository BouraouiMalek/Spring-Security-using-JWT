package com.example.maleksecurity.Repository;

import com.example.maleksecurity.Entity.ERole;
import com.example.maleksecurity.Entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepo  extends CrudRepository <Role,Long> {
    Optional<Role> findByName(ERole name);


}
