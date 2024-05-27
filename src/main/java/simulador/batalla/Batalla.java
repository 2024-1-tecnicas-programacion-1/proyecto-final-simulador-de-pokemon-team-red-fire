package simulador.batalla;

public class Batalla {
    // Método para iniciar una batalla entre dos Pokémones
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Comienza la batalla entre " + pokemon1.nombre + " y " + pokemon2.nombre + "!");
        
        while (pokemon1.salud > 0 && pokemon2.salud > 0) {
            // Turno del primer Pokémon
            System.out.println(pokemon1.nombre + " ataca a " + pokemon2.nombre + "!");
            pokemon1.atacar(pokemon2);
            if (pokemon2.salud <= 0) {
                System.out.println(pokemon2.nombre + " ha sido debilitado.");
                break;
            }
            
            // Turno del segundo Pokémon
            System.out.println(pokemon2.nombre + " contraataca a " + pokemon1.nombre + "!");
            pokemon2.atacar(pokemon1);
            if (pokemon1.salud <= 0) {
                System.out.println(pokemon1.nombre + " ha sido debilitado.");
                break;
            }
        }
        
        // Determinación del ganador
        if (pokemon1.salud > 0) {
            System.out.println(pokemon1.nombre + " es el ganador!");
        } else if (pokemon2.salud > 0) {
            System.out.println(pokemon2.nombre + " es el ganador!");
        } else {
            System.out.println("La batalla termina en empate.");
        }
    }
}
