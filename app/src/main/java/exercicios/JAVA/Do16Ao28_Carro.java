package exercicios.JAVA;

import java.util.function.Supplier;

public class Do16Ao28_Carro {
        int ano;
        double prešo;
        final String tipoDeCombustÝvel, modelo;
        final Supplier<Double> prešoComDesconto = () -> prešo*getDesconto();
        Do16Ao28_Carro (int ano, double prešo) {
            this.ano = ano;
            this.prešo = prešo;
            this.tipoDeCombustÝvel = "";
            this.modelo = "";
        }
        Do16Ao28_Carro (String tipoDeCombustÝvel, String modelo, double prešo) {
            this.tipoDeCombustÝvel = tipoDeCombustÝvel;
            this.modelo = modelo;
            this.prešo = prešo;
        }
        private double getDesconto() {
            if(tipoDeCombustÝvel.equalsIgnoreCase("A")) return 1 - 0.25;
            if(tipoDeCombustÝvel.equalsIgnoreCase("G")) return 1 - 0.21;
            if(tipoDeCombustÝvel.equalsIgnoreCase("D")) return 1 - 0.14;
            return 1.0;
        };
        @Override public String toString() {
            return String.format(
                    "Modelo: %s; Prešo: %.2f; Prešo + desconto: %.2f", 
                    modelo, prešo, prešoComDesconto.get()
            );
        }
    }