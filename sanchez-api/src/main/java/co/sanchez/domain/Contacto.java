package co.sanchez.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contacto")
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Contacto {
	@Id
	@Column(name = "documento", unique = true, nullable = false)
	@NotNull
	private String documento;
	@NotNull
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@NotNull
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "movil", nullable = true)
	private String movil;
}
