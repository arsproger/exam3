import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Note note1 = new Note("������� �/�", localDate, TypeNote.IDEAS, "Java");
        Duty note2 = new Duty("�������� �� �������", localDate, TypeNote.DUTY, "Hosting", 15000);
        Note note3 = new Note("��������� ������", localDate, TypeNote.IDEAS, "Ruby");

        Contacts contacts1 = new Contacts("Add contact 1", localDate, TypeNote.IDEAS,996504,
                "Bob", TypeNumber.CITY);
        Contacts contacts2 = new Contacts("Add contact 2", localDate, TypeNote.IDEAS, 996505,
                "Masha", TypeNumber.CITY);
        Contacts contacts3 = new Contacts("Add contact 3", localDate, TypeNote.IDEAS, 996506,
                "Sasha", TypeNumber.MOBILE);


        try {
            FileWriter fileWriter = new FileWriter("NoteBook.txt");
            for(Note note : Note.getList()) {
//                fileWriter.write(note.toString() + "\n");
                fileWriter.write("\n      ���� �������� �������: " + note.getLocalDate() + "\n����� �������: " + note.getText() +
                        "\n��� �������: "+ note.getTypenote() + "\n���������: " + note.getHeader() + "\n");
            }
            for(Contacts contact : Contacts.getList()) {
//                fileWriter.write(contact.toString() + "\n");
                fileWriter.write("\n      ���� �������� �������: " + contact.getLocalDate() + "\n����� �������: " + contact.getText() +
                        "\n��� �������: " + contact.getTypenote() + "\n����� ��������: " + contact.getNumberPhone() +
                        "\n��� ��������: " + contact.getNameContact() + "\n��� ������: " + contact.getTypenumber() + "\n");
            }
            System.out.println("�������� ������!");
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("������ ������!");
        }
    }
}