/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change;

/**
 *
 * @author tigerye
 */
public enum Coins {
    TOONIES(2.00),
    LOONIES(1.00),
    QUARTERS(0.25),
    DIMES(0.10),
    NICKELS(0.05);

    private final double value;

    Coins(double value) {
        this.value = value;
    }
    //gets coin value
    public double value() {
        return value;
    }
    //next coin method 
    public static Coins nextCoin(Coins Coin){
        int nextCoin = Coin.ordinal()+1;
        Coins [] coins = Coins.values();
        nextCoin %= coins.length;
        return coins[nextCoin];
    }

}
