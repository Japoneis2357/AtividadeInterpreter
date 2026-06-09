package main;

public class Hamburgueria {

    public static String formula = "precoBurguer * quantidade + taxaEntrega";

    public static double calcularTotal(double precoBurguer, double quantidade, double taxaEntrega) {
        String expressao;
        expressao = formula.replace("precoBurguer", Double.toString(precoBurguer));
        expressao = expressao.replace("quantidade", Double.toString(quantidade));
        expressao = expressao.replace("taxaEntrega", Double.toString(taxaEntrega));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

