package com.generation.vhfc.myappjwt.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncoderUtil {

	public static void main(String[] args) {
		var password = "2357";
        System.out.println("password: " + password);
        System.out.println("password encriptado:" + encriptarPassword(password));
	}

	public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
