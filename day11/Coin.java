package coi;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer,String> coinname = new HashMap<Integer,String>();
    public Coin()
    {
        coinname.put(1,"penny");
        coinname.put(10,"dime");
        coinname.put(25,"quarter");
        coinname.put(50,"half-dollar");
        for (Integer k : coinname.keySet()
             ) {
            System.out.println(coinname.get(k));

        }
    }
    public String getName(int amount)
    {
        if(coinname.containsKey(amount))
            return coinname.get(amount);
        else
            return "NOT FOUND";
    }

    public static void main(String[] args) {
        while(true)
            {Scanner in = new Scanner(System.in);
            Coin coin = new Coin();
            System.out.println(coin.getName(in.nextInt()));
    }}
}
