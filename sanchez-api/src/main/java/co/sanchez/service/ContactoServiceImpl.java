package co.sanchez.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.sanchez.domain.Contacto;
import co.sanchez.repository.ContactoRepository;
import lombok.extern.slf4j.Slf4j;

@Scope("singleton")
@Service
@Slf4j
public class ContactoServiceImpl implements ContactoService {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Contacto> findAll() {
		log.info("Realizando un findAll");
		return contactoRepository.findAll();
	}

	@Override
	public Optional<Contacto> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Contacto save(Contacto entity) throws Exception {
		if (entity == null) {
			throw new Exception("Informacion Nula para Contacto");
		}
		
		if (contactoRepository.existsById(entity.getDocumento())) {
			throw new Exception("Contacto ya existe en base de datos: "+entity.getDocumento());
		}
		return contactoRepository.save(entity);
	}

	@Override
	public Contacto update(Contacto entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Contacto entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(Contacto entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
