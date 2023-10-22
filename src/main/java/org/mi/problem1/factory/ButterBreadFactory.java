package org.mi.problem1.factory;

import org.mi.problem1.product.Bread;
import org.mi.problem1.product.ButterBread;

import java.util.Map;

class ButterBreadFactory extends BreadFactory {
    @Override
    public Bread createBread(Map<String, Integer> recipe) {
        return new ButterBread(recipe);
    }
}
