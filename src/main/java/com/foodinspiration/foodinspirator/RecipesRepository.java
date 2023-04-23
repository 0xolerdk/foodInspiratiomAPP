package com.foodinspiration.foodinspirator;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecipesRepository extends MongoRepository<Recipes, ObjectId> {
    Optional<Recipes> findRecipesByid1(String id1);
    List<Recipes> findRecipesByingredients(List<String> ingredients);
}
