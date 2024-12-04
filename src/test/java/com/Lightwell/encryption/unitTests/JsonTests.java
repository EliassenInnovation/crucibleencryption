package com.Lightwell.encryption.unitTests;

import com.Lightwell.Encryption.JSONHelper;
import org.json.JSONObject;
import static org.junit.Assert.*;

import org.junit.Test;

public class JsonTests
{
    @Test
    public void test_ShouldGetDataFromJsonFile()
    {
        String TestDataFilePath = "./test.json";
        String expectedValue = "value";

        String testValue = JSONHelper.getValueFromJson("key",TestDataFilePath);

        assertEquals(expectedValue, testValue);
    }
}
