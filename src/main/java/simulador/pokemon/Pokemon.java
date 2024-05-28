package simulador.pokemon;

public abstract class Pokemon {

private String nombrePokemon;
private int saludPokemon;
private int puntosDeAtaque;
private int tipoPokemon;
private EstadoPokemon estado;

public Pokemon (String nombrePokemon,int saludPokemon,int puntosDeAtaque,int tipoPokemon,EstadoPokemon estado){
this.nombrePokemon=nombrePokemon;
this.saludPokemon=saludPokemon;
this.puntosDeAtaque=puntosDeAtaque;
this.tipoPokemon=tipoPokemon;
this.estado=EstadoPokemon.NORMAL;

}

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public int getSaludPokemon() {
        return saludPokemon;
    }

    public void setSaludPokemon(int saludPokemon) {
        this.saludPokemon = saludPokemon;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public int getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(int tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public EstadoPokemon getEstado() {
        return estado;
    }

    public void setEstado(EstadoPokemon estado) {
        this.estado = estado;
    }
 // Método para realizar un ataque al oponente
    public abstract void atacar(Pokemon oponente);

    // Método para recibir daño
    public void recibirDaño(int daño) {
        this.saludPokemon -= daño;
        if (this.saludPokemon <= 0) {
            this.saludPokemon = 0;
            this.estado = EstadoPokemon.DEBILITADO;
        }
    }

    // Método para entrenar al Pokémon y mejorar sus estadísticas
    public void entrenar() {
        // Implementa el entrenamiento aquí
        // Por ejemplo, podrías aumentar los puntos de ataque o la salud del Pokémon
        // según alguna lógica específica de tu juego
    }
}

// Enumeración para los estados de un Pokémon
enum EstadoPokemon {
    NORMAL,
    DEBILITADO

}
