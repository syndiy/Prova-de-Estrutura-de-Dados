public class Filaf {

    public Blocof inicio;
    public Blocof fim;


    public void inserir(Blocof idade){
        if(inicio==null){
            inicio = idade;
            fim = idade;
        }


        else{
            fim.setProx(idade);
            fim = idade;
        }

        System.out.println("IDADE ADICIONADA!");
    }
    
    public void remover(){


        if(inicio==null){

            System.out.println("A FILA ESTÁ VAZIA");

        }
        else{

            inicio = inicio.getProx();
            System.out.println("REMOÇÃO CONCLUÍDA COM SUCESSO!");

        }
    }
    
    public void imprimir(){

        Blocof aux = inicio;
        
        if(aux==null){

            System.out.println("A FILA ESTÁ VAZIA!");

        }else{

            while(aux!=null){
                System.out.printf("%d -> ", aux.getIdade());
                aux = aux.getProx();
            }
            System.out.println();
        } }

        public void esvaziar(){
            if(inicio==null){
                System.out.println("A FILA ESTÁ VAZIA!");
            }
            else{
                while(inicio!=null){
                    inicio = inicio.getProx();
            }
            System.out.println("FILA ESVAZIADA COM SUCESSO!");

        } }

        
        public Blocof buscarendereco(int index){
            Blocof aux = inicio;
            int cont=0;

            while (aux != null) {
                cont ++;
                if(cont == index) {
                    return aux;  
                }
                aux = aux.getProx();
            }
            System.out.println("POSIÇÃO NÃO ENCONTRADA!");
            return null;   
        }
        

    
}
