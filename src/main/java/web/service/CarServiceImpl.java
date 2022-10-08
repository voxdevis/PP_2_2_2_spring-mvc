package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    public static List<Car> cutCarsList(List<Car> carList, int count) {
        return carList.subList(0, count);
    }

    public static boolean isOKCount(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
            if (i >= 5) return false;
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
