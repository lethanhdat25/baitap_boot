package com.example.example.Service;

import com.example.example.Entity.District;
import com.example.example.Entity.Street;
import com.example.example.Repository.DistrictRepository;
import com.example.example.Repository.StreetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetService {

    public StreetRepository streetRepository;

    public List<Street> findAll(){return streetRepository.findAll();}

    public Optional<Street> findById(Integer id){return streetRepository.findById(id);}

    public Street save (Street street){
        return streetRepository.save(street);
    }

    public void delete (Integer id){
        streetRepository.deleteById(id);
    }
}
