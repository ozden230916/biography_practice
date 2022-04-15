import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his listOfBooks
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the listOfBooks of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his listOfBooks as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's listOfBooks are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        ArrayList<Book> listOfBooks = new ArrayList<>();

        System.out.println("What is your favorite author’s first name? ");
        String firstName = input.next();

        System.out.println("What is your favorite author’s last name? ");
        String lastName = input.next();

        System.out.println("Where is your favorite author is from? ");
        String country = input.next();

        String isAliveString = "";
        boolean isAlive = false;
        System.out.println("Is your favorite author is alive");
        isAliveString = input.next();
        if (isAliveString.toUpperCase().startsWith("Y")) isAlive = true;

        int age = 0;
        if(isAlive){
            System.out.println("What is your favorite author’s age? ");
            age = input.nextInt();
        }


        Author author = new Author(firstName, lastName, country, isAlive,age, listOfBooks);

        String answer;
        do {
            System.out.println("Would you like to enter book info? ");
            answer = input.next();
            input.nextLine();

            if (answer.toUpperCase().startsWith("Y")){

                System.out.println("What is the name of the book? ");
                String name = input.nextLine();

                System.out.println("What is genre of the book?");
                String genre = input.next();

                System.out.println("How many pages does book have?");
                int totalPage = input.nextInt();

                Book book = new Book(name, genre, totalPage);
                listOfBooks.add(book);

            }

        }while(answer.toUpperCase().startsWith("Y"));

        System.out.println(author);

        if (!listOfBooks.isEmpty()){
            System.out.println("Autor's listOfBooks are as listed below :");
            for (Book book : listOfBooks) {
                System.out.println(book);
            }
        }


    }
}
