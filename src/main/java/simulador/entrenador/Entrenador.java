package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    // Propiedades
    private String nombre;
    private List<Pokemon> pokemones;

    // Constructor
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    // Método para agregar un Pokémon al equipo del entrenador
    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

    // Método para entrenar a un Pokémon y mejorar sus estadísticas
    public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar();
    }

    // Método para mostrar los Pokémones actuales del entrenador
    public void mostrarPokemones() {
        System.out.println("Pokemones de " + nombre + ":");
        for (Pokemon pokemon : pokemones) {
            System.out.println("- " + pokemon.nombre);
        }
    }

    // Método para seleccionar un Pokémon de su equipo para participar en una batalla
    public Pokemon prepararBatalla() {
        if (pokemones.isEmpty()) {
            System.out.println("No hay pokemones disponibles para la batalla.");
            return null;
        }
        // Por simplicidad, seleccionaremos el primer Pokémon del equipo para la batalla
        return pokemones.get(0);
    }
}

