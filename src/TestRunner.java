
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testGetArrayLength() { //testar metoden för antalet värden i array
        //Arrange
        Logic logic = new Logic(); //skapar en instans/objekt med namnet logic från klassen Logic via konstruktorn
        int expected = 4; //förväntar oss att arrayn kommer att ha 4 ord i sig

        //Act
        logic.setWordsArray("Gris Får Kattunge Ko"); //lägger in 4 ord i arrayn
        int actual = logic.getArrayLength(); //actual variabeln hämtar info om hur många variabler vi har i arrayn a.k.a dess längd

        //Assert
        assertEquals(expected, actual); //jämför expected och actual
    }

    @Test
    public void testGetLongestWord() { //testar metoden för längsta ordet i arrayn
        //Arrange
        Logic logic = new Logic(); //skapar en instans/objekt med namnet logic från klassen Logic via konstruktorn
        String expected = "Kattunge"; //sätter expected som "Kattunge" a.k.a förväntar oss att "Kattunge är det längst ordet

        //Act
        logic.setWordsArray("Gris Får Kattunge Ko"); //lägger 4 ord, alla med varierande längd, i arrayn
        String actual = logic.getLongestWord(); //actual variabeln hämtar info från metoden getLongestWord för att få det längsta ordet i arrayn

        //Assert
        assertEquals(expected, actual); //jämför expected och actual
    }

    @Test
    public void testGetAmountOfCharacters() { //testar räkning av tecken i arrayn
        //Arrange
        Logic logic = new Logic(); //skapar en instans/objekt med namnet logic från klassen Logic via konstruktorn
        int expected = 17; //sätter expected till 17 (förväntar mig 17 tecken UTAN mellanslag i arrayn)

        //Act
        logic.setWordsArray("Gris Får Kattunge Ko"); //lägger in 4 ord i arrayn
        int actual = logic.getAmountOfCharacters(); //hämtar info om antalet tecken i arrayn från min metod

        //Assert
        assertEquals(expected, actual); //jämför expected och actual
    }
}
