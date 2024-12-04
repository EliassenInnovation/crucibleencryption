package com.Lightwell.encryption.unitTests;

import com.Lightwell.Encryption.EncryptionHelper;
import com.Lightwell.Encryption.JSONHelper;
import org.json.JSONObject;
import static org.junit.Assert.*;

import org.junit.Test;

public class JsonTests
{
    @Test
    public void test_ShouldGetDataFromJsonFile()
    {
        String TestDataFilePath = "./secret.json";
        String expectedValue = "value";

        String testValue = JSONHelper.getValueFromJson(EncryptionHelper.KEY_NAME,TestDataFilePath);

        assertEquals(expectedValue, testValue);
    }
}
