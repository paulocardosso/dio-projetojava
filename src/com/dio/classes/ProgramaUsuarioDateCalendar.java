package com.dio.classes;

import java.util.stream.IntStream;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class ProgramaUsuarioDateCalendar {

	public static void main(String[] args) {
		
		//Scanner ler = new Scanner(System.in);
		/*
		final var user = new Usuario("root","12345");
		
		user.getLogin();
		user.getSenha();
		
		String root = user.nome;*/
		/*
		var nome="José";
		var idade=30;
		//System.out.println(((Object)idade).getClass().getTypeName());
		//System.out.println(nome.getClass().getTypeName());
		System.out.println(idade);
		final var mensagem = String.format("O %s têm %d anos",nome,idade);
		System.out.println(mensagem);
		var test = "AB CD EF".replace(" ","#");
		System.out.println(test);
		IntStream.of(1,2,3,4,5).forEach(n -> {
			System.out.println(n);			
		});
		IntStream.range(1,6).forEach(n -> {
			System.out.println("Numero: "+n);			
		});
		*/
		
		
		//trabalhando com datas
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateNascString = "05-05-1992 14:00:00";
		String dateCompString = "15-05-2010 00:00:00";
		
		Date dateNasc = sdf.parse(dateNascString);
		Date dateComp = sdf.parse(dateCompString);
		
		System.out.println("Data de Nascimento em milisegundos: "+dateNasc.getTime());
		
		System.out.println("A data de nascimento é anterior a data comparada? "+dateNasc.before(dateComp));
		System.out.println("A data de nascimento é sucessor a data comparada? "+dateNasc.after(dateComp));
		*/
		//trabalhando com calendario
		/*
		SimpleDateFormat sdfCal = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Informe a data no formato (dd/mm/aaaa):");
		String dateVenc = ler.next();
		Date dateV;
		try {
			dateV = sdfCal.parse(dateVenc);
			Calendar calendarVen = Calendar.getInstance();
			calendarVen.setTime(dateV);
			calendarVen.add(Calendar.DATE, 10);
			if (calendarVen.get(Calendar.DAY_OF_WEEK) == 7){ 
				calendarVen.add(Calendar.DATE, 2);
			}else if (calendarVen.get(Calendar.DAY_OF_WEEK) == 1){
				calendarVen.add(Calendar.DATE, 1);
			}
			String anoVenc = String.valueOf(calendarVen.get(Calendar.YEAR));
			String mesVenc = String.valueOf(calendarVen.get(Calendar.MONTH)+1);
			String diaVenc = String.valueOf(calendarVen.get(Calendar.DAY_OF_MONTH));
			String dataSt = String.format("%s/%s/%s",diaVenc,mesVenc,anoVenc);
			System.out.println("Você pode pagar ate a data "+dataSt+" que nao paga juros");
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
	}
}