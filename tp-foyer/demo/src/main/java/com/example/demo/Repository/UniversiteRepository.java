package com.example.demo.Repository;

import com.example.demo.entity.Bloc;
import com.example.demo.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
