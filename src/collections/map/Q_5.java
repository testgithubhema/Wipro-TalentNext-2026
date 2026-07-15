package collections.map;

import java.util.ArrayList;
import java.util.TreeMap;

public class Q_5 {

    TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (String country : M1.keySet()) {
            if (M1.get(country).equals(capitalName))
                return country;
        }
        return null;
    }

    public TreeMap<String, String> createReverseMap() {
        TreeMap<String, String> M2 = new TreeMap<>();

        for (String country : M1.keySet()) {
            M2.put(M1.get(country), country);
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        Q_5 obj = new Q_5();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.createReverseMap());
        System.out.println(obj.getCountryList());
    }
}