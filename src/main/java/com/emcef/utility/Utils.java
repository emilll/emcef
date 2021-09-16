package com.emcef.utility;

import com.emcef.model.FactureSelonSpecification;
import java.util.Date;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author Emmanuel B.
 */
public class Utils {

    //Générer un encodage HMAC SHA1
    public static String hmacSha1(String value, String key) {
        try {
            // Get an hmac_sha1 key from the raw key bytes
            byte[] keyBytes = key.getBytes();
            SecretKeySpec signingKey = new SecretKeySpec(keyBytes, "HmacSHA1");

            // Get an hmac_sha1 Mac instance and initialize with the signing key
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(signingKey);

            // Compute the hmac on input data bytes
            byte[] rawHmac = mac.doFinal(value.getBytes());

            // Convert raw bytes to Hex
            byte[] hexBytes = new Hex().encode(rawHmac);

            //  Covert array of Hex bytes to a String
            return new String(hexBytes, "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Convert Hex to String
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public String getAlphaNumericString(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
    
    public String getSignature(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz" + "@*#&";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

    public String numero(int valeur) {
        String val = Integer.toString(valeur);
        String padded = "";
        if (val.length() == 0) {
            padded = String.format("%05d", 1);
        }
        if (val.length() == 1) {
            padded = String.format("%05d", valeur);
        }
        if (val.length() == 2) {
            padded = String.format("%04d", valeur);
        }
        if (val.length() == 3) {
            padded = String.format("%03d", valeur);
        }
        if (val.length() == 4) {
            padded = String.format("%02d", valeur);
        }
        if (val.length() == 5) {
            padded = String.format("%01d", valeur);
        }
        if (val.length() == 6) {
            padded = val;
        }
        return padded;
    }

    public String transform(int valeur) {
        String val = "" + valeur;
        if (valeur < 10) {
            val = "0" + valeur;
        }
        return val;
    }

    public int deuxChiffres(int valeur) {
        int k = valeur;
        if (valeur < 10) {
            k = Integer.valueOf("0" + String.valueOf(valeur));
        }
        return k;
    }

    public int count(Date date, List<FactureSelonSpecification> facture) {
        int resultat = 0;
        for (FactureSelonSpecification fct : facture) {
            if (fct.getDateTime() == date) {
                resultat = resultat + 1;
            }
        }
        return resultat;
    }

    public String getParticularString(int n) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
}
