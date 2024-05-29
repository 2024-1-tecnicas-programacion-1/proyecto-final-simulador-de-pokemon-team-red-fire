package simulador.batalla;

import simulador.pokemon.Pokemon;

public class Batalla {
    
   
    
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
       System.out.println("Comienza la batalla entre " + pokemon1.getNombrePokemon() + " y " + pokemon2.getNombrePokemon() + "!");
        
        while (pokemon1.getSaludPokemon() > 0 && pokemon2.getSaludPokemon() > 0) {
            
            System.out.println(pokemon1.getNombrePokemon() + " ataca a " + pokemon2.getNombrePokemon() + "!");
            pokemon1.atacar(pokemon2);
            if (pokemon2.getSaludPokemon() <= 0) {
                System.out.println(pokemon2.getNombrePokemon() + " ha sido debilitado.");
                break;
            }
            
            
            System.out.println(pokemon2.getNombrePokemon() + " contraataca a " + pokemon1.getNombrePokemon() + "!");
            pokemon2.atacar(pokemon1);
            if (pokemon1.getSaludPokemon() <= 0) {
                System.out.println(pokemon1.getNombrePokemon() + " ha sido debilitado.");
                break;
            }
        }
        
        
        if (pokemon1.getSaludPokemon() > 0) {
            System.out.println(pokemon1.getNombrePokemon() + " es el ganador!");
        } else if (pokemon2.getSaludPokemon() > 0) {
            System.out.println(pokemon2.getNombrePokemon() + " es el ganador!");
        } else {
            System.out.println("La batalla termina en empate.");
        }
    }
}

