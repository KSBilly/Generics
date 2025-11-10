package atividade.domain;

public class Hyundai extends Carro {
    public Hyundai(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O Hyundai " + getModelo() + " está acelerando!");
    }

}
