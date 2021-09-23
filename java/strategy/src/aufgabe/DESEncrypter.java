package aufgabe;

public class DESEncrypter implements Encrypter{
    @Override
    public void encrypt(String cleartext) {
        System.out.println("Encrypted with DES "+cleartext);
    }
}
