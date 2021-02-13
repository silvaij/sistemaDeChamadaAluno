package sistemaDeChamadaAluno.model;

public enum Presenca {
	Presente("PRESENTE"),Falta("FALTA");
	
	private String presenca;
	Presenca(String presenca){
		this.presenca=presenca;
	}
	
	public String getPresenca() {
		return presenca;
	}
}
