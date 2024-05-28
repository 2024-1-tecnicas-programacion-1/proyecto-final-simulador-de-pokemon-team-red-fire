package simulador.pokemon;

// Clase Pikachu
public class Pikachu extends Pokemon {
    public Pikachu(String nombre, int salud, int puntosDeAtaque, EstadoPokemon estado) {
        super(nombre, 35, 55, 5, estado); // Tipo Eléctrico
    }

    @Override
    public void atacar(Pokemon oponente) {
        // Implementación específica del ataque de Pikachu
    }

    // Otros métodos y propiedades específicos de Pikachu
}


