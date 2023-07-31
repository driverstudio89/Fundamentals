package FinalExam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> likesMap = new LinkedHashMap<>();
        Map<String, Integer> commentsMap = new LinkedHashMap<>();

        while (!input.equals("Log out")) {
            String command = input.split(": ")[0];
            String username = input.split(": ")[1];
            switch (command) {
                case "New follower":
                    if (!likesMap.containsKey(username)) {
                        likesMap.put(username, 0);
                        commentsMap.put(username, 0);
                    }
                    break;
                case "Like":
                    int count = Integer.parseInt(input.split(": ")[2]);
                    if (!likesMap.containsKey(username)) {
                        likesMap.put(username, count);
                        commentsMap.put(username, 0);
                    } else {
                        int newLikes = likesMap.get(username) + count;
                        likesMap.put(username, newLikes);
                    }
                    break;
                case "Comment":
                    if (!commentsMap.containsKey(username)) {
                        commentsMap.put(username, 1);
                        likesMap.put(username, 0);
                    } else {
                        int newComments = commentsMap.get(username) + 1;
                        commentsMap.put(username, newComments);
                    }

                    break;
                case "Blocked":
                    if (!likesMap.containsKey(username)) {
                        System.out.printf("%s doesn't exist.%n", username);
                    } else {
                        likesMap.remove(username);
                        commentsMap.remove(username);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d followers%n", likesMap.size());
        likesMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), (entry.getValue() + commentsMap.get(entry.getKey()))));

    }
}
