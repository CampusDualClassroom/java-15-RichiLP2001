package com.campusdual.classroom;

import com.campusdual.util.Utils;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
   /* public int zone;
    public String area;
    public int shelf;
    public int quantity;*/



    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone,
                            String area, int shelf, int quantity) {
    super(name,uniqueId,responsibleId);
    this.zone=zone;
    this.area=area;
    this.shelf=shelf;
    this.quantity=quantity;


    }
    //public FreshMerchandise(Date fechaEvento)


 //-->
 /*public String toString(){
    System.out.println("Nombre: "+this.name+" Fecha caducidad: "+this.fechaEvento);

   }*/
 public void aisgnarFechaEvento(String fechaVencimiento, String fechaString ){
  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
   try {
    //convertir la cadena de texto en un objeto Date
    Date fecha= formatoFecha.parse(fechaString);
    //Asignar la fecha convertida al evento
    Merchandise.setFechaEvento(fecha);
    //confirmacion de la asignacion
    System.out.println("Fecha asignada: "+ formatoFecha.format(Merchandise.getFechaEvento()));
   } catch (ParseException e){
    System.out.println("Error al converitr la fecha: "+ e.getMessage());
   }
 }


    }


