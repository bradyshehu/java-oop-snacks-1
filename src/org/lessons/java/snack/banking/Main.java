package org.lessons.java.snack.banking;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Benvenuto nel nostro sistema bancario, per procedere inserisci il tuo numero di conto: ");
        int countCode = sc.nextInt();
        sc.nextLine();

        ContoBancario userContoBancario = new ContoBancario(countCode);


        boolean isOperating = true;

        while(isOperating){

        System.out.println("Scegli l'operazione che vuoi eseguire:");
        System.out.println("Visualizzare il tuo conto (scrivi 1)");
        System.out.println("Depositare sul tuo conto (scrivi 2)");
        System.out.println("Prelevare sul tuo conto (scrivi 3)");
        System.out.println("Per interrompere tutto (scrivi 4)");

        int choice = sc.nextInt();
        sc.nextLine();


        switch (choice) {
            case 1:
                System.out.println("Il tuo saldo é di " + userContoBancario.getMoney() + " euro!" );
                break;
            case 2:

                System.out.print("Inserisci l'importo da depositare: ");
                int amountToInsert = sc.nextInt();
                sc.nextLine();
                System.out.println(userContoBancario.depositMoney(amountToInsert));
                break;
                
            case 3:
                System.out.print("Inserisci l'importo da prelevare: ");
                int amountToRetrive = sc.nextInt();
                sc.nextLine();
                System.out.println(userContoBancario.retriveMoney(amountToRetrive));
                break;
            case 4:
                isOperating = false;
                System.out.println("Arrivederci!");
                break;
        
            default:
                System.out.println("Non hai scelto nessuna operazione valida");

                break;
        }
    }
        sc.close();
    }
    
}
