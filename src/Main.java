import RabinMiller.RabinMillerTest;

public class Main {

    public static void main(String[] args) {
        /*
        MyRandom.MyRandom rand = new MyRandom.MyRandom();

        KeyExchange.User alice = new KeyExchange.User();
        KeyExchange.User bob = new KeyExchange.User();
        KeyExchange.User charlie = new KeyExchange.User();

        KeyExchange.Exchange exchange1 = new KeyExchange.Exchange(rand, alice, bob);

        exchange1.exchangeKeys();
        KeyExchange.Exchange exchange2 = new KeyExchange.Exchange(rand, alice, charlie);
        exchange2.exchangeKeys();
        KeyExchange.Exchange exchange3 = new KeyExchange.Exchange(rand, bob, charlie);
        exchange3.exchangeKeys();
        */



        RabinMillerTest test = new RabinMillerTest();
        System.out.println(test.probablyPrime(31));


        /*
        MyRandom.MyRandom rand = new MyRandom.MyRandom();
        for(int i = 30; i>0; i--){
            System.out.println(rand.generateRandomNb());
        }
        */

    }

}
