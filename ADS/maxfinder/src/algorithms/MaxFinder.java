/*Neva Ramazanogullari Ü. Gruppe 1 --- Matrikelnummer: 3341801
Daniel Castaneda Mendoza Ü. Gruppe 1 --- Matrikelnummer:3335707  */

package algorithms;

public class MaxFinder {
    static void conquerMax(int[]a, int l, int m, int r) {
        if(l < 0 || l > m || m >= r || r >= a.length){
             throw new IllegalArgumentException();
        }
        if (a[l] < a[m+1]){
            int key = a[l];
            a[l] = a[m+1];
            a[m+1] = key ;
        }
    }

    public static void moveMaxToFront(int[]a, int l, int r){ //este es un cambio de linea
        if(l<0 || l>r || r>=a.length){
            throw new IllegalArgumentException();
        }
        if (r <= l) {
            int m = (l+r)/2;             //teile
            moveMaxToFront(a, l, m);        //herrsche
            moveMaxToFront(a,m+1, r);    //hersche
            conquerMax(a, l, m, r);         //kombiniere
        }
    }
}
