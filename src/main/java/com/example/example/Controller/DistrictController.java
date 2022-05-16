package com.example.example.Controller;

import com.example.example.Entity.District;
import com.example.example.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/district")
public class DistrictController {
    @Autowired
    public DistrictService districtService;
    @RequestMapping(method = RequestMethod.GET)
    public List<District> findAll(){
        return districtService.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<District> save(@RequestBody District district){
        return ResponseEntity.ok(districtService.save(district));
    }
}
