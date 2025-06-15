package org.study.Statistical_AND_Parallel_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class sortUsersByScoreAndGroupTogether {
//    Simulate a leaderboard: sort users by score descending, group users with same score together.
    public static void main(String sk[]){
        class User{
            private int id;
            private String name;
            private int score;
            User(int id, String name, int score){
                this.id=id;
                this.name=name;
                this.score=score;
            }
            public int getId(){return id;}
            public String getName(){return name;}
            public int getScore(){return score;}

            public void setId(int id){ this.id=id;}
            public void setName(String name){ this.name=name;}
            public void setScore(int score){ this.score=score;}
            @Override
            public String toString() {
                return String.format("User{id=%d, name='%s', score=%d}", id, name, score);
            }

        }
        List<User> users=new ArrayList<>(Arrays.asList(
                new User(1, "Alice", 90),
                new User(2, "Bob", 85),
                new User(3, "Charlie", 78),
                new User(4, "David", 90),
                new User(5, "Eve", 85),
                new User(6, "Frank", 72),
                new User(7, "Grace", 88),
                new User(8, "Hannah", 88),
                new User(9, "Ian", 70),
                new User(10, "Jack", 72),
                new User(11, "Kathy", 95),
                new User(12, "Leo", 67),
                new User(13, "Mona", 78),
                new User(14, "Nate", 80),
                new User(15, "Olivia", 67),
                new User(16, "Paul", 95),
                new User(17, "Quinn", 82),
                new User(18, "Rachel", 90),
                new User(19, "Sam", 78),
                new User(20, "Tina", 85)
        ));

        Map<Integer,List<User>> result=users.stream()
                .sorted(Comparator.comparingInt(User::getScore).reversed())
                .collect(Collectors.groupingBy(User::getScore,Collectors.toList()));
        System.out.println(result);
    }
}
