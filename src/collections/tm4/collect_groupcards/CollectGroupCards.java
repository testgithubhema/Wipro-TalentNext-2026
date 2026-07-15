package collections.tm4.collect_groupcards;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CollectGroupCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            map.putIfAbsent(symbol, new ArrayList<>());
            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");

        for (char ch : map.keySet()) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (Map.Entry<Character, ArrayList<Card>> entry : map.entrySet()) {

            char symbol = entry.getKey();
            ArrayList<Card> list = entry.getValue();

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;

            for (Card c : list) {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}