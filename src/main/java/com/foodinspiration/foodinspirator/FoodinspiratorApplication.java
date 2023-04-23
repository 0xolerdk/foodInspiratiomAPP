package com.foodinspiration.foodinspirator;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class FoodinspiratorApplication {


	@Autowired
	private RecipesRepository recipesRepository;

	public static void main(String[] args) {
		SpringApplication.run(FoodinspiratorApplication.class, args);
	}


	//for test. This adds new receipts in DB
	//not needed
//	@PostConstruct
//	public void init() {
//		Recipes recipe = new Recipes();
//		recipe.setImdbID("tt1234567");
//		recipe.setTitle("Example Recipe");
//		recipe.setIngredients(Arrays.asList("Ingredient 1", "Ingredient 2", "Ingredient 3"));
//
//		recipesRepository.insert(recipe);
//	}
//
}
