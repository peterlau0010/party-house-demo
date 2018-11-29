package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    List<Category> findByCategoryId(Long CategoryID);
    
    List<Category> findByCategoryChineseContaining(String CategoryChinese);
    
    List<Category> findByCategoryEnglishContaining(String CategoryEnglish);
    
}
