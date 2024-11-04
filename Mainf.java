import java.util.Scanner;

public class Mainf {
    public static void main(String[] args) {
        Filaf novafilaf = new Filaf();
        Scanner scanf = new Scanner(System.in);

        while(true) {
             System.out.println("=============== MENU PARA ESTRUTURA TIPO FILA ===============");
            System.out.println("QUAL OPÇÃO DESEJADA?");
            System.out.println("1-ADICIONAR UM ELEMENTO A FILA \n2-MOSTRAR A FILA\n3-REMOVER O ELEMENTO\n4-ESVAZIAR FILA\n5-BUSCAR ELEMENTO POR POSIÇÃO\n6-SAIR");
            int opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                     Blocof meubloco = new Blocof(0);
                     System.out.println("DIGITE A IDADE:");
                     meubloco.setIdade(scanf.nextInt());
                     novafilaf.inserir(meubloco);
                     System.out.println("----------------------------------------------------------------");
                break;

                case 2:
                    novafilaf.imprimir();
                         break;
                case 3:
                     novafilaf.remover();
                        break;
                case 4:
                     novafilaf.esvaziar();
                        break;
                case 5:
                     System.out.println("DIGITE A POSIÇÃO:");
                    Blocof retorno = novafilaf.buscarendereco(scanf.nextInt());
                         if(retorno!=null){
                    System.out.println(retorno.getIdade());
                }
                         break;
                case 6:
                  System.out.println("SAINDO DO PROGRAMA!");
                 System.exit(0);
                         break;
                default:
                 System.out.println("OPÇÃO INVÁLIDA!");
                break;
            }
            

    }
    
}
}
