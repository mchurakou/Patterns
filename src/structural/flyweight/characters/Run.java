package structural.flyweight.characters;

import structural.flyweight.characters.chars.EnglishCharacter;

/**
 * Created by mikalai on 12.11.2015.
 */
public class Run {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        int [] characterCodes = {1,2,3};
        for (int nextCode : characterCodes){
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }

    }

}
