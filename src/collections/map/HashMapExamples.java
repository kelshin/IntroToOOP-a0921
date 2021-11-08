package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<String, String> acronyms = new HashMap<>();
        acronyms.put("Lol", "Laughing out loud");
        acronyms.put("Yolo", "You only live once");
        acronyms.put("Smh", "Shake my head");
        acronyms.put("STFU", "Shut The Fxxx Up");
        acronyms.put("Lmk", "Let me know");
        acronyms.put("Brb", "Be right back");
        acronyms.put("Lmao", "Laughing my ass off");

        System.out.println(acronyms);
        System.out.println(acronyms.get("Yolo"));
        System.out.println(acronyms.size());
        System.out.println(acronyms.containsKey("Brb"));
        acronyms.remove("STFU");
        System.out.println(acronyms);
        for (String key: acronyms.keySet()) {
            System.out.println(key);
        }

        Set<Map.Entry<String, String>> entries = acronyms.entrySet();
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // YOU MUST OVERRIDE hashCode(), equals() for User class.
        User u1 = new User("Hello", 0);
        User u2 = new User("Hello", 0);
        User u3 = new User("Hello", 0);

        HashMap<User, String> userInfo = new HashMap<>();
        userInfo.put(u1, "Hi1");
        userInfo.put(u2, "Hi2");
        userInfo.put(u3, "Hi3");

        System.out.println(userInfo);
    }

    public int[] twoSum(int[] nums, int target) {
        // O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
