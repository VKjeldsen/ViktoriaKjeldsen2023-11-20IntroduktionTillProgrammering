
import java.util.Scanner;

public class Logic { //döper denna klass till Logic
    private String[] words; //skapar en string-array (utan längd) som är privat
    private int rowCounter; //skapar en int variabel som är privat, denna kommer att användas för att räkna rader
                                //och används i flera metoder i klassen därav läggs den här utanför metoderna

    public Logic() { //skapar en tom konstruktor med samma namn som klassen: Logic
    }

    public void processInput() { //skapar en metod vid namn processInput som kommer hantera input från användare
        Scanner scan = new Scanner(System.in); //skapar en scanner så att användare kan skriva sin input i kommandoraden
        String savedInput = ""; //skapar en tom String variabel för att lagra användarens input
        rowCounter = 0; //ger rowCounter ett initialt värde på 0

        while (true) { //koden körs i loopen oändligt (while true) tills break
            System.out.println("Please write as many words or sentences as you like, separate them by pressing enter");
            System.out.println("To stop, simply write 'stop' on its own row followed by pressing enter");

            String input = scan.nextLine(); //vad användaren skriver sparas i string variabeln input
            if (input.equalsIgnoreCase("stop")) { //om användaren skriver "stop" avslutas loopen
                System.out.println("You have chosen to stop"); //meddelande till användaren vid 'stop'
                break;
            }

            savedInput += input + " "; //input sparas i savedInput med mellanslag mellan varje ord eller mening
            rowCounter++; //rowCounter ökas för varje inmatning aka raderna räknas medan användaren skriver
        }

        setWordsArray(savedInput.trim()); //den samlade inputen skickas till metoden "setWordsArray" där den delas upp.
                                            //trim tar bort whitespaces/mellanslag
    }

    public void setWordsArray(String input) {
        words = input.split("\\s+"); //words array med orden från input uppdelade med mellanslag, extra whitespaces tas bort
    }

    public void printWordsArray() {
        System.out.print("You wrote the words: ");
        for (String word : words) { //går igenom och skriver ut arrayn ord för ord på samma rad med mellanslag mellan varje ord
            System.out.print(word + " ");
        }
        System.out.println(); //läggs till för att utskrift efter denna inte ska komma på samma rad
    }

    public String getLongestWord() {
        String longestWord = words[0]; //antagandet att första ordet i min array är längst är utgångspunkten

        for (String word : words) { //enhanced for loop där vi går igenom varje ord i words array
            if (word.length() > longestWord.length()) { //jämför varje ord med det längsta ordet
                longestWord = word; //om det nya ordet är längre än det förra längsta ordet så får det nya ordet ta den platsen för längsta ordet
            }
        }
        return longestWord; //skickar tillbaka längsta ordet i min array
    }

    public int getArrayLength() { //skickar tillbaka antalet värden i min words array
        return words.length;
    }

    public int getAmountOfRows() { //skickar tillbaka antalet rader i min array
        return rowCounter;
    }

    public int getAmountOfCharacters() {
        int charCounter = 0; //ger charCounter ett initialt värde
        for (String word : words) {  //räknar ihop alla tecken genom att lägga ihop endast orden (utan mellanslag)
            charCounter += word.length(); //här inne i loopen ökas charCounter på med längden av varje "word" (lägger ihop antal tecken)
        }
        return charCounter; //skickar tillbaka antalet tecken i min array
    }
}