package simulador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entrenador entrenador = new Entrenador("Ash"); // Crear un entrenador
        
        // Menú principal
        int opcion;
        do {
            System.out.println("Bienvenido al Simulador Pokémon");
            System.out.println("1. Capturar Pokémon");
            System.out.println("2. Entrenar Pokémon");
            System.out.println("3. Mostrar Pokémones del Entrenador");
            System.out.println("4. Preparar Batalla");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Aquí puedes implementar la lógica para capturar un Pokémon
                    break;
                case 2:
                    // Aquí puedes implementar la lógica para entrenar un Pokémon
                    break;
                case 3:
                    entrenador.mostrarPokemones();
                    break;
                case 4:
                    Pokemon pokemonBatalla = entrenador.prepararBatalla();
                    if (pokemonBatalla != null) {
                        // Aquí puedes implementar la lógica para iniciar una batalla
                        Batalla batalla = new Batalla();
                        Pokemon otroPokemon = new Pokemon("Pikachu", 100, 20, TipoPokemon.ELECTRICO);
                        batalla.iniciarBatalla(pokemonBatalla, otroPokemon);
                    }
                    break;
                case 5:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}

