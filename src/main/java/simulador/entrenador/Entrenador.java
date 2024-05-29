package simulador.entrenador;

import java.util.ArrayList;
import java.util.List;
import simulador.pokemon.Pokemon;

public class Entrenador {
    // Propiedades
    private String nombre;
    private List<Pokemon> pokemones;

    // Constructor
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  

    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

    
    public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar();
    }

    
    public void mostrarPokemones() {
        System.out.println("Pokemones de " + nombre + ":");
        for (Pokemon pokemon : pokemones) {
            System.out.println("- " + pokemon.getNombrePokemon());
        }
    }

    
    public Pokemon prepararBatalla() {
        if (pokemones.isEmpty()) {
            System.out.println("No hay pokemones disponibles para la batalla.");
            return null;
        }
        
        return pokemones.get(0);
    }
}

