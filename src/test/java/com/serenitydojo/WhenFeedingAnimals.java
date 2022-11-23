package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.FoodType.*;
import static com.serenitydojo.model.AnimalType.*;


public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, false);
        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, true);
        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void shouldFeedDogsFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, false);
        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, true);
        Assert.assertEquals(DELUXE_DOG_FOOD, food);
    }

    @Test
    public void shouldFeedHamstersFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, false);
        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, true);
        Assert.assertEquals(LETTUCE, food);
    }
}
