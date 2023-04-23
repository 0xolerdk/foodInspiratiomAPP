package com.foodinspiration.foodinspirator;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipesRepository extends MongoRepository<Recipes, ObjectId> {
    Optional<Recipes> findRecipesByImdbID(String imdbID);
}
