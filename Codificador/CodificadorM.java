import java.time.LocalDate;

public interface CodificadorM {
    // Retorna o nome do codificador
    public String getNome(){
        return "Codificador da Mari";
    }

    // Retorna a data de imlementação do codificador (pode ser usado como versao)
    public LocalDate getDataCriacao(){
        return LocalDate.of(2026, 08, 10);
    }

    // Retorna o nivel de segurança do codificador (1 = muito baixo, 100 = muito alto)
    public int getNivelSeguranca(){
        return 100;
    }

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str){
        return 
    }

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str);
}
