package company;

import java.util.*;

public class Robot {
    Hashtable<String, Integer> parts;
    Random generator = new Random();

    public Robot() {
        parts = new Hashtable<>();
        parts.put("Head", 0);
        parts.put("Body", 0);
        parts.put("LeftHand", 0);
        parts.put("RightHand", 0);
        parts.put("LeftFoot", 0);
        parts.put("RightFoot", 0);
        parts.put("CPU", 0);
        parts.put("RAM", 0);
        parts.put("HDD", 0);
    }

    public void initialFill() {
        List<String> keys = new ArrayList<>(parts.keySet());
        for (int i = 0; i < 20; i++) {
            String randomKey = keys.get(generator.nextInt(keys.size()));
            parts.put(randomKey, parts.get(randomKey) + 1);
        }
    }

    synchronized void put() {
        List<String> keys = new ArrayList<>(parts.keySet());
        for (int i = 0; i < generator.nextInt(4); i++) {
            String randomKey = keys.get(generator.nextInt(keys.size()));
            parts.put(randomKey, parts.get(randomKey) + 1);
        }
    }

    synchronized Robot get() {
        List<String> keys = new ArrayList<>(parts.keySet());
        Robot someParts = new Robot();
        for (int i = 0; i < generator.nextInt(4); i++) {
            String randomKey = keys.get(generator.nextInt(keys.size()));
            if (parts.get(randomKey) > 0) {
                parts.put(randomKey, parts.get(randomKey) - 1);
                someParts.parts.put(randomKey, someParts.parts.get(randomKey) + 1);
            }
        }
        return someParts;
    }
}
