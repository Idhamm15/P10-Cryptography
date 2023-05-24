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
            key key = keyGen.generateKey();
            // membuat DES cipher => print ke provider
            
        }
    }
    
}
