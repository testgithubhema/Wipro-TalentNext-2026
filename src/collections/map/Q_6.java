package collections.map;

import java.util.ArrayList;
import java.util.Hashtable;

public class Q_6 {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
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

    public Hashtable<String, String> createReverseMap() {
        Hashtable<String, String> M2 = new Hashtable<>();

        for (String country : M1.keySet()) {
            M2.put(M1.get(country), country);
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        Q_6 obj = new Q_6();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.createReverseMap());
        System.out.println(obj.getCountryList());
    }
}