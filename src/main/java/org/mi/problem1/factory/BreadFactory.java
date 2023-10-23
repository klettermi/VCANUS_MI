package org.mi.problem1.factory;

import org.mi.problem1.product.Bread;

import java.util.Map;

public abstract class BreadFactory {
    public abstract Bread createBread(String breadType, Map<String, Integer> recipe);
}

