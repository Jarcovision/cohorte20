package com.generation.jlsg.myappjwtControllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")

public class PruebaSeguridadController {
	@GetMapping("/mensaje")
	public ResponseEntity<?> getMensaje() {
		Map<String, String> mensaje = new HashMap<>();
		mensaje.put("contenido", "Hola Mundo JWT");
		return ResponseEntity.ok(mensaje);
	}
	
	
	
}
