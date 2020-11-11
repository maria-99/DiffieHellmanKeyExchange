package RabinMiller;

import java.util.Random;

public class RabinMillerTest {

    private final int k = 5;

    private int factorOutPowersOf2 (int p){
        int b = 0;
        int evenP = p-1;
        while ( evenP % 2 == 0 ){
            b++;
            evenP /= 2;
        }
        return b;
    }

    public boolean probablyPrime (int input){
        if ( input % 2 == 0 || input < 3){
            System.out.println("Input is wrong");
            return false;
        }
        int b = factorOutPowersOf2(input);
        int m = (int)((input - 1) / Math.pow(2, b));
        System.out.println(input + " = 2^" + b + " * " + m + " + 1");

        Random random = new Random();
        WitnessLoop:
        for(int i = k; i>0; i-- ){
            System.out.println("i = "+ i);
            int a = 0;
            while (a < 2){
                a = random.nextInt() % input;
            }
            long z = (long) Math.pow(a, m) % input;
            System.out.println("a= " + a + ";   z = " + z);
            if (z == 1 || z == input - 1){
                continue;
            }
            for (int j = b-1; j>0; j--){
                z = (long) Math.pow(z, 2) % input;
                System.out.println("j = " + j + ";   z = " + z) ;
                if(z == input -1){
                    continue WitnessLoop;
                }
            }
            return false;

        }

        return true;
    }



}
