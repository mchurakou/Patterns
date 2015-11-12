package structural.flyweight.characters;

import structural.flyweight.characters.chars.CharacterA;
import structural.flyweight.characters.chars.CharacterB;
import structural.flyweight.characters.chars.CharacterC;
import structural.flyweight.characters.chars.EnglishCharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikalai on 12.11.2015.
 */
public class FlyweightFactory {
    private Map<Integer, EnglishCharacter> characters = new HashMap<Integer, EnglishCharacter>();

    public EnglishCharacter getCharacter(int characterCode){
        EnglishCharacter character = characters.get(characterCode);
        if (character == null){
            switch (characterCode){
                case 1 : {
                    character = new CharacterA();
                    break;
                }
                case 2 : {
                    character = new CharacterB();
                    break;
                }
                case 3 : {
                    character = new CharacterC();
                    break;
                }
            }
            characters.put(characterCode, character);
        }
        return character;
    }

}
