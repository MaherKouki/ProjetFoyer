package com.example.demo.Repository;

import com.example.demo.entity.Bloc;
import com.example.demo.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
