/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.favoritethingsarray;

/**
 *
 * @author markjimuel
 */
public class FavoriteThingsArray {

    public static void main(String[] args) {
        String[] myFavorites = {"Genshin Impact", "K-Pop", "Lumpiang Shanghai", "Badmiton", "Graphic Design"};
        
        System.out.println("----------------------------");
        System.out.println("      <3 My Favorites       ");
        System.out.println("----------------------------");
        
        for (int i = 0; i < myFavorites.length; i++) {
            System.out.println((i + 1) + ". " + myFavorites[i]);
        }
        
        System.out.println("----------------------------");
        
        System.out.println("Total items in list: " + myFavorites.length);
    }
}
