package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        String expected = "Yeet";
        Cat cat = new Cat("", new Date(), 0);
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "meow!";
        Cat cat = new Cat("", new Date(), 0);
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate(){
        Date date = new Date();
        Cat cat = new Cat("", new Date(), 0);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(date, actual);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat("", new Date(), 0);
        Food food = new Food();
        cat.eat(food);
    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat("", new Date(), 0);
        int actual = cat.getId();
        Assert.assertEquals(0, actual);
    }

    @Test
    public void checkAnimalInheritanceTest(){
        Cat cat = new Cat("", new Date(), 0);
        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void checkMammalInheritanceTest(){
        Cat cat = new Cat("", new Date(), 0);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
