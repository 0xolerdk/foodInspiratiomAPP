package com.foodinspiration.foodinspirator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipesController {

    @Autowired
    private RecipesService recipesService;
    @GetMapping
    public ResponseEntity<List<Recipes>> getAllRecipes(){
        return new ResponseEntity<>(recipesService.allRecipes(), HttpStatus.OK);

    }
}
