package com.combobox;

import java.util.Date;

public class ComboBox {
	
   public static void main(String[] args) {

	   Date date1 = new Date();

       Date date2 = new Date();

       System.out.println((date1.getTime() > date2.getTime())?
               "date1 позже date2" : "date1 раньше date2");
   
   }
}
