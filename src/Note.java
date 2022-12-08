import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Note extends AbstractNote implements WriteToFile{
    private String header;
    private static ArrayList<Note> list = new ArrayList<>();


    public Note(String text, LocalDate localDate, TypeNote TYPENOTE, String header) {
        super(text, localDate, TYPENOTE);
        this.header = header;
        list.add(this);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "Note{" +
                "header='" + header + '\'' +
                '}';
    }

    public static ArrayList<Note> getList() {
        return list;
    }

    public static void setList(ArrayList<Note> list) {
        Note.list = list;
    }

    @Override
    public void createWrite() throws IOException {
        FileWriter fileWriter = new FileWriter("NoteBook.txt", true);
        fileWriter.write("\n      Дата создания заметки: " + getLocalDate() + "\nТекст заметки: " + getText() +
                "\nТип заметки: "+ getTypenote() + "\nЗаголовок: " + getHeader() + "\n");
    }
}
