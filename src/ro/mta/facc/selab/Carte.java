package ro.mta.facc.selab;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private int nrPagini;

    @Override
    public int compareTo(Carte o) {
        if(this.nrPagini<o.nrPagini)
            return -1;
        if(this.nrPagini>o.nrPagini)
            return 1;
        return 0;

        //return Integer.compare(this.nrPagini,o.nrPagini);
    }

    public Carte(String titlu, String autor, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
      return this.titlu + " " + " scrisa de " + this.autor;
    }
}
