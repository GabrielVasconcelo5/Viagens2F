import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();

        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");

        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null, retorno);

        String nome = JOptionPane
                .showInputDialog("Entre com o nome da pessoa Turista: ");

        Turista pessoaTurista = new Turista(nome);

        System.out.println(pessoaTurista.getNome());
    }

}