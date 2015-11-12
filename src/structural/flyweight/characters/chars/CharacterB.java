package structural.flyweight.characters.chars;

/**
 * Created by mikalai on 12.11.2015.
 */


public class CharacterB extends EnglishCharacter{

    public CharacterB(){
        symbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}
