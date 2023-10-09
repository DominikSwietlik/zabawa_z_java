import java.util.Scanner;

/**Cel:

 Stwórz program reprezentujący konto.

 Program pozwala na wpłaty / wypłaty / sprawdzenie salda z konta.

 Oczekiwane dane wejściowe:

 Wartość double dla operacji wpłaty / wypłaty (użyj klasy Scanner)

 Oczekiwana wartość wyjściowa:

 Wypisane saldo konta startower oraz po operacji wpłaty / wypłaty

 Instrukcje:

 Stwórz klasę o nazwie "Account" z prywatnym polem "balance"

 W konstruktorze klasy Account, ustaw początkowe saldo konta na 0.

 Stwórz metodę "deposit" przyjmującą wartość double jako parametr i aktualizującą saldo konta poprzez dodanie wartości do salda.

 Stwórz metodę "withdraw" przyjmującą wartość double jako parametr i aktualizującą saldo konta poprzez odejmowanie wartości od salda, ale tylko jeśli kwota wypłaty jest mniejsza niż obecne saldo.

 Stwórz metodę "getBalance" zwracającą obecne saldo konta.

 W metodzie main, stwórz instancję klasy Account, wyświetl początkowe saldo, dokonaj wpłaty i wypłaty, a następnie wyświetl aktualizowane saldo.

 Wskazówki:

 Upewnij się, że testujesz swój kod z różnymi wartościami wejściowymi, aby upewnić się, że działa on zgodnie z oczekiwaniami.

 Pamiętaj, że słowo kluczowe "this" odnosi się do bieżącej instancji obiektu.

 Pamiętaj, że w tym przykładzie saldo jest prywatne i można je uzyskać tylko przez metody deposit, withdraw i getBalance, które zapobiegają nieautoryzowanemu dostępowi lub manipulacji saldem.

 Pamiętaj, że enkapsulacja jest ważnym zasadą programowania obiektowego, która pomaga ukryć szczegóły implementacji klasy i ograniczyć dostęp do stanu wewnętrznego obiektu. Prostszymi słowami: enkapsulacja to takie zabezpieczenie, które pozwala na ukrycie jak działa program i kontrolowanie tego kto i jak może z niego korzystać. Jest to jak zamknięcie skarbonki, żeby nikt inny poza tobą nie miał do niej dostępu.


 *
 */
//https://www.w3schools.com/java/java_user_input.asp
// nextDouble()	Reads a double value from the user
//   Scanner myObj = new Scanner(System.in);  // Create a Scanner object

public class Main {
        public static void main(String[] args) {
        Account account = new Account();
        Scanner myObj = new Scanner(System.in);
        account.getBalance();
            System.out.println("deposit");
        account.deposit(myObj.nextDouble());
        account.getBalance();
            System.out.println("withdraw");
        account.withdraw(myObj.nextDouble());
        account.getBalance();
            System.out.println("withdraw");
        account.withdraw(myObj.nextDouble());
        account.getBalance();
            System.out.println("deposit");
        account.deposit(myObj.nextDouble());
        account.getBalance();
            System.out.println("withdraw");
        account.withdraw(myObj.nextDouble());
        account.getBalance();

        }

    }
 class Account{
    private double balance;
    public void account(double balance)
        {

            balance = 0;
            System.out.println("test");
        }
        public void deposit(double deposit)
        {
            balance += deposit;
            System.out.println(balance);
        }
     public void withdraw(double withdraw)
     {
         if(balance >= withdraw)
         {
             balance -= withdraw;
         }
         else
         {
             System.out.println("Za mało pieniędzy");
         }
     }
     public void getBalance()
     {
         System.out.println("Saldo to: " + balance);
     }
    }