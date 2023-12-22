package array.generici;

public class Main {
    public static void main(String[] args) {
        IntegerArray ia = new IntegerArray();
        ia.add(23); //indice 0
        ia.add(12); //indice 1
        System.out.println("La lunghezza attuale dell'array è: " + ia.size());
        ia.add(100); //indice 2
        System.out.println("L'elemento in posizione 2 è " + ia.get(2));
        System.out.println("L'elemento in posizione 3 è " + ia.get(3));
        Integer[]arr = ia.toArray();
        System.out.println("Stampiamo l'array ");
        for(Integer i: arr){
            System.out.println(i);
        }

        DynamicsArray<Product> prodotti = new DynamicsArray<>();
        prodotti.add(new Product(1, "nome prodotto 1", "Descrizione prodotto 1", 13.56));
        prodotti.add(new Product(1, "nome prodotto 2", "Descrizione prodotto 2", 13.58));
        prodotti.add(new Product(1, "nome prodotto 3", "Descrizione prodotto 3", 13.57));
        System.out.println("Numero prodotti presenti nell'Array: " + prodotti.size());
        System.out.println("Nome del primo prodotto: " + prodotti.get(0).getNome());
        prodotti.add(new Product(1, "Nome prodotto 4", "Descrizione prodotto 4", 13.59));
        System.out.println("Numero di prodotti presenti nell'array: " + prodotti.size());
    }
}
