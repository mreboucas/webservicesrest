package reboucas.marcelo.webservice.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcelo Rebouças [marceloreboucas10@gmail.com]
 * @date 15/05/2014 19:37:37
 */
public class Pessoa {
	
	private Long cpf;
	private String nome;
	private String sobreNome;
	private List<String> primoList;

	
	public Pessoa(){
	}
	
	public Pessoa(Long cpf, String nome, String sobreNome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobreNome = sobreNome;
		primoList = new ArrayList<>();
		primoList.add("Juliana");
		primoList.add("Jorge");
		primoList.add("Leo");
		primoList.add("Leandro");
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
}