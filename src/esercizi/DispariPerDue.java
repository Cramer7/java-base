package esercizi;

import java.util.Arrays;

public class DispariPerDue {

    public static int[] dispariPerDue(int[] array){
        int[] result = new int[array.length];
          for(int i =0; i < array.length; i++){
              if (array[i] % 2 != 0){
                  result[i] = array[i] * 2;
              }else {
                  result[i] = array[i];
              }
          }
          return result;
    }

    public static void main(String[] args) {
        int[] input = {4,8,9,12,13,55,68};
        int[] risultato = dispariPerDue(input);
        System.out.println(Arrays.toString(risultato));
    }
}