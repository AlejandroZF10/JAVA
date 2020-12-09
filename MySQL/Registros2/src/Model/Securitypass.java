package Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Securitypass {
    public static String getHash(String text,String hashtype){
        try{
            MessageDigest md = MessageDigest.getInstance(hashtype);
            byte[] array = md.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<array.length ;i++)
                sb.append(Integer.toHexString((array[i]&0xff)|0x100)).substring(1,3);
            return sb.toString();
        }catch(NoSuchAlgorithmException ex){         
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public static String md5(String text){
        return Securitypass.getHash(text,"MD5");
    }
    
    public static String sha1(String text){
        return Securitypass.getHash(text,"SHA1");
    }
}