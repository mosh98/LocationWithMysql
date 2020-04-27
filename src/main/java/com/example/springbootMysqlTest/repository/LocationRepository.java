package com.example.springbootMysqlTest.repository;

import com.example.springbootMysqlTest.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location,String> {

}
