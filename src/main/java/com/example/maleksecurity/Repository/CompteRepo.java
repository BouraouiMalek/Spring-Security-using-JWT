package com.example.maleksecurity.Repository;

import com.example.maleksecurity.Entity.Compte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepo extends CrudRepository<Compte, Long> {
List<Compte>findByUser_Id(Long id);

}

