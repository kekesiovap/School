//Name: Kekesiova

package sk.itsovy;

public class SlovakLang extends Subject {

    public String formatText(String text){
        String firstLetter = text.substring(0,1).toUpperCase();
        String restLetters = text.substring(1).toLowerCase();
        return firstLetter + restLetters + ".";
    }



}
