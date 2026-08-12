import java.math.BigInteger;
import java.time.LocalDate;

public class CodificadorM implements Codificador{
    // Retorna o nome do codificador

    public String getNome(){
        return "Codificador da Mari";
    }

    // Retorna a data de imlementação do codificador (pode ser usado como versao)
    public LocalDate getDataCriacao(){
        return LocalDate.of(2026, 8, 10);
    }

    // Retorna o nivel de segurança do codificador (1 = muito baixo, 100 = muito alto)
    public int getNivelSeguranca(){
        return 100;
    }

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str){
        String codificada = (new BigInteger(str.toString())).toString(36);
        return codificada;
    }

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str){
        String decodificada = (new BigInteger(str,36)).toString();
        return decodificada;
    }
}
