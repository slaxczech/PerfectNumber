import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        isPerfectNumber(6);
        /*System.out.println(getGreatestCommonDivisor(1155, 1089));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(15, 30));*/
    }



    public static boolean isPerfectNumber(int first){

        int ix = 1;
        String firstGcd="";
        int p_num=0;

        String[] pole1;

        if(first<1){
            return false;
        }

        while(ix<first){
            if(first%ix==0){
                firstGcd += String.valueOf(ix);
                if(ix<=first){
                    firstGcd += ",";
                }
            }
            ix++;

        }

        pole1 = firstGcd.split(",");

        for(int i=0;i<pole1.length;i++){

            p_num+=Integer.parseInt(pole1[i]);

        }

        if(p_num == first){
            return true;
        }

        return false;
    }
}