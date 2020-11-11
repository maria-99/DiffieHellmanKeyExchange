package KeyExchange;

public class User {

    private int g, p;
    private int privateKey;
    private long publicKey, sharedKey;

    public void setVariables (int g, int p, int privateKey){
        this.g = g;
        this.p = p;
        this.privateKey = privateKey;
        publicKey = (long) ((Math.pow(g,privateKey)) % p);
    }

    private void setSharedKey(long foreignPublicKey){
        sharedKey = (long) ((Math.pow(foreignPublicKey,privateKey)) % p);
    }

    public void exchange(User secondUser){

        secondUser.setSharedKey(publicKey);
        setSharedKey(secondUser.publicKey);
    }

    public long getSharedKey(){
        return sharedKey;
    }
}
