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