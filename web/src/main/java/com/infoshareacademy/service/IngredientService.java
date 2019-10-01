package com.infoshareacademy.service;

import com.infoshareacademy.dao.IngredientDaoBean;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class IngredientService {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());
    @EJB
    private IngredientDaoBean ingredientDaoBean;

    public List<String> getIngredientsList() {
        return ingredientDaoBean.getIngredientsList();
    }

    public List<String> findIngredientsForLiveSearch(String nameChars) {
        logger.info("ingredients with name contains {} found in database", nameChars);
        return ingredientDaoBean.findIngredientsByLiveSearch(nameChars);
    }
}