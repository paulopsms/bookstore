package livraria.testejava.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Paulo S
 */

public class DateUtils {
    
    public static String getDataAtual() {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(new Date());
    }
}
