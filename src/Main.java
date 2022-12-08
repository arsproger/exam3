import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Note note1 = new Note("Сделать д/з", localDate, TypeNote.IDEAS, "Java");
        Duty note2 = new Duty("Оплатить за хостинг", localDate, TypeNote.DUTY, "Hosting", 15000);
        Note note3 = new Note("Закончить проект", localDate, TypeNote.IDEAS, "Ruby");

        Contacts contacts1 = new Contacts("Add contact 1", localDate, TypeNote.IDEAS,996504,
                "Bob", TypeNumber.CITY);
        Contacts contacts2 = new Contacts("Add contact 2", localDate, TypeNote.IDEAS, 996505,
                "Masha", TypeNumber.CITY);
        Contacts contacts3 = new Contacts("Add contact 3", localDate, TypeNote.IDEAS, 996506,
                "Sasha", TypeNumber.MOBILE);


        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt", true);
            for(Note note : Note.getList()) {
                note.createWrite();
            }
            for(Contacts contact : Contacts.getList()) {
                contact.createWrite();
            }
            System.out.println("Успешная запись!");
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("Ошибка записи!");
        }
    }
}