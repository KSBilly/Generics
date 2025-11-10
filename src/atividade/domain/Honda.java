package atividade.domain;

public class Honda extends Carro {
    public Honda(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O Honda " + getModelo() + " está acelerando!");
    }

}
