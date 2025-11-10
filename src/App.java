import atividade.domain.Carro;
import atividade.domain.ListaCarros;

public class App {
    public static void main(String[] args) throws Exception {

        ListaCarros<Carro> listaCarros = new ListaCarros<>();

        listaCarros.adicionar(new Carro("Mustang", "Ford", 2022));
        listaCarros.adicionar(new Carro("Gol", "Volkswagen", 2019));

        listaCarros.listar();
    
    }
}
