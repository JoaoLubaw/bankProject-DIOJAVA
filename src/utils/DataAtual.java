package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataAtual {
    public static String getDataAtual() {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formatter);
        
        return dataFormatada;
    }
}
