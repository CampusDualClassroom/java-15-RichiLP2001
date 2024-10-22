package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise15 {

	public static void main(String[] args) {
		//creamos primero nuestra variable Calendar-->
		Calendar calendario = Calendar.getInstance();
		// es la fecha de hoy MAS (amount) N meses-->
		calendario.add(Calendar.MONTH, 1);
		FreshMerchandise fm= new FreshMerchandise("manzanas","001-9",
				"Frutería de ayer S.L.",8,
				"C","114D",53, calendario.getTime());
		fm.printSpecificData();

		}

		//fm.printSpecificData();
		//System.out.println(fm.getLocation());

	}


