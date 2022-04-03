package howToNoBugProgramming.sushi;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Plate> plateList = new ArrayList<>();

    public int getTotalPrice() {
        int totalprice = plateList.stream().mapToInt(Plate::getPrice).sum();
        return totalprice;
    }

    public void addRedPlate(int lap) {
        plateList.add(Plate.createRedPlate(lap));
    }

    public void addBluePlate(int lap) {
        plateList.add(Plate.createBluePlate(lap));
    }

    public void addYellowPlate(int lap) {
        plateList.add(Plate.createYellowPlate(lap));
    }
}
