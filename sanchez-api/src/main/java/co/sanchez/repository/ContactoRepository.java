package co.sanchez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.sanchez.domain.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, String> {
}
