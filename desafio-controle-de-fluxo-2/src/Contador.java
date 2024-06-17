import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numb1, numb2;

        System.out.println("-----------------------");
        System.out.println("INICIANDO O CONTADOR...");
        System.out.println("-----------------------");

        System.out.print("Digite o primeiro número:");
        numb1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numb2 = sc.nextInt();

        System.out.println("-----------------------");
        System.out.println("INICIALIZANDO A CONTAGEM:");
        System.out.println("-----------------------");
		
        try {
            contar(numb1, numb2);

        } catch (ParametrosInvalidosException e ) { 
            System.out.println("-------------------------------");
            System.out.println("Erro!");
            System.out.println(e.getMessage());

        }

        System.out.println("-----------------------");
        System.out.println("FIM DA CONTAGEM");
        System.out.println("-----------------------");

        sc.close();
    }

    static void contar(int numb1, int numb2) throws ParametrosInvalidosException {

        if (numb1 > numb2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");

        } for(int i = numb1; i <= numb2; i++) {
            System.out.println("Número: " + i);

        }
    }
}

