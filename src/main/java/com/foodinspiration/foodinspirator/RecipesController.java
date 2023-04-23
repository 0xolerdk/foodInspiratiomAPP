package com.foodinspiration.foodinspirator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipesController {

    @Autowired
    private RecipesService recipesService;
    @GetMapping
    public ResponseEntity<List<Recipes>> getAllRecipes(){
        return new ResponseEntity<>(recipesService.allRecipes(), HttpStatus.OK);

    }

    @GetMapping("/{id1}")
    public ResponseEntity<Optional<Recipes>> getSingleRecipe(@PathVariable String id1){
        return new ResponseEntity<Optional<Recipes>>(recipesService.singleRecipe(id1),
                HttpStatus.OK);
    }

    @GetMapping("/strings")
    public ResponseEntity<List<Recipes>> getListOfStrings(@RequestParam("list") List<String> strings) {
        return new ResponseEntity<>(recipesService.findRecipesByIngredients(strings), HttpStatus.OK);
    }
}
