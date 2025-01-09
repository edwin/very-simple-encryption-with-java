package com.edw.helper;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.util.Base64;

/**
 * <pre>
 *  com.edw.helper.EncryptionHelper
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 09 Jan 2025 13:49
 */

public class EncryptionHelper {

    private static final String KEY = "E06C1AVLX7P2RTHDM5GW";

    private static StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();

    static {
        standardPBEStringEncryptor.setPassword(KEY);
    }

    public static final String decrypt(String encryptedText) {
        return standardPBEStringEncryptor.decrypt(encryptedText);
    }

    public static final String encrypt(String plainText) {
        return standardPBEStringEncryptor.encrypt(plainText);
    }
}
