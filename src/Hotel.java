
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafael Alipio Harada
 */
public class Hotel {

    static int hotelAndares;
    static int hotelQuartos;

    public void Cadastrar() {
        String hotelNome = JOptionPane.showInputDialog(null,
                "Primeiramente, cadastraremos seu hotel.\nPor favor insira o nome do Hotel",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE)
                .trim();
        String endereco = JOptionPane.showInputDialog(null,
                "Por favor insira o endereço do hotel:",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE)
                .trim();
        String telefoneHotel = JOptionPane.showInputDialog(null,
                "Por favor insira o telefone do hotel:",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE)
                .trim();
        String email = JOptionPane.showInputDialog(null,
                "Por favor insira o email do hotel:",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE)
                .trim();

        Object[] estrelasAvaliacao = {"Escolha Uma Das Opções Abaixo", "★☆☆☆☆", "★★☆☆☆", "★★★☆☆", "★★★★☆", "★★★★★"};
        String hotelAvaliacao = JOptionPane.showInputDialog(null,
                "Por favor coloque a avaliação atual do hotel:",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE,
                null,
                estrelasAvaliacao,
                estrelasAvaliacao[0])
                .toString();
        hotelAndares = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Por favor insira a quantidade de andares do hotel:",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE));
        hotelQuartos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Por favor insira a quantidade de quartos do hotel:",
                "Cadastro do Hotel",
                JOptionPane.QUESTION_MESSAGE));
        // TODO Estatístic
    }
}
