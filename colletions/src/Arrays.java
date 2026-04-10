import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Este é um código exemplo
 * de um Scanner, que serve
 * como input de argumentos
 * no qual o usuário pode inserir
 * 
 * @author Rhuan Lino
 * @since 04/08/2026
 */

class Arrays {
    public static void main(String[] args) {
        List<String> listaCompras = new ArrayList<String>();

        listaCompras.add("Pão");
        listaCompras.add("Macarrão");
        listaCompras.add("Arroz");
        listaCompras.add("Alface");

        System.out.println("Lista de compras: " + listaCompras);

        for (String item : listaCompras) {
            System.out.println("Item: " + item);
        }

        System.out.println("Tamanho da lista: " + listaCompras.size());

        System.out.println("----------------");
        // Remove item da lista de acordo com a lambda (condição)
        listaCompras.removeIf(item -> item.charAt(0) == 'A');

        System.out.println("Lista de compras: " + listaCompras);
        System.out.println("----------------");

        List<String> listaComprasFilter = listaCompras.stream().filter(item -> item.charAt(0) == 'M')
                .collect(Collectors.toList());

        System.out.println("Lista de compras filtrada: " + listaComprasFilter);
        System.out.println("----------------");

        String nome = listaCompras.stream().filter(item -> item.charAt(0) == 'P').findFirst().orElseGet(null);
        System.out.println("Item: " + nome);
    }
}