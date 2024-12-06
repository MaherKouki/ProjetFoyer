package com.example.demo.Repository;

import com.example.demo.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {


    List<Bloc> findAllByFoyerIsNull();

}
