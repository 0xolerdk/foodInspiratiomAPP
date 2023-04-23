package com.foodinspiration.foodinspirator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "recipes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Recipes {
    @Id
    private ObjectId id;

    private String imdbID;

    private String title;

    private List<String> ingredients;

    private  String id1;


}
