import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // criando um objeto chamado terminal da classe Scanner que é capaz
                                                   // de ler dados; solicitamos que leia do canal de comunicação que
                                                   // recebe entradas do teclado (system.in).
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // dispara o leitor scanner que aguardará e lerá a próxima entrada de
                                              // dados no canal System.in
        System.out.println("Digite o segundo parâmetro"); // após a leitura, o programa dispara novamente a mensagem no
                                                          // fluxo de saída (exibido no console)
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}