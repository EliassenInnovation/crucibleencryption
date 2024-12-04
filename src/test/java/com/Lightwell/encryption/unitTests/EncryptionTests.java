package com.Lightwell.encryption.unitTests;

import com.Lightwell.Encryption.EncryptionHelper;
import com.Lightwell.Encryption.JSONHelper;
import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptionTests
{
    String encryptedString = "8yU+YWfd3+Bv5pncJVMyHA==";
    String unencryptedString = "encryptedValue";
    String secretPath = "secret.json";

    @Test
    public void test_ShouldGetCorrectEncryptedString()
    {
        String secretKey = JSONHelper.getValueFromJson("cryptKey", secretPath);
        EncryptionHelper.setKey(secretKey);

        String testEncryptedString = EncryptionHelper.encrypt(unencryptedString, secretKey);

        assertEquals(encryptedString, testEncryptedString);
    }

    @Test
    public void test_ShouldGetCorrectDecryptedString()
    {
        String secretKey = JSONHelper.getValueFromJson("cryptKey", secretPath);
        EncryptionHelper.setKey(secretKey);

        String testDecryptedString = EncryptionHelper.decrypt(encryptedString, secretKey);

        assertEquals(unencryptedString, testDecryptedString);
    }
}
