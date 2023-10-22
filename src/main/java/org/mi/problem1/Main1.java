package org.mi.problem1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.mi.problem1.factory.BreadFactory;
import org.mi.problem1.product.Bread;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        List<Bread> breads = loadBreadsFromJson();
        for (Bread bread : breads) {
            bread.printRecipe();
        }
    }

    private static List<Bread> loadBreadsFromJson() {
        List<Bread> breads = new ArrayList<>();
        URL resource = Main1.class.getClassLoader().getResource("bread.json");
        String fileUrl = resource.getFile();
        try (Reader reader = new FileReader(fileUrl)) {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(reader);
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                String breadType = (String) jsonObject.get("breadType");
                Map<String, Integer> recipe = (Map<String, Integer>) jsonObject.get("recipe");

                BreadFactory breadFactory = BreadFactory.createFactory(breadType);
                Bread bread = breadFactory.createBread(recipe);
                breads.add(bread);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return breads;
    }
}
