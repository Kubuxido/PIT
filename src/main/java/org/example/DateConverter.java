import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
    // Método para converter data do formato YYYY-MM-DD para DD/MM/YYYY
    public static String convertDateFormat(String dateString) throws ParseException {
        // Define os formatos de data
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Converte a string de data para objeto Date
        Date date = inputFormat.parse(dateString);
        // Retorna a data no formato DD/MM/YYYY
        return outputFormat.format(date);
    }

    public static void main(String[] args) {
        // Exemplo de uso do método
        String dateInput = "2025-04-07";
        try {
            String convertedDate = convertDateFormat(dateInput);
            System.out.println("Data convertida: " + convertedDate);
        } catch (ParseException e) {
            System.err.println("Data inválida. Por favor, use o formato YYYY-MM-DD.");
        }
    }
}