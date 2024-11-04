public class Lista {
    private Nolista primeiro;

    public Lista() {
        primeiro = null;
    }

    public boolean isEmpty() {
        return primeiro == null;
    }

    public void adicionar(int valor) {
        Nolista novoNode = new Nolista(valor);
        if (isEmpty()) {
            primeiro = novoNode;
        } else {
            Nolista atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNode;
        }
    }

    public void listarElementos() {
        Nolista atual = primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void esvaziarLista() {
        primeiro = null;
    }

    public boolean localizarElemento(int valor) {
        Nolista atual = primeiro;
        int posicao = 1;

        while (atual != null) {
            if (atual.valor == valor) {
                System.out.println("Elemento encontrado na posição " + posicao + ": " + atual.valor);
                return true;
            }
            atual = atual.proximo;
            posicao++;
        }

        System.out.println("Elemento não encontrado na lista.");
        return false;
    }
}
