
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rafael Alipio Harada
 */
public class Sistema {

    Funcionario funcionario = new Funcionario();
    Quarto quarto = new Quarto();
    Hospede hospede = new Hospede();
    Custos custos = new Custos();
    Receita receita = new Receita();
    int n = 0;

    public void apresentarMenu() {
        JOptionPane.showMessageDialog(null, null, "Administration Hotel", JOptionPane.PLAIN_MESSAGE, new ImageIcon(
                Sistema.class.getResource("/imagens/logo.gif"))
        );
        JOptionPane.showMessageDialog(null, "                       Seja Bem Vindo Ao\n                     Administration   Hotel\n", "Administration Hotel", JOptionPane.PLAIN_MESSAGE);

        Hotel hotel = new Hotel();
        hotel.Cadastrar();

        Object[] options = {"Funcionários", "Quartos", "Hospedes", "Custos", "Receita", "Sair"};
        int menu = 0;

        while (menu != 5) {
            menu = JOptionPane.showOptionDialog(
                    null,
                    "Administração Hoteleira\n\n"
                    + "Selecione uma das opções abaixo:",
                    "Administração Hoteleira",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[5]
            );
            switch (menu) {
                case 0:/*
                     funcionario.menu();*/

                    break;
                case 1:
                    quarto.menu();
                    break;
                case 2:
                    hospede.menu();
                    break;
                case 3:
                     custos.menu();

                    break;
                case 4:/*
                     receita.menu();*/

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "O sistema está sendo fechado...", "Fechando Sistema", JOptionPane.WARNING_MESSAGE);
                    return;
            }
        }
    }
}
