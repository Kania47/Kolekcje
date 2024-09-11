import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int[] tablicaLiczbLosowych = new int[6];
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {           //iteracja po dlugosci tablicy
            tablicaLiczbLosowych[i] = (int) (Math.random() * 100 + 1);          //losowanie liczb od 1 do 100
        }

        //wypisywanie tablicy na ekranie!!!
        System.out.println("Wylosowana Tablica:");
        for (int element:tablicaLiczbLosowych) {
           //typ nazwa:nazwakolekcji
            System.out.print(element+", ");
        }
        /*kolekcje mogą miec zmieniany rozmiar!!!! (dodawanie, usuwanie elementów)
        kolekcje jako elementy tylko typy zlozone (Z DUZEJ LITERYYYYY)
        listy list - interfejs, ArrayList LinkedList
        zbiory Set - interfejs, HashSet
        mapy,

        */


        //Przygotuj Listę z liczbami pisanymi z klawiatury

        ArrayList<Integer> listaliczbZklawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 Liczb:");
        for (int i = 0; i < 6 ; i++) {
            int liczba = klawiatura.nextInt();
            listaliczbZklawiatury.add(liczba);

        }
        //wypisz liste
        System.out.println("Wprowadzona Tablica:");
        for (int i = 0; i < listaliczbZklawiatury.size(); i++) {
            System.out.println(listaliczbZklawiatury.get(i));

        }
        System.out.println(listaliczbZklawiatury);
    }
}

















//Laczenie z githubem!!!!!!
//1. git init
//2. git config user.name "nazwa"
//3. git config user.email "email"
//4. git add .
//5. git commit -m "nazwa commita"
//6. git remote add origin "link do repo"
//7. git push -u origin master
//8. git push

//jak juz masz

// git add .
// git commit -m "commit"
// git push