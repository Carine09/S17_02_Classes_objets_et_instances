public class Main {
    public static void main(String[] args) {
        Realisatrice maReal= new Realisatrice("Justine", "Triet", 1990);
        Film filmOne = new Film("Anatomie d'une chute", 2023, maReal);
        Film.writeSentence(filmOne);
    }

    /* public static void writeSentence(Film myFilm){
        System.out.print(myFilm.title + ", est sorti en " + myFilm.released_date + ", et réalisé par " + myFilm.realisatrice.firstname + " " + myFilm.realisatrice.lastname + ".");
    } */
}
