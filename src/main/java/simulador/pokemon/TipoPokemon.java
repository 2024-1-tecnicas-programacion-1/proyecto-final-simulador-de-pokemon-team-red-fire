package simulador.pokemon;

public enum TipoPokemon 
{
    FUEGO,
    AGUA,
    VENENO,
    ELECTRICO,
    PSIQUICO,
    LUCHA,;
    
    public double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                switch (defensor) {
                    case FUEGO: return 1.0; 
                    case AGUA: return 0.5; 
                    case PLANTA: return 2.0; 
                    case ELECTRICO: return 1.0; 
                    case VENENO: return 1.0;
                    case PSIQUICO:return 1.0;
                    case LUCHA: return 1.0;
                }
            case AGUA:
                switch (defensor) {
                     case FUEGO: return 2.0; 
                    case AGUA: return 1.0; 
                    case PLANTA: return 0.5; 
                    case ELECTRICO: return 1.0; 
                    case VENENO: return 1.0;
                    case PSIQUICO:return 1.0;
                    case LUCHA: return 1.0; 
                }

            case VENENO:
                switch (defensor) {
                    case FUEGO: return 1.0; 
                    case AGUA: return 1.0; 
                    case PLANTA: return 2.0; 
                    case ELECTRICO: return 1.0; 
                    case VENENO: return 1.0;
                    case PSIQUICO:return 1.0;
                    case LUCHA: return 1.0;
                }
                
            case ELECTRICO:
                switch (defensor) {
                    case FUEGO: return 1.0; 
                    case AGUA: return 2.0; 
                    case PLANTA: return 0.5; 
                    case ELECTRICO: return 1.0; 
                    case VENENO: return 1.0;
                    case PSIQUICO:return 1.0;
                    case LUCHA: return 1.0;
                }
                
            case PSIQUICO:
                switch (defensor) {
                    case FUEGO: return 1.0; 
                    case AGUA: return 1.0; 
                    case PLANTA: return 1.0; 
                    case ELECTRICO: return 1.0; 
                    case VENENO: return 2.0;
                    case PSIQUICO:return 1.0;
                    case LUCHA: return 2.0;
        }
            case LUCHA:
                switch (defensor) {
                    case FUEGO: return 1.0; 
                    case AGUA: return 1.0; 
                    case PLANTA: return 1.0; 
                    case ELECTRICO: return 1.0; 
                    case VENENO: return 1.0;
                    case PSIQUICO:return 0.5;
                    case LUCHA: return 1.0;
       
    }
                
                
     return 1.0; 
}
