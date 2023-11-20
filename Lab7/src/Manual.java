public class Manual extends Rechizita {
    public Manual(String eticheta) {
        super();
        this.eticheta = eticheta;
    }
    public String getNume() {
        return "Manual: " + super.eticheta;
    }
}