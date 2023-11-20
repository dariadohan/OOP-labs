public class Main {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();
        Caiet caiet1 = new Caiet("Matematica");
        Caiet caiet2 = new Caiet("Informatica");
        Caiet caiet3 = new Caiet("Romana");
        Manual manual1 = new Manual("Matematica");
        Manual manual2 = new Manual("Informatica");
        ghiozdan.addCaiet(caiet1);
        ghiozdan.addCaiet(caiet2);
        ghiozdan.addCaiet(caiet3);
        ghiozdan.addManual(manual1);
        ghiozdan.addManual(manual2);
        System.out.println("Nr. total de rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr. de caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr. de manuale: " + ghiozdan.getNrManuale());
        System.out.println("Lista tuturor rechizitelor:");
        ghiozdan.listItems();
        System.out.println("\nLista caietelor:");
        ghiozdan.listCaiet();
        System.out.println("\nLista manualelor:");
        ghiozdan.listManual();
    }
   }
