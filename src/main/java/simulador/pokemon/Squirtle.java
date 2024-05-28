
package simulador.pokemon;

public class Squirtle extends Pokemon {
    public Squirtle(String nombre, int salud, int puntosDeAtaque, EstadoPokemon estado) {
        super(nombre, 44, 48, 2, estado); // Tipo Fuego
    }

    @Override
    public void atacar(Pokemon oponente) {
        // Implementación específica del ataque de Charmander
    }

    // Otros métodos y propiedades específicos de Charmander
}