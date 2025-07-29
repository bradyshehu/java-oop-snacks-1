package org.lessons.java.snack.students;

public class Main {
    public static void main(String[] args) {
        Studente brady = new Studente("Brady", "Shehu", 24);
        Studente davide = new Studente("Davide", "Fiorini", 24);
        Studente angelo = new Studente("Angelo", "Di Re", 25);
        Studente bruno = new Studente("Bruno", "Shehu", 23);
        Studente emiliano = new Studente("Emiliano", "Angelini", 24);
        // System.out.println(brady.getStudentInfos());
        // System.out.println(davide.getStudentInfos());
        // System.out.println(emiliano.getStudentInfos());


        RegistroStudenti registroStudenti = new RegistroStudenti();
        
        registroStudenti.addStudents(brady);
        registroStudenti.addStudents(davide);
        registroStudenti.addStudents(angelo);
        registroStudenti.addStudents(bruno);
        registroStudenti.addStudents(emiliano);

        registroStudenti.printStudents();
    }
}
