package Data.Users;

public class usuario {
	private String nome, matricula, curso, fone, email,senha,tipo;
	
	public String getTipo(){
		return tipo;
	}
	public String getNome(){
		return nome;
	}
	public String getMatricula(){
		return matricula;
	}
	public String getCurso(){
		return curso;
	}
	public String getFone(){
		return fone;
	}
	public String getEmail(){
		return email;
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
	public void setCurso(String curso){
		this.curso = curso;
	}
	public void setFone(String fone){
		this.fone = fone;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setSenha(String senha){
		this.senha = senha;
	}
	

}