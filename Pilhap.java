public class Pilhap {
        private Blocop topo;
    
        public void empilhar(Blocop conteudo){
            if(topo==null){
                topo=conteudo;
                System.out.println("CONTEÚDO ADICIONADO COM SUCESSO!");
            }
            else{
                conteudo.setanterior(topo);
                topo = conteudo;
                System.out.println("CONTEÚDO ADICIONADO COM SUCESSO!");
            }
        }
    
        public void desempilhar(){
            if(topo==null){
                System.out.println("A PILHA ESTÁ VAZIA!");
            }
            else{
                topo = topo.getanterior();
            }
        }
    
        public void imprimir(){
            Blocop aux = topo;
            
            if(aux==null){
                System.out.println("A PILHA ESTÁ VAZIA!");
            }else{
            while(aux!=null){
                System.out.println(aux.getNome());
                System.out.println(aux.getDatanascimento());
    
                aux = aux.getanterior();
            }
        }
        }

        public void esvaziar(){
            if(topo==null){
                System.out.println("A PILHA ESTÁ VAZIA!");
            }
            else{
                while(topo!=null){
                    topo = topo.getAnterior();
            }
            System.out.println("PILHA ESVAZIADA COM SUCESSO!");

        } }

        public Blocop buscarconteudo(String conteudo){
            Blocop aux = topo;
            while(aux!=null){
                if(aux.getNome().equals(conteudo) || aux.getDatanascimento().equals(conteudo)){
                    return aux;
                }
                aux = aux.getAnterior();
            }
            System.out.println("CONTEÚDO NÃO ENCONTRADO!");
            return null;

        }
        public void mostrartopo(){
            Blocop aux = topo;
            if(aux == null){
                System.out.println("PILHA VAZIA, TOPO NULO!");
            }else{
                System.out.println("ESTE É O TOPO DA PILHA:");
                System.out.println(aux.getNome());
                System.out.println(aux.getDatanascimento());
            }
    
        }


    }
