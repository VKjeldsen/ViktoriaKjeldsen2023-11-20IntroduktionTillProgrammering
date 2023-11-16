
public class Main {
    public static void main(String[] args) {

        Logic logic = new Logic(); //skapar en instans/objekt med namnet logic från klassen Logic via konstruktorn

        logic.processInput(); //anropar metoden med scanner som hanterar input och avslutar programmet när användaren
                                    //skriver "stop", detta är även metoden som räknar raderna
        logic.printWordsArray(); //efter stop: skriver ut orden som användaren har skrivit (vilka ord har lagrats i word array)
        System.out.println("The array contains " + logic.getArrayLength() + " words"); //skriver ut antal ord i min array
        System.out.println("The longest word is: " + logic.getLongestWord());//skriver ut längsta ordet
        System.out.println("The amount of characters are: " + logic.getAmountOfCharacters()); //skriver ut antal tecken (UTAN mellanslag)
        System.out.println("The amount of rows are: " + logic.getAmountOfRows()); //skriver ut antal rader
    }
}