package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;

@RestController
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping(value = "/readCategory", method = RequestMethod.GET)
	public List<Category> retrieveAllCategorys(@RequestParam(value = "CategoryID", required = false) Long CategoryID,
			@RequestParam(value = "CategoryChinese", required = false) String CategoryChinese,
			@RequestParam(value = "CategoryEnglish", required = false) String CategoryEnglish) {

		if (CategoryID != null) {
			return categoryRepository.findByCategoryId(CategoryID);
		} else if (CategoryChinese != null) {
			return categoryRepository.findByCategoryChinese(CategoryChinese);
		} else if (CategoryEnglish != null) {
			return categoryRepository.findByCategoryEnglish(CategoryEnglish);
		}

		return (List<Category>) categoryRepository.findAll();
	}

}
