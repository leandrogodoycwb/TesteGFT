package calculadora;

public class Investimento {
    private double valorInicial;
    private double jurosMensais;
    
    public Investimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }
    
    public double calcularLucro(int mes){
        return (valorInicial * (Math.pow(1 + jurosMensais, mes))) - valorInicial;
    }
 
  }
