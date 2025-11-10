package atividade.domain;

public class Toyota extends Carro {
    public Toyota(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O Toyota " + getModelo() + " está acelerando!");
    }

}
