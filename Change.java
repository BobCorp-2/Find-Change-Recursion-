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
public class Change {

    public static int minChange(double sum, Coins maxdenomination) {
        //if sum = 0 finally returns something
        if (sum == 0) {
            return 0;
        //if sum can be subtracted by the current max denomination 
        } else if (sum - maxdenomination.value() >= 0) {
            return 1 + minChange((double) Math.round(sum * 100 - maxdenomination.value() * 100) / 100, maxdenomination);
        //goes down a denomination 
        } else {
            return minChange(sum, Coins.nextCoin(maxdenomination));
        }
    }

    public static void main(String[] args) {
        System.out.println(minChange(37.25, Coins.TOONIES));
        System.out.println(minChange(100.0, Coins.NICKELS));
        System.out.println(minChange(45.2, Coins.QUARTERS));
    }

}
