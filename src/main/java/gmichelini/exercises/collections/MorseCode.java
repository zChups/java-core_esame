package gmichelini.exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public static Map<Character,String> createMorseMap(){
        Map<Character, String> morseCodeMap = new HashMap<>();
        // Add Morse Code mappings for characters
        morseCodeMap.put('a', "._");
        morseCodeMap.put('b', "_...");
        morseCodeMap.put('c', "_._.");
        morseCodeMap.put('d', "_..");
        morseCodeMap.put('e', ".");
        morseCodeMap.put('f', ".._.");
        morseCodeMap.put('g', "__.");
        morseCodeMap.put('h', "....");
        morseCodeMap.put('i', "..");
        morseCodeMap.put('j', ".___");
        morseCodeMap.put('k', "_._");
        morseCodeMap.put('l', "._..");
        morseCodeMap.put('m', "__");
        morseCodeMap.put('n', "_.");
        morseCodeMap.put('o', "___");
        morseCodeMap.put('p', ".__.");
        morseCodeMap.put('q', "__._");
        morseCodeMap.put('r', "._.");
        morseCodeMap.put('s', "...");
        morseCodeMap.put('t', "_");
        morseCodeMap.put('u', ".._");
        morseCodeMap.put('v', "..._");
        morseCodeMap.put('w', ".__");
        morseCodeMap.put('x', "_.._");
        morseCodeMap.put('y', "_.__");
        morseCodeMap.put('z', "__..");
        return morseCodeMap;
    }
    public static String morseCode(String string){
        StringBuilder dst = new StringBuilder();
        Map<Character,String> morseMap = createMorseMap();
        for(int i = 0; i < string.length(); i++){
            Character currC = string.toLowerCase().charAt(i);
            if (i != string.length()-1){
                dst.append(morseMap.get(currC)).append(" ");
            } else {
                dst.append(morseMap.get(currC));
            }
        }
        return dst.toString();
    }
}
