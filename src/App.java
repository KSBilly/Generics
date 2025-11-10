import java.util.ArrayList;
import java.util.List;

import atividade.domain.Carro;
import atividade.domain.Honda;
import atividade.domain.Hyundai;
import atividade.domain.Toyota;

public class App {
    public static void main(String[] args) throws Exception {

        List<Carro> listaDeCarros = new ArrayList<>();

        Carro honda = new Honda("Civic", 2020);
        Carro hyundai = new Hyundai("HB20", 2022);
        Carro toyota = new Toyota("Corolla", 2021);

        listaDeCarros.add(honda);
        listaDeCarros.add(hyundai);
        listaDeCarros.add(toyota);

        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
            carro.acelerar();
            System.out.println("------------------");
        }

    }
}