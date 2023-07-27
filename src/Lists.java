import java.util.List;

public class Lists {
    /* 7.1 Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
     toate valorile din lista, fiecare pe rand nou.
     */
    public void displayList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /* 7.2 Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
       si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final
       de lista.
     */
    public void addNumber(List<Integer> list, int number) {
        list.add(list.size(), number);
    }

    /* 7.3 Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
       iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
       fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
     */
    public void displayInRange(List<Integer> list, int number) {
        for (int i = number; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /* 7.4 Scrieti o metoda Java, care sa primeasca parametru o Lista,
       si sa afiseze, pe rand, toate valorile din lista,
       dar invers(de la capat la inceput).
     */
    public void displayInReverse(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    /* 7.5 Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
       unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul
       de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
     */
    public void addAtPosition(List<String> list, int index, String text) {
        list.add(index, text);
    }

    /* 7.6 Scrieti o metoda Java, care sa primeasca doi parametrii.
       Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge
       pe prima pozitie din lista.
     */
    public void addAtBeginning(List<String> list, String text) {
        list.add(0, text);
    }

    /* 7.7 Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,
       si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
     */
    public void displayPosition(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("On position " + i + " we have the string: " + list.get(i));
        }
    }

    /* 7.8 Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea. */
    public int biggestNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
}
