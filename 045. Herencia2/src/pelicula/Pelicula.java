package pelicula;

import multimedia.Multimedia;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, double duracion, String formato, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, duracion, formato);

        if (actorPrincipal == null && actrizPrincipal == null) {
            System.out.println("Error");
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }

    public String getActorPrincipal() {
        return this.actorPrincipal;
    }

    public String getActrizPrincipal() {
        return this.actrizPrincipal;
    }

    @Override
    public String toString() {
        return "pelicula{"
                + "titulo=" + this.titulo
                + ", autor=" + this.autor
                + ", duracion=" + this.duracion
                + ", formato=" + this.formato
                + ", actorPrincipal=" + this.actorPrincipal
                + ", actrizPrincipal=" + this.actrizPrincipal
                + '}';
    }
}
