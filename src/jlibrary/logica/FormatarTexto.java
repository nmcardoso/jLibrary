package jlibrary.logica;

import javax.swing.JTextField;

/**
 *
 * @author Natanael
 */
public class FormatarTexto {

    /**
     * Formatação do texto
     *
     * @param texto Texto a ser formatado
     * @return maria da silva -> Maria da Silva <br />naTaNael MagalHÃes ->
     * Natanael Magalhães
     */
    public String formatar(String texto) {
        if (texto == null || texto.equals("") || texto.length() == 0) {
            return null;
        }

        texto = texto.trim();

        if (texto == null || texto.equals("") || texto.length() == 0) {
            return null;
        }

        String[] array = texto.split(" "); //transforma a string em um vetor

        String str;
        str = array[0].substring(0, 1).toUpperCase() + array[0].substring(1, array[0].length()).toLowerCase();

        if (array.length == 1) {
            return str;
        }

        for (int i = 1; i < array.length; i++) {
            if (i != 0 && i != array.length) { //adiciona espaços caso nao seja o primeiro nem o ultimo
                str += " ";
            }

            if (array[i] == null || array[i].equals("")) { //retira mais de um espaço consecutivo
                str = str.substring(0, str.length() - 1);
            } else if (array[i].equalsIgnoreCase("da") || array[i].equalsIgnoreCase("das")
                    || array[i].equalsIgnoreCase("de") || array[i].equalsIgnoreCase("di")
                    || array[i].equalsIgnoreCase("do") || array[i].equalsIgnoreCase("dos")
                    || array[i].equalsIgnoreCase("du") || array[i].length() == 1) { //caixa alta apenas para nomes proprios
                str += array[i].toLowerCase();
            } else { //primeira letra do nome próprio em caixa alta
                str += array[i].substring(0, 1).toUpperCase() + array[i].substring(1, array[i].length()).toLowerCase();
            }
        }

        return str;
    }

    public String formatar(JTextField jTF) {
        return formatar(jTF.getText());
    }
    
    public String formatarQuery(String query){
        if (!query.contains(" ")) {
            return "%"+query+"%";
        }
        
        String novaQuery = query.replace(" ", "%");
        novaQuery = "%" + novaQuery + "%";
        return novaQuery;
    }
}
