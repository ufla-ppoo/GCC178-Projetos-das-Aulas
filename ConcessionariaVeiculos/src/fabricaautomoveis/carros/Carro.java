/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaautomoveis.carros;

/**
 * Classe abstrata base para os carros vendidos pelas concessionárias
 * 
 * @author julio
 */
public abstract class Carro {
    private String nome;
    private String cor;
    private double custo;
    private Categoria categoria;
    private Marca marca;
    
    public Carro(String nome, Marca marca, String cor, double custo, Categoria categoria) {        
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.custo = custo;
        this.categoria = categoria;        
    }
    
    public String obterNome() {
        return nome;
    }
    
    public double obterCusto() {
        return custo;
    }
    
    public Categoria obterCategoria() {
        return categoria;
    }
    
    public String obterCor() {
        return cor;
    }
    
    @Override
    public String toString() {
        return marca + " " + nome + " " + cor + " (R$ " + custo + ")";
    }
    
    public void produzir() {
        // simula o processo de produção do carro
        System.out.println("\nProduzindo o carro: " + this + "...\n");
        
        esperar();
    }
    
    public void pintar() {
        // simula o processo de pintura do carro
        System.out.println("Pintando o carro: " + this + "...\n");
        
        esperar();
    }
    
    public void liberarDocumentacao() {
        // simula o processo de produção do carro
        System.out.println("Liberando documentação do carro: " + this + "...\n");
        
        esperar();
    }
    
    private void esperar() {
        try {
            Thread.sleep(1000);
        }
        catch(Exception e) {}
    }
}
