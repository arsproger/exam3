import java.time.LocalDate;

public class Duty extends Note {
    private double sumDuty;

    public Duty(String text, LocalDate localDate, TypeNote TYPENOTE, String header, double sumDuty) {
        super(text, localDate, TYPENOTE, header);
        this.sumDuty = sumDuty;
    }

    public double getSumDuty() {
        return sumDuty;
    }

    public void setSumDuty(double sumDuty) {
        this.sumDuty = sumDuty;
    }

    @Override
    public String toString() {
        return "Duty{" +
                "sumDuty=" + sumDuty +
                '}';
    }
}
