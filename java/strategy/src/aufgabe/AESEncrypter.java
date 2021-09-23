package aufgabe;

public class AESEncrypter implements  Encrypter{

    @Override
    public void encrypt(String cleartext) {
        System.out.println("Encrypted witdh AES "+cleartext);
    }
}

