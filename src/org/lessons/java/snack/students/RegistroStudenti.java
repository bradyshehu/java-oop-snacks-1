package org.lessons.java.snack.students;

public class RegistroStudenti {

    private Studente[] registroStudenti;

    public RegistroStudenti() {
        this.registroStudenti = new Studente[0];
    }

    public void addStudents (Studente studente) {
        
        Studente[] registroAggiornato = new Studente[registroStudenti.length + 1];
        System.arraycopy(registroStudenti, 0, registroAggiornato, 0, registroStudenti.length);
        
        registroAggiornato[registroAggiornato.length - 1] = studente;
        registroStudenti = registroAggiornato;
    }

    public void printStudents () {
        for (int i = 0; i < registroStudenti.length; i++){
            System.out.print("Nome: " + registroStudenti[i].getName() + ". ");
            System.out.print("Cognome: " + registroStudenti[i].getLastName() + ". ");
            System.out.println("Etá: " + registroStudenti[i].getAge() + "anni.");
        }
    }

}
