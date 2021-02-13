package sistemaDeChamadaAluno.model;


import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Chamada  {
     String   NomeCompleto;
     String DiaDaAula ;
     Presenca presenca;
	
     public String getNomeCompleto() {
		return NomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}
	public String getDiaDaAula() {
		return DiaDaAula;
	}
	public void setDiaDaAula(Calendar diaDaAula) {
		 SimpleDateFormat DiaDaAulaFormatada = new SimpleDateFormat("dd/MM/yyyy");
	     String dia = DiaDaAulaFormatada.format(diaDaAula.getTime());     
		 DiaDaAula = dia;
	}
	public Presenca getPresenca() {
		return presenca;
	}
	public void setPresenca(Presenca presenca) {
		this.presenca = presenca;
	}
     
     
     
    
}
