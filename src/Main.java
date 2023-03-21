import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Låt användaren mata in ett romerskt tal, översätt till vanligt tal och visa på skärmen
        //  En HashMap som lagrar översättingen enligt:
        //      I = 1           C = 100
        //      V = 5           D = 500
        //      X = 10          M = 1000
        //      L = 50
        //
        // Några tal att testa:
        // I        = 1
        // IV       = 4
        // VII      = 7
        // XVI      = 16
        // MMXXIII  = 2023

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett romerskt tal: ");
        String number = input.nextLine();

        ArrayList<Integer> values = new ArrayList<>();
        for (int i=0; i < number.length(); i++) {
            values.add(roman.get(number.charAt(i)));
        }

        int sum = 0;
        for (int i=0; i < values.size()-1; i++) {
            if (values.get(i) >= values.get(i+1)) {
                sum += values.get(i);
            } else {
                sum -= values.get(i);
            }
        }
        sum += values.get(values.size()-1);

        System.out.println(sum);
    }
}