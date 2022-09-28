package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
	//Olá {nome}. Hoje é dia {dia da semana}, bom dia.
	//Manipulação de datas
		String nome = "Geize";
		String saudacao;
		
		
		LocalDate hoje = LocalDate.now();
		Locale brasil = new Locale ("pt","BR"); //(language:"pt", country:"BR")
		
		//System.out.println(hoje.getDayOfWeek()); //dia da semana em formato padrão (inglês)
		//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); //dia da semana em português		
		String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);		
		
		LocalDateTime agora = LocalDateTime.now(); //captura a data e hora atual
		
		//Saudação escolhida confome o horário
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia";
		}
		else if(agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		}
		else if(agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa noite";
		}
		else {
			saudacao = " ";
		}
		
		System.out.printf("Olá %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());
		//%s - marcação para o local da String
		//%n - pula uma linha
	}	

}