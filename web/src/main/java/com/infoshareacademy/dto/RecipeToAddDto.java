package com.infoshareacademy.dto;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class RecipeToAddDto {
    private Long id;
    private String name;
    private String instruction;
    private String drinkType;
    private String glassType;
    private String modificationDate;
    private CategoryDto category;
    private String imageUrlAddress;
    private List<IngredientDto> ingredients;

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

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public String getImageUrlAddress() {
        return imageUrlAddress;
    }

    public void setImageUrlAddress(String imageUrlAddress) {
        this.imageUrlAddress = imageUrlAddress;
    }

    public List<IngredientDto> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDto> ingredients) {
        this.ingredients = ingredients;
    }
}



