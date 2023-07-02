package _02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleArr = scanner.nextLine().split(", ");
        String title = articleArr[0];
        String content = articleArr[1];
        String author = articleArr[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String commandInput = scanner.nextLine();
            String command = commandInput.split(": ")[0];


            switch (command) {
                case "Edit":
                    String newContent = commandInput.split(": ")[1];
                    article.edit(newContent);
                    break;

                case "ChangeAuthor":
                    String newAuthor = commandInput.split(": ")[1];
                    article.changeAuthor(newAuthor);
                    break;

                case "Rename":
                    String newTitle = commandInput.split(": ")[1];
                    article.rename(newTitle);
                    break;
            }
        }

        System.out.println(article.toString());


    }
}
