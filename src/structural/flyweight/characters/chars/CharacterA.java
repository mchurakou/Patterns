package structural.flyweight.characters.chars;

/**
 * Created by mikalai on 12.11.2015.
 */
public class CharacterA  extends EnglishCharacter{
    public CharacterA(){
        symbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}
