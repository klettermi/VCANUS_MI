package org.mi.problem1.product;

import java.util.Map;

public class CreamBread implements Bread {
    private Map<String, Integer> recipe;

    public CreamBread(Map<String, Integer> recipe) {
        this.recipe = recipe;
    }
    @Override
    public void printRecipe(){
        System.out.println("breadType: cream");
        for(String key : recipe.keySet()){
            System.out.println(key + ": " + recipe.get(key));
        }
        System.out.println();
    }
}
