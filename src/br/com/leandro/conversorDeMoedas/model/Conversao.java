package br.com.leandro.conversorDeMoedas.model;

public record Conversao(double conversion_result) {
    @Override
    public String toString() {
        return Double.toString(conversion_result);
    }
}

