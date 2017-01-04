import java.util.Map;
import java.util.HashMap;

/**
 * https://arena.topcoder.com/#/u/practiceCode/1282/1262/1333/2/1282
 *
 * @author tlmader.dev@gmail.com
 * @since 2017-01-03
 */
public class Substitute {
    public int getValue(String key, String code) {
        char[] kArray = key.toCharArray();
        char[] cArray = code.toCharArray();
        Map<Character, Integer> kMap = new HashMap<>();
        for (int i = 1; i <= kArray.length; i++) {
            if (i == kArray.length) {
            	kMap.put(new Character(kArray[i - 1]), 0);
            } else {
                kMap.put(new Character(kArray[i - 1]), i);
            }
        }
        int value = 0;
        for (char c : cArray) {
            if (kMap.containsKey(c)) {
				value = (value * 10) + kMap.get(c);
            }
        }
        return value;
    }
}
