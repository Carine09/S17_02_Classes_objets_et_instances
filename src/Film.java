public class Film {
    public String title;
    public Integer released_date;
    public Realisatrice realisatrice;

    public Film(String title, Integer released_date, Realisatrice realisatrice) {
        this.title = title;
        this.released_date = released_date;
        this.realisatrice = realisatrice;
    }

    /* public void writeSentence(){
        System.out.print(this.title + ", est sorti en " + this.released_date + ", et réalisé par " + this.realisatrice.firstname + " " + this.realisatrice.lastname + ".");
    } */
    public static void writeSentence(Film myfilm){
        System.out.print(myfilm.title + ", est sorti en " + myfilm.released_date + ", et réalisé par " + myfilm.realisatrice.firstname + " " + myfilm.realisatrice.lastname + ".");
    }
}
