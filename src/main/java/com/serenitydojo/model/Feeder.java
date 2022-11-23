package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(AnimalType animal, Boolean isDeluxe) {
        switch (animal) {
            case CAT:
                return (isDeluxe) ? SALMON : TUNA;
            case DOG:
                return (isDeluxe) ? DELUXE_DOG_FOOD : DOG_FOOD;
            case HAMSTER:
                return (isDeluxe) ? LETTUCE : CABBAGE;
            default:
                return UNKNOWN;
        }
    }
}
