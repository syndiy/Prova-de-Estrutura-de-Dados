import java.util.Scanner;

public class Mainpilha{
    public static void main(String[] args) {
        Pilhap novaPilhap = new Pilhap();
        Scanner scanf = new Scanner(System.in);

        while(true){
    
        System.out.println("========================== MENU PARA ESTRUTURA DO TIPO PILHA ==========================");
        System.out.println("QUAL OPÇÃO DESEJA ESCOLHER?");
        System.out.println("1-ADICIONAR ELEMENTO\n2-MOSTRAR Pilhap\n3-REMOVER ELEMENTO\n4-ESVAZIAR Pilhap \n5-BUSCAR POR CONTEÚDO\n6-MOSTRAR O TOPO DA Pilhap\n7-SAIR");
        int opcao = scanf.nextInt();


        switch(opcao){
            case 1:
            Blocop cindy = new Blocop(null, null);
            System.out.println("DIGITE O NOME:");
            scanf.nextLine();
            cindy.setNome(scanf.nextLine());
            System.out.println("DIGITE A DATA DE NASCIMENTO:");
            cindy.setDatanascimento(scanf.nextLine());
            novaPilhap.empilhar(cindy);
            break;

            case 2:
            novaPilhap.imprimir();
            break;

            case 3:
            novaPilhap.desempilhar();
            System.out.println("REMOÇÃO CONCLUÍDA COM SUCESSO!");
            break;

            case 4:
            novaPilhap.esvaziar();
            break;
            
            case 5:
            System.out.println("DIGITE O CONTEÚDO QUE DESEJA BUSCAR(NOME OU IDADE):");
            scanf.nextLine();
            Blocop conteudo = novaPilhap.buscarconteudo(scanf.nextLine());
            if(conteudo!=null){
                System.out.println(conteudo.getNome());
                System.out.println(conteudo.getDatanascimento());
                System.out.println("CONTEÚDO DIGITADO ESTÁ NA Pilhap!");
            }
            break;

            case 6:
            novaPilhap.mostrartopo();
            break;

            case 7:
            scanf.close();
            System.exit(0);
            break;

            default:
            System.out.println("OPÇÃO INVÁLIDA!");

            
        }
    }
}
}

