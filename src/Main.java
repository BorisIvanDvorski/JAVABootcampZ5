import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Record record = new Record();
        boolean radi = true;
        try{
            while (radi) {
                System.out.println("Odaberite opciju:\n1. Dodaj studenta\n2. Pretraga po indeksu\n3. Ispiši sve studente\n4. Izlaz");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Unesite ime: ");
                        String name = scanner.next();
                        System.out.print("Unesite prezime: ");
                        String surname = scanner.next();
                        System.out.print("Unesite godinu studija: ");
                        int yearOfStudy = scanner.nextInt();
                        System.out.print("Unesite indeks: ");
                        String indexNum = scanner.next();
                        if(!record.checkIndexUnique(indexNum)){
                            System.out.println("Uneseni indeks je već zauzet!");
                        }
                        else {
                            Student newStudent = new Student(name, surname, yearOfStudy, indexNum);
                            record.addStudent(newStudent);
                            System.out.println("Student dodan.");
                        }
                        break;
                    case 2:
                        System.out.print("Unesite indeks: ");
                        indexNum = scanner.next();
                        Student student = record.findStudent(indexNum);
                        if(student!=null){
                            System.out.println("Student pronađen: "+student);
                        }
                        else {
                            System.out.println("Student nije pronađen!");
                        }
                        break;
                    case 3:
                        System.out.println("Popis svih studenata:");
                        record.printAllStudents();
                        break;
                    case 4:
                        radi=false;
                        break;
                }
            }
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}