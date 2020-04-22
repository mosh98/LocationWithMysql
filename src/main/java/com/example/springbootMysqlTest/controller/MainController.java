package com.example.springbootMysqlTest.controller;

import com.example.springbootMysqlTest.model.Location;
import com.example.springbootMysqlTest.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@Controller
@RequestMapping(path= "/location")
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private LocationRepository locationRepository;

    @PostMapping(path = "/add") //maps post requests
    public @ResponseBody String addNewLocation(@Valid @NotBlank @RequestParam String Longitude,
                                               @Valid @NotBlank @RequestParam String lat,
                                               @Valid @NotBlank @RequestParam String station,
                                               @Valid @NotBlank @RequestParam String description){

        long longitu =  Long.parseLong(Longitude);

        long latitude = Long.parseLong(lat);

        Location tmpLoco = new Location(); //initializing

        //setting various attributes
            tmpLoco.setLongitude(longitu);
            tmpLoco.setLatitude(latitude);
            tmpLoco.setStation(station);
            tmpLoco.setDescription(description);
            //could add a picture in the future.

        //puts in the database
        locationRepository.save(tmpLoco);

        return "Location SAVED";
    }
@GetMapping(path = "/all")
    public @ResponseBody Iterable<Location> getALlUsers(){
        return locationRepository.findAll();
    }
}
