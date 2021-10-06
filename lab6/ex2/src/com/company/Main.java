package com.company;
import java.util.Scanner;
public class Main {


    static Book[] books = new Book[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Author author1 = new Author("Damir Afliatonov","d.afliatonov@innopolis.university","male");
        books[0] = new Book(author1,"123321","0", "How to pass 1st course and not die?");
        int i;

        for(i = 0; i<=10;i++)
        {
            System.out.print("Input book number(only 0 available)(10 to end) ");
            i = in.nextInt();
            if(i == 10) break;

            System.out.println("Book name: " + books[i].name);
            System.out.println("Book author: " + books[i].author.name);
            System.out.println("Book author's gender: " + books[i].author.gender);
            System.out.println("Book author's email: " + books[i].author.email);
            System.out.println("Book price: " + books[i].price);
            System.out.println("Book quantity: " + books[i].quantity);
            System.out.println("");


        }

    }




    static class Book {
        public String name;
        public Author author;
        public String price;
        public String quantity;

        public Book(Author author, String price, String quantity, String name) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.quantity = quantity;
        }
    }



    static class Author {
        public String name;
        public String email;
        public String gender;

        public Author(String name, String email, String gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
    }



}
