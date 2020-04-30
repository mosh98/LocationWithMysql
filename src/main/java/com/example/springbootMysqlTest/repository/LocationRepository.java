package com.example.springbootMysqlTest.repository;

import com.example.springbootMysqlTest.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location,String> {

    Optional<Iterable<Location>> findByStation(String station);
}
