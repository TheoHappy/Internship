package collections.session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        //arrayList.add(1); //asa adaugam elemente
        //arrayList.add(int index, DataType element); //asa adaugam elemente pe pozitii anumite
        //arrayList.addAll(ArrayList al);
        //arrayList.addAll(int index, ArrayList al); // se va adauga incepand cu indexul dat
        //arrayList.get(0); //accesam primul element {adica accesam elementele dupa pozitie}
        //arrayList.set(int index, DataType element);//facem update la elementul de pe un index anumit
        //arrayList.size(); //lungimea array-ului
        //arrayList.remove(5); //stergem elementul de pe indexul 5
        ////Sterge referinta
        ///*Metoda data (remove) nu este eficienta daca elementul este prin mijloc sau
        //pe la inceput deoarece cand noi stergem un element din mijloc dimensiunea
        //array-ului se micsoreaza cu 1 dupa fiecare element se muta pe o pozitie in stanga*/
        //arrayList.clear();// sterge toate elementele din arraylist
        //arrayList.indexOf(Object o); // returneaza pozitia elementului dorit sau -1 in caz ca asa element nu a fost gasit
        //arrayList.lastIndexOf(Object o);
        //Arrays.asList(DataType []) //-> List<DataType>
        //arrayList.removeAll(Collection <?> c) //->boolean sterge din arrayList pe  c
        //arrayList.retainAll(Collection <?> c) //->boolean intersectia dintre c in arrayList
        //arrayList.containsAll(Collection <?> c) //->boolean verifica daca in arrayList sunt elementele din c
        //arrayList.subList(int fromIndex, int toIndex) // -> List<E>
        //toArray() -> Object [];
        //List.of(E... elements) // -> List<E> lista data nu se poate de modificat si nu poti contine valori null
        //List<Integer> list1 = list.of(3,8,13);
        //List.copyOf(Collection <E> c) // ->List<E> lista data nu se poate de modificat si nu poti contine valori null
    }
}
