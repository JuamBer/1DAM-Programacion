package disco;

import multimedia.Multimedia;

public class Disco extends Multimedia {

    public enum generos {
        rock, pop, punk, jazz, rap, indie
    };
    private generos genero;

    public Disco(String titulo, String autor, double duracion, String formato, String genero) {
        super(titulo, autor, duracion, formato);

        switch (genero) {
            case "rock" ->
                this.genero = generos.rock;
            case "pop" ->
                this.genero = generos.pop;
            case "punk" ->
                this.genero = generos.punk;
            case "jazz" ->
                this.genero = generos.jazz;
            case "rap" ->
                this.genero = generos.rap;
            case "indie" ->
                this.genero = generos.indie;
        }
    }

    public generos getGenero() {
        return this.genero;
    }

    @Override
    public String toString() {
        return "pelicula{"
                + "titulo=" + this.titulo
                + ", autor=" + this.autor
                + ", duracion=" + this.duracion
                + ", formato=" + this.formato
                + ", genero=" + this.genero
                + '}';
    }
}
