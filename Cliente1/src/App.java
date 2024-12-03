import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner (System.in);


        System.out.println("Definisci il tuo cliente preferito");

        System.out.println("Nome cliente");
        String Nome cliente 0 sc.nextLine();
        

        System.out.println("Cognome cliente");
        String Cognome cliente = sc.nextLine();

        System.out.println("Data di nascita");
        String DatadinascitaStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/aaaa");
        LocalDate Datadiinascita = LocalDate.parse(dataNascitaStr, formatter);


        System.out.println("Numero di telefono");
        String Numero di telefono = sc.nextLine();

        System.out.println("Note");
        String Note = sc.nextLine();

        System.out.println("Email");
        String Email = sc.nextLine()

        System.out.println("Password");
        String Password = sc.nextLine();

        System.out.println("Username");
        String Username = sc.nextLine();

        System.out.println("Data di iscrizione");
        String dataTimeIscrizioneStr = sc.nextLine();
        DateTimeFormatter dateTimeFiFormatter = DateTimeFormatter.ofPattern("dd/mm/aaaa" HH:mm");
        LocalDateTime dataTimeIscrizione = LocalDateTime.parse(dataTimeIscrizioneStr, dateTimeFormatter);



        sc.close();

        System.out.println("Ecco il tuo clinte preferito:");
        System.out.println("Nome:" + Nome);
        System.out.println("Cognome:" + Cognome);
        System.out.println("Data di nascita:" + Data di nascita);
        System.out.println("Numero di telefono:" + Numero di telefono);
        System.out.println("Note:" + Note);
        System.out.println("Email:" + Email);
        System.out.println("Password:" + Password);
        System.out.println("Username:" + Username);
         System.out.println("Data di iscrizione:" + Data di iscrizione);
         
         
        }
    }
         

        





        

        




    























        sc.
    }
}
