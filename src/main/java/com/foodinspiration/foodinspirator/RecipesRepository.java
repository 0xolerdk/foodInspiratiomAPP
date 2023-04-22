package com.foodinspiration.foodinspirator;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends MongoRepository<Recipes, ObjectId> {

}
