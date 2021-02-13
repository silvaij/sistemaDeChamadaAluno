package Start;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import sistemaDeChamadaAluno.model.Chamada;
import sistemaDeChamadaAluno.model.Presenca;

public class Start {

	public static void main(String[] args) {
		Calendar dia = Calendar.getInstance();
		Chamada Isaque = new Chamada();
		Chamada Pedro  = new Chamada();
		Chamada Maria  = new Chamada();
		
		Isaque.setNomeCompleto("Isaque José da Silva");
		Isaque.setDiaDaAula(dia);
		Isaque.setPresenca(Presenca.Presente);
		
		Pedro.setNomeCompleto("Pedro Miguel de Arruda");
		Pedro.setDiaDaAula(dia);
		Pedro.setPresenca(Presenca.Falta);
		
		Maria.setNomeCompleto("Maria da Conceicão Alves");
		Maria.setDiaDaAula(dia);
		Maria.setPresenca(Presenca.Falta);
		
		List<Chamada> listaDeChamada = new ArrayList<Chamada>();
		listaDeChamada.add(Isaque);
		listaDeChamada.add(Pedro);
		listaDeChamada.add(Maria);
		
		for (Chamada chamada : listaDeChamada) {
			System.out.println(chamada.getDiaDaAula()+" "+chamada.getNomeCompleto()+" | "+chamada.getPresenca());
		}
				
	}

}
