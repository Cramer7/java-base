package esercizi;

public class ConteggioSecondi {

    public static void conteggioGiorni(int s){
       int giorni =  s/24/60/60;
       int ore = s/60/60;
       int minuti =s/60;
        System.out.println("Giorni " + giorni + " Ore " + ore + " Minuti " + minuti);
    }

    public static void main(String[] args) {
        conteggioGiorni(86400);
    }
}
