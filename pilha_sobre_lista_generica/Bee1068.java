import java.util.Scanner;

public class Bee1068 {
    public static void main(String[] args) {
        //leitura de uma string :
        Scanner scanner = new Scanner(System.in);
        int cont=0;
        Pilha<Character> p = new Pilha<>();
        String s = scanner.nextLine();

        boolean estaCorreta = true;
        for (int i=0; i<s.length() && estaCorreta; i++){
            if (s.charAt(i) == '(')
                cont++; //adiciona
            else if (s.charAt(i) == ')'){
                if (cont==0)
                    estaCorreta = false;
                else
                    cont--; //desempilha
            }
        }
        if(cont>0){
            estaCorreta = false;
        }
        if (estaCorreta){
            System.out.println("esta correta");
        }
        else{
            System.out.println("esta incorreta");
        }
        scanner.close();
    }
}
