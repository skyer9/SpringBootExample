package kr.co.episode.oauth2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncPassword {
    public static void main(String[] args) {
        BCryptPasswordEncoder bcr = new BCryptPasswordEncoder();
        String result = bcr.encode("1111");
        System.out.println("암호 === " + result);
    }
}
