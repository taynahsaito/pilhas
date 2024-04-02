public class TestePilha {
    public static void main(String[] args) {
        Pilha <Carta> p = new Pilha<>();
        System.out.println(p);
        System.out.println("-------------------");
        p.push(new Carta(2,"copas"));
        System.out.println(p);
        System.out.println("-------------------");
        p.push(new Carta(10, "espadas"));
        System.out.println(p);
        System.out.println("-------------------");
        p.push(new Carta(3, "ouros"));
        System.out.println(p);
        System.out.println("-------------------");
        System.out.println(p.pop() + " saiu do monte");
        System.out.println(p);
        System.out.println("-------------------");
        System.out.println(p.consultaTopo() + " esta no topo agora");
        System.out.println(p);
        System.out.println("-------------------");
        System.out.println("tamanho: " + p.getTamanho());
        while (!p.estaVazia()) {
            System.out.println(p.pop() + " saiu do monte");
            System.out.println(p);
            System.out.println("-------------------");
        }
    }
}
