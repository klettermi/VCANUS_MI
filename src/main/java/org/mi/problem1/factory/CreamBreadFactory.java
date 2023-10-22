package org.mi.problem1.factory;


import org.mi.problem1.product.Bread;
import org.mi.problem1.product.CreamBread;

import java.util.Map;

class CreamBreadFactory extends BreadFactory {
    @Override
    public Bread createBread(Map<String, Integer> recipe) {
        return new CreamBread(recipe);
    }
}
