package com.company;

public class EncryptedCloudStream extends CloudStream{

    @Override
    public void write(String data) {
        var encrypted=encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data)
    {
        return "dfdsfurtz7rurebfhfgs";
    }
}

