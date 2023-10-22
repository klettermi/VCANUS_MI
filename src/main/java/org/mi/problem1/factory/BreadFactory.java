package org.mi.problem1.factory;

import org.mi.problem1.product.Bread;

import java.util.Map;

// Creator 추상 클래스
public abstract class BreadFactory {
    public abstract Bread createBread(Map<String, Integer> recipe);

    public static BreadFactory createFactory(String breadType) {
        switch (BreadType.valueOf(breadType.toUpperCase())) {
            case BUTTER:
                return new ButterBreadFactory();
            case SUGAR:
                return new SugarBreadFactory();
            case CREAM:
                return new CreamBreadFactory();
            default:
                throw new IllegalArgumentException("Invalid bread type: " + breadType);
        }
    }
}

