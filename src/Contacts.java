import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Contacts extends AbstractNote implements WriteToFile{
    private int numberPhone;
    private String nameContact;
    private TypeNumber typenumber;
    private static ArrayList<Contacts> list = new ArrayList<>();

    public Contacts(String text, LocalDate localDate, TypeNote TYPENOTE, int numberPhone, String nameContact, TypeNumber typenumber) {
        super(text, localDate, TYPENOTE);
        this.numberPhone = numberPhone;
        this.nameContact = nameContact;
        this.typenumber = typenumber;
        list.add(this);
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public TypeNumber getTypenumber() {
        return typenumber;
    }

    public void setTypenumber(TypeNumber typenumber) {
        this.typenumber = typenumber;
    }

    public static ArrayList<Contacts> getList() {
        return list;
    }

    public static void setList(ArrayList<Contacts> list) {
        Contacts.list = list;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "numberPhone=" + numberPhone +
                ", nameContact='" + nameContact + '\'' +
                ", typenumber=" + typenumber +
                '}';
    }

    @Override
    public void createWrite() throws IOException {
        FileWriter fileWriter = new FileWriter("NoteBook.txt", true);
        fileWriter.write("\n      Дата создания заметки: " + getLocalDate() + "\nТекст заметки: " + getText() +
                "\nТип заметки: " + getTypenote() + "\nНомер телефона: " + getNumberPhone() +
                "\nИмя контакта: " + getNameContact() + "\nТип номера: " + getTypenumber() + "\n");
    }
    }
