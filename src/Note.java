import java.time.LocalDate;
import java.util.ArrayList;

public class Note extends AbstractNote{
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
}
