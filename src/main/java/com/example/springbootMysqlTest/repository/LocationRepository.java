package com.example.springbootMysqlTest.repository;

import com.example.springbootMysqlTest.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface LocationRepository extends JpaRepository<Location,String> {


    public Optional<Iterable<Location>> findByStation(String station);
}
