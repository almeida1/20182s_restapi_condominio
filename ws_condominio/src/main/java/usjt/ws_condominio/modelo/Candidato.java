package usjt.ws_condominio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Candidato {
@Id
String cpf;
@NotBlank
String apto;
@NotBlank
String nome;
@NotBlank
String plataforma;

public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getApto() {
	return apto;
}
public void setApto(String apto) {
	this.apto = apto;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPlataforma() {
	return plataforma;
}
public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}

}
