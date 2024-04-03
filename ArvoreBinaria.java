public class ArvoreBinaria {
    BIntNo raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public BIntNo inserir(BIntNo arvore, int novoNo) {
        if (arvore == null) {
            return new BIntNo(novoNo);
        } else {
            if (novoNo < arvore.valor) {
                arvore.esq = inserir(arvore.esq, novoNo);
            } else {
                arvore.dir = inserir(arvore.dir, novoNo);
            }
            return arvore;
        }
    }

    public void inserirNo(int novoValor) {
        raiz = inserir(raiz, novoValor);
    }

    public void exibirEmOrdem(BIntNo arv) {
        if (arv != null) {
            exibirEmOrdem(arv.esq);
            System.out.print(arv.valor + " ");
            exibirEmOrdem(arv.dir);
        }
    }

    public void exibirArvore() {
        exibirEmOrdem(raiz);
        System.out.println();
    }

    public void exibirRaiz() {
        System.out.println("raiz " + raiz.valor);
    }

    public void remover(int item) {
        // Implemente a remoção aqui
    }
}
