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
        public static void main(String[] args) {
           
                String hotelNome = JOptionPane.showInputDialog(null, 
                        "Primeiramente, cadastraremos seu hotel.\nPor favor insira o nome do Hotel",
                        "Cadastro do Hotel", 
                        JOptionPane.QUESTION_MESSAGE)
                        .trim();
                String endereco = JOptionPane.showInputDialog(null, 
                        "Por favor insira o endereço do " + hotelNome + ":",
                        "Cadastro do Hotel", 
                        JOptionPane.QUESTION_MESSAGE)
                        .trim();
                String telefone = JOptionPane.showInputDialog(null, 
                        "Por favor insira o telefone do " + hotelNome + ":",
                        "Cadastro do Hotel", 
                        JOptionPane.QUESTION_MESSAGE)
                        .trim();
                String email = JOptionPane.showInputDialog(null, 
                        "Por favor insira o email do " + hotelNome + ":", 
                        "Cadastro do Hotel",
                        JOptionPane.QUESTION_MESSAGE)
                        .trim();

                        Object[] estrelasAvaliacao = {"Escolha Uma Das Opções Abaixo","★☆☆☆☆","★★☆☆☆","★★★☆☆","★★★★☆","★★★★★"};
                String hotelAvaliacao = JOptionPane.showInputDialog(null, 
                        "Por favor coloque a avaliação atual do " + hotelNome + ":",
                        "Cadastro do Hotel", 
                        JOptionPane.QUESTION_MESSAGE, 
                        null, 
                        estrelasAvaliacao, 
                        estrelasAvaliacao[0])
                        .toString();
                int hotelQuartos = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Por favor insira a quantidade de quartos do " + hotelNome + ":", 
                        "Cadastro do Hotel", 
                        JOptionPane.QUESTION_MESSAGE));
                int hotelAndares = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Por favor insira a quantidade de andares do " + hotelNome + ":", 
                        "Cadastro do Hotel", 
                        JOptionPane.QUESTION_MESSAGE));
                // TODO Estatística
        
}
}
