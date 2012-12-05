package jlibrary.logica;

import java.util.InputMismatchException;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Natanael
 */
public class Validar {

    public boolean isValid(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        str = str.trim();

        if (str == null || str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isValid(JTextField jTF) {
        return isValid(jTF.getText());
    }

    public boolean isCpf(JFormattedTextField jFTF) {
        String cpf = jFTF.getText();

        if (cpf.contains("-")) {
            cpf = cpf.replace("-", "");
        }
        if (cpf.contains(".")) {
            cpf = cpf.replace(".", "");
        }

        cpf = cpf.trim();

        if (cpf == null || cpf.equals("")) {
            return true;
        } else {
            return isCpf(cpf);
        }
    }

    public boolean isCpf(String cpf) {
        if (!isValid(cpf)) {
            return false;
        }

        // considera-se erro cpf's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return false;
        }

        char dv1, dv2;
        int soma, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            soma = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do cpf em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0        
                // (48 eh a posicao de '0' na tabela ASCII)        
                num = (int) (cpf.charAt(i) - 48);
                soma += (num * peso);
                peso--;
            }

            r = 11 - (soma % 11);
            if ((r == 10) || (r == 11)) {
                dv1 = '0';
            } else {
                dv1 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            soma = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                soma += (num * peso);
                peso--;
            }

            r = 11 - (soma % 11);
            if ((r == 10) || (r == 11)) {
                dv2 = '0';
            } else {
                dv2 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dv1 == cpf.charAt(9)) && (dv2 == cpf.charAt(10))) {
                return true;
            } else {
                return false;
            }
        } catch (InputMismatchException e) {
            return false;
        }

    }
}
