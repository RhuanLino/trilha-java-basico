import java.util.ArrayList;
import java.util.List;

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
    }
}