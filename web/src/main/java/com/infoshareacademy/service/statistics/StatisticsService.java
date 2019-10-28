package com.infoshareacademy.service.statistics;

import com.infoshareacademy.dao.StatisticsDaoBean;
import com.infoshareacademy.domain.entity.Recipe;
import com.infoshareacademy.domain.entity.statistics.RecipeStatistics;
import com.infoshareacademy.domain.entity.statistics.Type;
import com.infoshareacademy.service.RecipeService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class StatisticsService {

    @Inject
    private StatisticsDaoBean statisticsDaoBean;
    @Inject
    private RecipeService recipeService;


    private void addRecipe(Long recipieId) {
        RecipeStatistics recipeStatistics = new RecipeStatistics();
        Recipe recipe = recipeService.getRecipeById(recipieId);
        recipeStatistics.setRecipieId(recipieId);
        recipeStatistics.setRecipieName(recipe.getName());
        recipeStatistics.setType(Type.SINGLE_VIEW.getType());
        statisticsDaoBean.saveToDB(recipeStatistics);
    }

    private void addCategories(List<Long> categories) {
        RecipeStatistics recipeStatistics = new RecipeStatistics();
        recipeStatistics.setCategories(getCategories(categories));
        recipeStatistics.setType(Type.CHECKED_CATEGORY.getType());
        statisticsDaoBean.saveToDB(recipeStatistics);
    }

    public void saveToDB(Long recipieId, List<Long> categories) {
        if (recipieId > 0) {
            addRecipe(recipieId);
        }
        addCategories(categories);
    }

    private Set<Long> getCategories(List<Long> categories) {
        return new HashSet<>(categories);
    }
}



