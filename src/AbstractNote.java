import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class AbstractNote {
    private String text;
    private LocalDate localDate;
    private TypeNote typeNote;

    public AbstractNote(String text, LocalDate localDate, TypeNote typeNote) {
        this.text = text;
        this.localDate = localDate;
        this.typeNote = typeNote;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public TypeNote getTypenote() {
        return typeNote;
    }

    public void setTypenote(TypeNote TYPENOTE) {
        this.typeNote = TYPENOTE;
    }

    @Override
    public String toString() {
        return "AbstractNote{" +
                "text='" + text + '\'' +
                ", localDate=" + localDate +
                ", typenote=" + typeNote +
                '}';
    }
}
