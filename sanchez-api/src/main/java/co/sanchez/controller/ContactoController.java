package co.sanchez.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.sanchez.domain.Contacto;
import co.sanchez.service.ContactoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/contacto/")
@CrossOrigin(origins = "*")
@Slf4j
public class ContactoController {
	@Autowired
	private ContactoService contactoService;
	
	@GetMapping()
	public ResponseEntity<?> findAll() throws Exception {
		log.debug("Request to findAll() Contacto");
		return ResponseEntity.ok().body(contactoService.findAll());
	}

	@PostMapping()
	public ResponseEntity<?> save(@Valid @RequestBody Contacto contacto) throws Exception {
		log.debug("Request to save Contacto: {}", contacto);

		contacto = contactoService.save(contacto);

		return ResponseEntity.ok().body(contacto);
	}
}
