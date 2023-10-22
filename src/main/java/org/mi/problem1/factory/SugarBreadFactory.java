package org.mi.problem1.factory;


import org.mi.problem1.product.Bread;
import org.mi.problem1.product.SugarBread;

import java.util.Map;

class SugarBreadFactory extends BreadFactory {
    @Override
    public Bread createBread(Map<String, Integer> recipe) {
        return new SugarBread(recipe);
    }
}
