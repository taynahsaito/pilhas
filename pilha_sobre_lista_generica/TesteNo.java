public class TesteNo {
    public static void main(String[] args) {
        
        Carta c1 = new Carta(4, "espadas");
        No<Carta> no1= new No<Carta>(c1); //o meu nó está sendo construído em cima da classe Carta
        System.out.println("no1: " + no1);

        No<Carta> no2 = new No<>(new Carta(7, "ouros"));
        System.out.println("no2: " + no2);

        No<String> no3 = new No<>("hello world"); //podemos omitir a classe no lado direito como abreviação
        System.out.println("no3: " + no3);

        No<Integer> no4 = new No<Integer>(5);
        System.out.println("no4: " + no4);
    }
}
