/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.untils;

import com.DungNgoc.entitys.NhanVien;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author Admin
 */
public class XpassWord {
    public static String[] passToHash(String pass) {
        try {
            String[] Hash_Salt = new String[2]; //mảng lưu trữ mã hash và salt
            byte[] salt = new byte[16];
            SecureRandom random = new SecureRandom();
            random.nextBytes(salt);
            KeySpec spec = new PBEKeySpec(pass.toCharArray(), salt, 65536, 128);
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hash = f.generateSecret(spec).getEncoded();
            Base64.Encoder enc = Base64.getEncoder();
            Hash_Salt[0] = enc.encodeToString(salt);
            Hash_Salt[1] = enc.encodeToString(hash);
            return Hash_Salt;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isCompareToHash(String passInput,NhanVien staff) {
        try {
            Base64.Encoder enc = Base64.getEncoder();
            Base64.Decoder dnc = Base64.getDecoder();
            byte[] saltCheck = dnc.decode(staff.getSalt().trim());
            KeySpec spec = new PBEKeySpec(passInput.toCharArray(), saltCheck, 65536, 128);
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hashCheck = f.generateSecret(spec).getEncoded();
            return enc.encodeToString(hashCheck).equals(staff.getHash().trim());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
