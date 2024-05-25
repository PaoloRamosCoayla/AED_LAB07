package Lab7;

public class Test {
    public static void main(String[] args) {
        try {
            BSTree<Integer> bst = new BSTree<>();
            bst.insert(20);
            bst.insert(10);
            bst.insert(30);
            bst.insert(5);
            bst.insert(15);
            bst.insert(25);
            bst.insert(35);
            bst.insert(40);
            bst.insert(45);
    
            System.out.println("Altura del árbol: " + bst.height());


            BSTree<Integer> bst2 = new BSTree<>();
            bst2.insert(10);
            bst2.insert(5);
            bst2.insert(3);
            bst2.insert(1);
            bst2.insert(11);
            System.out.println("Altura del árbol 2: " + bst2.height());


            System.out.println("Area del árbol 1: " + bst.area());
            System.out.println("Area del árbol 2: " + bst2.area());
            System.out.println("¿Los árboles tienen la misma área?: " + sameArea(bst, bst2));

            int count = bst.countNodes();
            System.out.println("Número de nodos: " + count);


            bst.iterativePreOrden();


            bst.search(1);


        } catch (ItemDuplicated e) {
            System.out.println(e.getMessage());
        } catch (ItemNoFound e) {
            System.out.println( e.getMessage());
        }
    }
    public static <E extends Comparable<E>> boolean sameArea(BSTree<E> arbol1, BSTree<E> arbol2) {
        return arbol1.area() == arbol2.area();
    }
}
