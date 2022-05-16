package com.example.example.Service;

import com.example.example.Entity.District;
import com.example.example.Repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictService {

    @Autowired
    public DistrictRepository districtRepository;

    public List<District> findAll(){return districtRepository.findAll();}

    public Optional<District> findById(Integer id){return districtRepository.findById(id);}

    public District save (District district){
        return districtRepository.save(district);
    }

    public void delete (Integer id){
        districtRepository.deleteById(id);
    }

}
