import java.util.ArrayList;
import java.util.List;
public class Ghiozdan {
    private List<Object> rechizite;
    public Ghiozdan(){
        this.rechizite = new ArrayList<>();
    }
    public void addCaiet(Caiet caiet){
        rechizite.add(caiet);
    }
    public void addManual(Manual manual){
        rechizite.add(manual);
    }
    public void listItems() {
        for (Object rechizita : rechizite) {
            System.out.println(((Rechizita) rechizita).getNume());
        }
    }
    public void listManual() {
        for (Object rechizita : rechizite) {
            if (rechizita instanceof Manual) {
                System.out.println(((Manual) rechizita).getNume());
            }
        }
    }
    public void listCaiet() {
        for (Object rechizita : rechizite) {
            if (rechizita instanceof Caiet) {
                System.out.println(((Caiet) rechizita).getNume());
            }
        }
    }
    public int getNrRechizite() {
        return rechizite.size();
    }
    public int getNrManuale() {
        int c= 0;
        for (Object rechizita : rechizite) {
            if (rechizita instanceof Manual) {
                c++;
            }
        }
        return c;
    }
    public int getNrCaiete() {
        int c = 0;
        for (Object rechizita : rechizite) {
            if (rechizita instanceof Caiet) {
                c++;
            }
        }
        return c;
    }
}
