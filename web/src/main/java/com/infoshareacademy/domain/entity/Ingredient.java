package com.infoshareacademy.domain.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQueries({
        @NamedQuery(
                name = "Ingredient.findIngredientByLiveSearch",
                query = "SELECT distinct i.name FROM Ingredient i WHERE i.name like CONCAT('%',:nameChars,'%')"),
        @NamedQuery(
                name = "Ingredient.findIngredientByName",
                query = "SELECT distinct i.name FROM Ingredient i WHERE i.name in :names"),
        @NamedQuery(
                name = "Ingredient.getIngredientList",
                query = "SELECT distinct i.name FROM Ingredient i")
})

@Entity
@Table(name = "ingredient", indexes = {@Index(name = "idx_name", columnList = "name")})
public class Ingredient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    @NotNull
    private String name;

    @Column(name = "measure")
    @NotNull
    private String measure;

    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
