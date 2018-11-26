package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

    List<Location> findByLocationID(Long LocationID);
    
    List<Location> findByLocationChinese(String LocationChinese);
    
    List<Location> findByLocationEnglish(String LocationEnglish);
}
