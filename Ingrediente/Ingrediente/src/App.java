import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);


        System.out.println("Crea il tuo ingrediente");


        System.out.println("Nome ingrediente");
        String nome = sc.nextLine();

        System.out.println("Foto ingrediente");
        String foto ingrediente = sc.nextLine();

        System.out.println("Allergeni");
        String allergeni = sc.nextLine();

        System.out.println("Tipologia ingrediente");
        Byte tipologia ingrediente = sc.nextByte();
        

        System.out.println("Disponibilià");
        Integer disponibilità = sc.nextBoolean();
        sc.nextLine(); //consumo carattere di fine riga

        System.out.println("Costo");
        Double costo del piatto = sc.nextDouble();

        System.out.println("Modalità di conservazione");
        Byte modalità di conservazione = sc.nextByte();

        System.out.println("Descrizione ingrediente");
        String descrizione ingrediente = sc.nextLine();



        sc.close();


        //-------------------------------------------------------------------

        System.out.println("Il tuo ingrediente:");

        System.out.println("Nome ingrediente:" + Nome ingrediente);
        System.out.println("Foto:" + Foto);
        System.out.println("Allergeni:" + Allergeni);
        System.out.println("Tipologia:" + Tipologia);
        System.out.println("Disponibilità:" + Disponibilità);
        System.out.println("Costo:"+ Costo);
        System.out.println("Modalità di conservazione:" + Modalità di conservazione);
        System.out.println("Descrizione ingrediente:" + Descrizione ingrediente);


    }
}
