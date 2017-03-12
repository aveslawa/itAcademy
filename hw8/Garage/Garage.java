package Garage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Viachaslau.
 */
public class Garage {

    private static Map<Car, Integer> garageResult = new HashMap<Car, Integer>();

    public void parking(Car type, Integer pcs) {
        garageResult.put(type, garageResult.containsKey(type) ? garageResult.get(type) + pcs : pcs);
    }

    public void exitForTheCar(Car type, Integer pcs) {
        if (pcs >= garageResult.get(type)) {
            garageResult.remove(type);
        } else {
            garageResult.put(type, garageResult.containsKey(type) ? garageResult.get(type) - pcs : -pcs);
        }
    }


    public void getTypeCar(Car type) {
        if (garageResult.get(type) == null) {
            System.out.println("Указанных машин нету в этом гараже");
        } else {
            System.out.println(type.toString() + " находится в гараже в количестве  " + garageResult.get(type) + " шт.");
        }

    }
}





