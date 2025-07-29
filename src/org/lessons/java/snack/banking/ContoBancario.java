package org.lessons.java.snack.banking;

public class ContoBancario {
    private int countCode;
    private double money = 0;
    // private double amountInsered;


    // COSTRUTTORE
    public ContoBancario(int countCode) {
        this.countCode = countCode;
    }
    // GETTER
    public int getCountCode(){
        return countCode;
    }
    public double getMoney(){
        return money;
    }

    // SETTER(METODI VARI)

    public String depositMoney(int amountInsered){
        money += amountInsered;
        return "Hai depositato " + amountInsered + " euro con successo sul tuo conto!";
    }

    public String retriveMoney (int amountRetrived){

        if(money < amountRetrived){
            return "Importo non valido, non hai abbastanza saldo";
        }
        else{
            money -= amountRetrived;
            return "Hai ritirato " + amountRetrived + " euro con successo dal tuo conto!";
        }
    } 

    // public String depositMoney(Double amountInsered){
    //     money += amountInsered;
    //     return "Hai depositato " + amountInsered + "euro";
    // }

}
