package com.serenitydojo.checks;

import com.serenitydojo.Cat;
import com.serenitydojo.Dog;
import com.serenitydojo.Hamster;
import com.serenitydojo.Pet;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

public class PetClassTest {
    @Test
    public void thePetClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Pet")).isNotNull();
    }

    @Test
    public void shouldHaveAName() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Pet").getDeclaredField("name").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void shouldHaveAnAge() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Pet").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
    }

    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido","bone", 5);
        Pet spot = new Cat("Spot","string", 5);
        Pet hazel = new Hamster("Hazel", 1, "wheel");

        Assertions.assertThat(fido.play().equals("plays with bone"));
        Assertions.assertThat(spot.play().equals("plays with string"));
        Assertions.assertThat(hazel.play().equals("runs in wheel"));
    }
}
