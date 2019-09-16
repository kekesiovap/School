package sk.itsovy;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class English extends Subject {
    public String translate(String animal) {
        Map<String, String> dictionary = new HashMap<String, String>();
        animal.toLowerCase();
        dictionary.put("pes", "dog");
        dictionary.put("mačka", "cat");
        dictionary.put("sliepka", "hen");
        dictionary.put("had", "snake");

        String translate = animal;
        StringBuilder result = new StringBuilder();

        StringTokenizer st = new StringTokenizer(translate, " ");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String translatedWord = dictionary.get(key);
            if (translatedWord != null) {
                result.append(translatedWord);
            } else {
                result.append("*" + key + "*"); // Unknown word
            }
            result.append(" ");
        }

        System.out.println(result.toString());
        return null;
    }
}
