package de.uniwue.gdp.subsetsum;
import java.util.Scanner;
import java.util.Locale;

public class SubsetSum {
    public static void main(String[]args) {

        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);

        System.out.println("How many numbers should be read?");

        int n = num.nextInt();
        double[ ] numbers = new double[n];
        double bestsum = 0;
        long bestsubset = 0;
        double distance = Double.MAX_VALUE; //Speichert die Abstand zwischen die Summen und PI


        for (int i = 1; i <= n; i++) {
            String Suffix;

            if(i == 1){
                Suffix = "st";
            } else if(i == 2){
                Suffix = "nd";
            } else if(i == 3){
                Suffix = "rd";
            }else{
                Suffix = "th";
            }
            System.out.println("Enter "+ i +Suffix +" number");
            numbers [i-1] = num.nextDouble();
        }

        for(long subset = 0; subset < (1L<<n); subset++){
            double currentsum = 0;
            for(int i=0; i<n; i++){
                if(((subset >> i)&1)==1){
                    currentsum += numbers[i];
                }
            }
            double currentDistance = Math.abs(Math.PI - currentsum); //Math.abs = Absolut value --> kein negativer Wert
            if(currentDistance < distance){
                distance = currentDistance;
                bestsum = currentsum;
                bestsubset = subset;
            }
        }
        System.out.println("Best subset sum: ");
        boolean f = true;
        System.out.print(bestsum + " [");
        for(int i=0; i<n; i++){
            if(((bestsubset >> i)&1)==1){
                if(!f){
                    System.out.print(", ");
                }
                System.out.print(numbers[i]);
                f = false;
            }
        }
        System.out.println("]");
    }
}
