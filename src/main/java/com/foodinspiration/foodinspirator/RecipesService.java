package com.foodinspiration.foodinspirator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipesService {
    @Autowired
    private RecipesRepository recipesRepository;
    public List<Recipes> allRecipes(){
        return recipesRepository.findAll();
    }
}
