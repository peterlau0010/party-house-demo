package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

    List<Location> findByLocationId(Long LocationID);
    
    List<Location> findByLocationChineseContaining(String LocationChinese);
    
    List<Location> findByLocationEnglishContaining(String LocationEnglish);
}
