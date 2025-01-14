package com.edw.helper;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * <pre>
 *  com.edw.helper.EncryptionHelper
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 09 Jan 2025 13:49
 */

public class EncryptionHelper {

    private static final String KEY = "bNgrv98CGAarHOJ4CzUnJkI0";

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
