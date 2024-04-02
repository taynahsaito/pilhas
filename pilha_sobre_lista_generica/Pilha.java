import javax.sound.midi.MidiDevice.Info;
    //estamos criando uma pilha sobre um tipo genérico - mudança de tipo de dados para não haver adaptações para tipos primitivos no meio do código

public class Pilha <Info>{
    private No<Info> topo;
    private int tamanho;

    //construtor padrão
    public boolean estaVazia(){
        return topo == null;
    }
    public void push(Info info){ //tamanho++ -> adiciona elemento no topo da lista
        No<Info> novo = new No<>(info);
        if (!estaVazia()){
            novo.setProximo(topo);
        }
        topo = novo;
        tamanho++;
    }
    public Info pop(){ // remove e retorna o elemento no topo da lista -> tamanho--
        if(estaVazia()) return null;
        Info info = topo.getInfo();
        topo = topo.getProximo();
        tamanho--;
        return info;
    }
    public Info consultaTopo (){  //consultatopo = peek
        if (estaVazia()) return null; //se tentarmos acessar um atributo/objeto que não existe/ que está vazia, você vai tomar um nullpointerexception
        return topo.getInfo(); //faz uma cópia desse valor e manda pra quem chamou.
    }
    public int getTamanho(){
        return tamanho;
    }
    @Override
    public String toString (){
        if (estaVazia()) return "pilha vazia";
        String s = "";
        No<Info> aux = topo;
        while (aux != null){
            s += aux + "\n";
            aux = aux.getProximo();
        }
        return s;
    }
}
