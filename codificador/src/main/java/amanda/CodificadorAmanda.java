package amanda; // <--- Faltava esta linha!

import java.time.LocalDate;

public class CodificadorAmanda implements Codificador {
    public String getNome() {
        return "Codificador Simples";
    }

    public LocalDate getDataCriacao() {
        // Removido o zero antes do 3 para evitar problemas de formatação octal
        return LocalDate.of(2025, 3, 13);
    }

    public int getNivelSeguranca() {
        return 1;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 8));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 8));
        }

        return encoded.toString();
    }
}
