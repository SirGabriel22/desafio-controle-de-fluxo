import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        //TODO: Receber os parâmetros via terminal.

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro (número inteiro):\t");
        int parametroUm = terminal.nextInt();
        System.out.println("Entre com o segundo parâmetro (número inteiro):\t");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        //TODO: Se o primeiro parâmetro for menor que o segundo, imprimir todos os números entre os parâmetros.

        //TODO: Caso contrário, abrir uma exceção exibindo mensagem de erro.
     
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("É obrigatório o segundo número ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo: " + i);
        }
    }
}
