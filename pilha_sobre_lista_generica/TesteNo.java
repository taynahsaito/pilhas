package pilha_sobre_lista_generica;

public class TesteNo {
    public static void main(String[] args) {
        
        Carta c1 = new Carta(4, "espadas");
        Carta c2 = new Carta(7, "ouros");
    
        No<Carta> no1= new No<Carta>(c1); //o meu nó está sendo construído em cima da classe Carta
        No<Carta> no2= new No<>(c2); //podemos omitir a classe no lado direito como abreviação
    }
}
