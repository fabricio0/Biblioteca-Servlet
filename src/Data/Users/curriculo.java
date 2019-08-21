package Data.Users;

public class curriculo {
	private String nome,formacao,experiencia;
	public usuario us;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setFormacao(String formacao){
		this.formacao = formacao;
	}
	public void setExperiencia(String experiencia){
		this.experiencia = experiencia;
	}
	public String getNome(){
		return nome;
	}
	public String getFormacao(){
		return formacao;
	}
	public String getExperiencia(){
		return experiencia;
	}
}
