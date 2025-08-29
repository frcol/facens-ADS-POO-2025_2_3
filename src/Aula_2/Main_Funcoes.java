package Aula_2;

public class Main_Funcoes {

    public static void main(String[] args) {
        char letra = pegaLetra("Fabio", 2);
        System.out.println("letra:"+letra );
    }

    public static String enviarEmail(String assunto, String remetente, String corpo) {
        String msg = "\n\nAssunto: "+assunto;
        msg = msg + "\nRemetente: "+remetente;
        msg += "\nCorpo: "+corpo;
        msg += "\nAnexo: Imagem.jpg";
        
        return msg;
    }
    
    public static int soma(int x, int y) {
        int resultado = x+y;
        
        return resultado;
    }
    
    public static int contaLetras(String palavra) {
        return palavra.length();
    }
    
    public static char pegaLetra(String palavra, int num){
        return palavra.charAt(num);
    }
    
    
    // sabendo que charAt(x) tras uma letra de string
    // ex: "Fabio".charAt(1) = 'a'
    // crie uma func que recebe uma palavra e um numero
    // ela retorna a letra do indice da palara (numero)
    
}
