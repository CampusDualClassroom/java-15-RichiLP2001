package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
   /* public int zone;
    public String area;
    public int shelf;
    public int quantity;*/




    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone,
                            String area, String shelf, int quantity, Date fechaVencimiento) {
    super(name,uniqueId,responsibleId,zone, area, shelf, quantity);

    this.fechaEvento= fechaVencimiento;

    }
    public Date getExpirationDate(){
        return this.fechaEvento;
    }
    public String getFormattedDate(Date fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(fecha);

    }


    public String getSpecificData() {
        return "name: "+this.name+" - zona: "+this.zone+" - Area: "+this.area+"\nFecha de caducidad: "+getFormattedDate(fechaEvento);
    }
    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    }





