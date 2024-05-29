import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import simulador.batalla.Batalla;
import simulador.pokemon.EstadoPokemon;
import simulador.pokemon.TipoPokemon;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Entrenador> entrenadores = new HashMap<>();
    private static Entrenador entrenador1;
    private static Entrenador entrenador2;
    private static Pokemon pokemonEntrenador1;
    private static Pokemon pokemonEntrenador2;

    public static void main(String[] args) {
        int opcion;
        
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemones();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("Menú Principal");
        System.out.println("Simulador de Batallas Pokémon");
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokémones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");
        System.out.println("Elige una opción:");
    }

    private static void gestionarEntrenadores() {
        int opcion;
        
        do {
            System.out.println("\nSubmenú 1: Gestionar Entrenadores");
            System.out.println("Gestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.println("Elige una opción:");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    registrarNuevoEntrenador();
                    break;
                case 2:
                    verListaEntrenadores();
                    break;
                case 3:
                    seleccionarEntrenador();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 4);
    }

    private static void registrarNuevoEntrenador() {
        System.out.println("Registrar nuevo entrenador");
        System.out.println("Ingresa el nombre del nuevo entrenador:");
        String nombre = scanner.nextLine();
        Entrenador entrenador = new Entrenador(nombre);
        entrenadores.put(nombre, entrenador);
        System.out.println("Entrenador '" + nombre + "' registrado exitosamente.");
    }

    private static void verListaEntrenadores() {
        System.out.println("\nLista de entrenadores:");
        for (String nombre : entrenadores.keySet()) {
            System.out.println("- " + nombre);
        }
    }

    private static void seleccionarEntrenador() {
        System.out.println("Seleccionar un entrenador");
        System.out.println("Ingresa el nombre del entrenador:");
        String nombre = scanner.nextLine();
        Entrenador entrenador = entrenadores.get(nombre);
        if (entrenador == null) {
            System.out.println("Entrenador no encontrado.");
            return;
        }

        int opcion;
        do {
            System.out.println("\nAl Seleccionar un Entrenador (Dentro de \"Gestionar Entrenadores\")");
            System.out.println("Nombre del Entrenador: " + nombre);
            System.out.println("1. Ver equipo de Pokémones");
            System.out.println("2. Agregar Pokémon al equipo");
            System.out.println("3. Entrenar Pokémon");
            System.out.println("4. Volver a Gestionar Entrenadores");
            System.out.println("Elige una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    entrenador.mostrarEquipoPokemon();
                    break;
                case 2:
                    // nn
                    break;
                case 3:
                    // nn
                    break;
                case 4:
                    break; 
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 4);
    }

    private static void gestionarPokemones() {
        System.out.println("\nSubmenú 2: Gestionar Pokémones");
        System.out.println("1. Ver todos los Pokémones registrados");
        System.out.println("2. Registrar nuevo Pokémon");
        System.out.println("3. Volver al menú principal");
        System.out.print("Elige una opción: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                verTodosLosPokemones();
                break;
            case 2:
                registrarNuevoPokemon();
                break;
            case 3:
                return;
            default:
                System.out.println("Opción no válida");
        }
    }

    private static void verTodosLosPokemones() {
        System.out.println("Todos los Pokémones registrados:");
        for (Entrenador entrenador : entrenadores.values()) {
            for (Pokemon pokemon : entrenador.mostrarPokemones()) {
                System.out.println("- " + pokemon.getNombrePokemon() + " (Tipo: " + pokemon.getTipoPokemon() + ", Salud: " + pokemon.getSaludPokemon() + ")");
            }
        }
    }

    private static void registrarNuevoPokemon() {
        System.out.println("Registrar nuevo Pokémon");
        System.out.print("Ingrese el nombre del nuevo Pokémon: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo del nuevo Pokémon (FUEGO, AGUA, VENENO, ELECTRICO, PSIQUICO, LUCHA): ");
        TipoPokemon tipo = TipoPokemon.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Ingrese la salud inicial del nuevo Pokémon: ");
        int salud = scanner.nextInt();
        scanner.nextLine(); 

        
      
    }

    private static void iniciarBatalla() {
        System.out.println("\nSubmenú 3: Iniciar Batalla");
        System.out.println("Iniciar Batalla");
        System.out.println("1. Elegir entrenador 1");
        System.out.println("2. Elegir entrenador 2");
        System.out.println("3. Seleccionar Pokémon de entrenador 1");
        System.out.println("4. Seleccionar Pokémon de entrenador 2");
        System.out.println("5. Comenzar batalla");
        System.out.println("6. Volver al menú principal");
        System.out.println("Elige una opción:");
        
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                elegirEntrenador(1);
                break;
            case 2:
                elegirEntrenador(2);
                break;
            case 3:
                seleccionarPokemon(1);
                break;
            case 4:
                seleccionarPokemon(2);
                break;
            case 5:
                comenzarBatalla();
                break;
            case 6:
                return;
            default:
                System.out.println("Opción no válida");
        }
    }

    private static void elegirEntrenador(int numero) {
        System.out.print("Ingrese el nombre del entrenador " + numero + ": ");
        String nombre = scanner.nextLine();
        Entrenador entrenador = entrenadores.get(nombre);

        if (entrenador == null) {
            System.out.println("Entrenador no encontrado.");
        } else {
            if (numero == 1) {
                entrenador1 = entrenador;
            } else {
                entrenador2 = entrenador;
            }
            System.out.println("Entrenador " + numero + " seleccionado correctamente.");
        }
    }

    private static void seleccionarPokemon(int numero) {
        Entrenador entrenador = (numero == 1) ? entrenador1 : entrenador2;
        if (entrenador == null) {
            System.out.println("Primero selecciona un entrenador correspondiente.");
            return;
        }

        System.out.println("Seleccionar Pokémon de entrenador " + numero);
        entrenador.mostrarEquipoPokemon();
        System.out.print("Ingrese el nombre del Pokémon: ");
        String nombrePokemon = scanner.nextLine();
        Pokemon pokemon = entrenador.obtenerPokemon(nombrePokemon);

        if (pokemon == null) {
            System.out.println("Pokémon no encontrado en el equipo del entrenador.");
        } else {
            if (numero == 1) {
                pokemonEntrenador1 = pokemon;
            } else {
                pokemonEntrenador2 = pokemon;
            }
            System.out.println("Pokémon seleccionado correctamente.");
        }
    }

    private static void comenzarBatalla() {
        if (entrenador1 == null || entrenador2 == null || pokemonEntrenador1 == null || pokemonEntrenador2 == null) {
            System.out.println("Faltan datos para iniciar la batalla. Asegúrate de seleccionar ambos entrenadores y sus Pokémon.");
            return;
        }
Pokemon pokemon1 = new Pokemon(pokemonEntrenador1.getNombrePokemon(), pokemonEntrenador1.getSaludPokemon(), pokemonEntrenador1.getPuntosDeAtaque(), pokemonEntrenador1.getTipoPokemon(), pokemonEntrenador1.getEstado());
        Pokemon pokemon2 = new Pokemon(pokemonEntrenador2.getNombrePokemon(), pokemonEntrenador2.getSaludPokemon(), pokemonEntrenador2.getPuntosDeAtaque(), pokemonEntrenador2.getTipoPokemon(), pokemonEntrenador2.getEstado());

        // instancia
        Batalla batalla = new Batalla();
        batalla.iniciarBatalla(pokemon1, pokemon2);
    }
}

class Entrenador {
    private String nombre;
    private List<Pokemon> equipoPokemon;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipoPokemon = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        equipoPokemon.add(pokemon);
        System.out.println("Pokémon '" + pokemon.getNombrePokemon() + "' agregado al equipo de " + nombre + ".");
    }

    public void mostrarEquipoPokemon() {
        System.out.println("Equipo de Pokémones de " + nombre + ":");
        for (Pokemon pokemon : equipoPokemon) {
            System.out.println("- " + pokemon.getNombrePokemon());
        }
    }

    public Iterable<Pokemon> mostrarPokemones() {
        return equipoPokemon;
    }

    public Pokemon obtenerPokemon(String nombrePokemon) {
        for (Pokemon pokemon : equipoPokemon) {
            if (pokemon.getNombrePokemon().equals(nombrePokemon)) {
                return pokemon;
            }
        }
        return null;
    }
}

class Pokemon {
    private String nombrePokemon;
    private TipoPokemon tipoPokemon;
    private int saludPokemon;

    public Pokemon(String nombrePokemon, TipoPokemon tipoPokemon, int saludPokemon) {
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
        this.saludPokemon = saludPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public TipoPokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public int getSaludPokemon() {
        return saludPokemon;
    }
}




