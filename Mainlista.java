import java.util.Scanner;

public class Mainlista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Listar elementos");
            System.out.println("3. Localizar elemento");
            System.out.println("4. Esvaziar lista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int valor = scanner.nextInt();
                    lista.adicionar(valor);
                    System.out.println("Elemento foi adicionado à lista!");
                    break;
                case 2:
                    System.out.println("Elementos na lista:");
                    lista.listarElementos();
                    break;
                case 3:
                    System.out.print("Digite o elemento a ser localizado: ");
                    int elementoLocalizar = scanner.nextInt();
                    lista.localizarElemento(elementoLocalizar);
                    break;
                case 4:
                    lista.esvaziarLista();
                    System.out.println("A lista foi esvaziada.");
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
