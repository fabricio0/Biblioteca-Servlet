package Data.Users;

public class administrador {
private String nome, matricula, senha, tipo;
	
	public String getTipo(){
		return tipo;
	}
	public String getNome(){
		return nome;
	}
	public String getMatricula(){
		return matricula;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}

}
