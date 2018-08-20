package com.curso.model;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class FormatFecha {
    static public final String FMT_ISO = "yyyy-MM-dd";
    
    static public String format(String formato, Date date) {
        return new SimpleDateFormat(formato).format(date);
    }

    /**
     * Formate la fecha a ISO automaticamente
     * @param date
     * @return 
     */
    static public String format(Date date) {
        return new SimpleDateFormat(FMT_ISO).format(date);
    }

    /**
     * En su lugar utilizar format(Date date)
     * @param date
     * @return 
     */
    @Deprecated
    static public String formatToISO(Date date) {
        return new SimpleDateFormat(FMT_ISO).format(date);
    }
}
