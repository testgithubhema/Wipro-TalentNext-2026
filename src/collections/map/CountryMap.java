package collections.map;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
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

    public HashMap<String, String> createReverseMap() {

        HashMap<String, String> M2 = new HashMap<>();

        for (String country : M1.keySet()) {
            M2.put(M1.get(country), country);
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }
}