import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turista mochileiro = new Turista("Supla");
        Turista mochileira = new Turista();

        Scanner tcd = new Scanner(System.in);

        String cpf = tcd.nextLine();
        // Definir forma de cada turista


        if(Validacao.validaCPF(cpf)){
            mochileiro.setCpf(cpf);
            System.out.println("CPF valido");
        }
        else{
            System.out.println("CPF Inválido!");
        }
        tcd.close();


        mochileira.setCpf("450");
        mochileira.setNome("finga");

        String retorno = mochileira.viajar();



        JOptionPane.showMessageDialog(null, retorno);

    }

}