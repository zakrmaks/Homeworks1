package HomeWork_20;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Md5Hash {
    private String pass;
    public Md5Hash(String newPass) {
        pass = newPass;

    }

    public  String Md5Hash() throws Exception
    {
        String password = pass;

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
        String md5 = DatatypeConverter.printHexBinary(digest);
        return md5;

        // print MD5 Message Digest
    }
}
