package com.infoshareacademy.mapper;

import com.infoshareacademy.domain.entity.Ingredient;
import com.infoshareacademy.dto.IngredientDto;
import javax.ejb.Stateless;

@Stateless
public class IngredientEntityToDtoMapper {

  public IngredientDto mapIngredientEntityToDto(Ingredient ingredient) {

    IngredientDto ingredientDto = new IngredientDto();
    ingredientDto.setName(ingredient.getName());
    ingredientDto.setMeasure(ingredient.getMeasure());
    return ingredientDto;
  }
}
