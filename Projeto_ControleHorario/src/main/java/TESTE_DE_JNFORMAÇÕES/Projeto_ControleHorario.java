/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TESTE_DE_JNFORMAÇÕES;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gustavo Mendes
 */
public class Projeto_ControleHorario {

    public static void main(String[] args) {
         // Obtendo a data e hora local atual
        LocalDateTime dataHoraLocal = LocalDateTime.now();

        // Obtendo a representação de LocalTime para a hora
        LocalTime horaLocal = dataHoraLocal.toLocalTime();

        // Obtendo a representação de LocalDate para a data
        LocalDate dataLocal = dataHoraLocal.toLocalDate();
        
        // Exibindo a hora e a data separadamente
        System.out.println("Hora: " + horaLocal);
        System.out.println("Data: " + dataLocal);

        
        String teste = String.valueOf(horaLocal);
        String teste2 = String.valueOf(dataLocal);
        
        System.err.println();
        
        System.err.println("teste importante:");
        System.err.println(teste);
        System.err.println(teste2);
        
        String teste3 = teste.concat(" " + teste2);
        System.err.println(teste3);
        
        System.out.println();
        
        
        // Formatando a hora e a data separadamente, se necessário
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String horaFormatada = horaLocal.format(horaFormatter);
        String testeData = dataLocal.toString();
        String dataFormatada = dataLocal.format(dataFormatter);

        // Exibindo a hora e a data formatadas separadamente
        System.out.println("Hora formatada: " + horaFormatada);
        System.out.println("Data formatada: " + dataFormatada);
        
        DateTimeFormatter HoraTeste = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter DataTeste = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        String TesteHora = dataHoraLocal.format(HoraTeste);
        String TesteData = dataHoraLocal.format(DataTeste);
        
        
        /*String HoraTeste = 
        String DataTeste = String.valueOf();*/
        
        System.out.println();
        
        System.out.println("Hora em String: " + TesteHora);
        System.out.println("Data em String: " + TesteData);


        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        LocalDateTime dt1= LocalDateTime.parse("11-02-2024 21:00:00", f);
        LocalDateTime dt2= LocalDateTime.parse("11-02-2024 22:30:15", f);

        long diferencaSeg = Duration.between(dt1, dt2).toSecondsPart();
        long diferencaMin = Duration.between(dt1, dt2).toMinutesPart();
        long diferencaHor = Duration.between(dt1, dt2).toHoursPart();
        
        System.err.println("Teste " + diferencaHor + ":" + diferencaMin + ":" + diferencaSeg);
        
    }
}
