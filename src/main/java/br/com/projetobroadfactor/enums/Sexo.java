package br.com.projetobroadfactor.enums;



public enum Sexo {
	
	MASCULINO ("Masculino"),
	FEMININO ("Feminino");
	
	private String sexo;
	
	private Sexo(String sexo) {
		this.setSexo(sexo);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
