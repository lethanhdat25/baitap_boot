package com.example.example.Service;

import com.example.example.Entity.District;
import com.example.example.Entity.Street;
import com.example.example.Repository.DistrictRepository;
import com.example.example.Repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetService {

    @Autowired
    public StreetRepository streetRepository;

    public List<Street> findAll(){return streetRepository.findAll();}


    public Street save(Street street) {
        return streetRepository.save(street);
    }

}
