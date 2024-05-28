package simulador.pokemon;

// Clase Charmander
public class Charmander extends Pokemon {
    public Charmander(String nombre, int salud, int puntosDeAtaque, EstadoPokemon estado) {
        super(nombre, 39, 51, 1, estado); // Tipo Fuego
    }

    @Override
    public void atacar(Pokemon oponente) {
        // Implementación específica del ataque de Charmander
    }

    // Otros métodos y propiedades específicos de Charmander
}
