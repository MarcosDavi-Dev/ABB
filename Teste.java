import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        ArvoreBinaria arv = new ArvoreBinaria();

        for (int i = 0; i < 5; i++) {
            int novoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            arv.inserirNo(novoValor);
        }

        arv.exibirArvore();
        System.exit(0);
    }
}
