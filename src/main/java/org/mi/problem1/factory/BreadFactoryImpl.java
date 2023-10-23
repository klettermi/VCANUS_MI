package org.mi.problem1.factory;

import org.mi.problem1.product.Bread;
import org.mi.problem1.product.ButterBread;
import org.mi.problem1.product.CreamBread;
import org.mi.problem1.product.SugarBread;

import java.util.Map;

public class BreadFactoryImpl extends BreadFactory{
    public Bread createBread(String breadType, Map<String, Integer> recipe) {
        switch (BreadType.valueOf(breadType.toUpperCase())) {
            case BUTTER:
                return new ButterBread(recipe);
            case SUGAR:
                return new SugarBread(recipe);
            case CREAM:
                return new CreamBread(recipe);
            default:
                throw new IllegalArgumentException("Invalid bread type: " + breadType);
        }
    }
}
