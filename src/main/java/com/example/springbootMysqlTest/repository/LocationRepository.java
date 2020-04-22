package com.example.springbootMysqlTest.repository;

import com.example.springbootMysqlTest.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,String> {

}
