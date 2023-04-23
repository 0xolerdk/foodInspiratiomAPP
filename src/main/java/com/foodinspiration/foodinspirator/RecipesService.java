package com.foodinspiration.foodinspirator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipesService {
    @Autowired
    private RecipesRepository recipesRepository;
    public List<Recipes> allRecipes(){
        return recipesRepository.findAll();
    }

    public Optional<Recipes> singleRecipe(String id1){
        return recipesRepository.findRecipesByid1(id1);
    }

    public List<Recipes> findRecipesByIngredients(List<String> ingredients) {
        return recipesRepository.findRecipesByingredients(ingredients);

    public Optional<Recipes> singleRecipe(String imdbID){
        return recipesRepository.findRecipesByImdbID(imdbID);

    }

}
