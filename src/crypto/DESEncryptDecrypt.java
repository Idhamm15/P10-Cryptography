/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crypto;

import java.io.UnsupportedEncodingException;
import java.security.*;
import javax.crypto.*;

/**
 *
 * @author idham
 */
public class DESEncryptDecrypt {
    public static void doEncryptDecript() {
        try {
            String data = "Dasar Symmetric Cryptography";
            byte[] plain = data.getBytes("UTF8");
            //Membuat Des private key
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            keyGen.init(56);
            Key key = keyGen.generateKey();
            // membuat DES cipher => print ke provider
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // proses encript
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cipherText = cipher.doFinal(plain);
            // proses decript
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] originText = cipher.doFinal (cipherText);
            System.out.println("Plain Text: " + data);
            System.out.println("Enkripsi: " + new String (cipherText, "UTF8"));
            System.out.println("Enkripsi Heksa: " + MyStringUtils.
                    getHexString(cipherText));
            System.out.println("Deskripsi: " + new String (originText, "UTF8"));
        } catch (UnsupportedEncodingException | InvalidKeyException | 
                NoSuchAlgorithmException | BadPaddingException | 
                IllegalBlockSizeException | NoSuchPaddingException e) {
        }
    }
    
    public static void main(String[] args) {
        doEncryptDecript();
    }
    
}
