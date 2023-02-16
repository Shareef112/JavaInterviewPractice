package problems;

import java.util.Locale;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
       System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",4));
        System.out.println(licenseKeyFormatting("2-5g-3-J",2));
        System.out.println(licenseKeyFormatting("2",2));
        System.out.println(licenseKeyFormatting("a-a-a-a-",1));



    }

    public static String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();

        int n = s.length();
        int remaining = n % k;

        if (remaining == 0) {
            remaining = k;
        }

        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (remaining == 0) {
                sb.append("-");
                remaining = k;
            }
            sb.append(c);
            remaining -= 1;
        }
        return sb.toString();
    }
}
