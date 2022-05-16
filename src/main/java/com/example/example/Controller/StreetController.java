package com.example.example.Controller;

import com.example.example.Entity.District;
import com.example.example.Entity.Street;
import com.example.example.Repository.DistrictRepository;
import com.example.example.Service.DistrictService;
import com.example.example.Service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/street")
public class StreetController {
    public StreetService streetService;
    public final DistrictRepository districtRepository;

    public StreetController(DistrictRepository districtRepository, StreetService streetService) {
        this.districtRepository = districtRepository;
        this.streetService = streetService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Street> findAll(){
        return streetService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Street> save(@RequestBody Street street) {
        System.out.println(street.toString());
        return ResponseEntity.ok(streetService.save(street));
    }
}
