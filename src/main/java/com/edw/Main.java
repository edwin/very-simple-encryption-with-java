package com.edw;

import com.edw.helper.EncryptionHelper;

/**
 * <pre>
 *  com.edw.Main
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 09 Jan 2025 13:48
 */

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.encrypt("mypassword");
        main.decrypt("gYylGvqaxf/TzgBv8Q2+Bh1ub33FNthS");
    }

    private void encrypt(String plainText) {
        System.out.println(EncryptionHelper.encrypt(plainText));
    }


    private void decrypt(String encryptedText) {
        System.out.println(EncryptionHelper.decrypt(encryptedText));
    }

}
