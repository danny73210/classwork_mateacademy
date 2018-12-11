package lesson6;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<String> string1 = new HashSet<>(Arrays.asList("book1", "book2"));
        User user1 = new User();
        user1.setName("name1");
        user1.setAge(16);
        user1.setLastVisit(new Date(10-10-2014));
        user1.setBooks(string1);

        Set<String> string2 = new HashSet<>(Arrays.asList("book2", "book3"));
        User user2 = new User();
        user2.setName("name2");
        user2.setAge(18);
        user2.setLastVisit(new Date(11-11-2014));
        user2.setBooks(string2);

        Set<String> string3 = new HashSet<>(Arrays.asList("book1", "book2", "book3"));
        User user3 = new User();
        user3.setName("name3");
        user3.setAge(20);
        user3.setLastVisit(new Date(12-12-2014));
        user3.setBooks(string3);

        List<User> users = Arrays.asList(user1, user2, user3);
        Address address1 = new Address();
        Address address2 = new Address();
        Address address3 = new Address();
        address1.setCity("city1");
        user1.setAddress(address1);
        address2.setCity("city2");
        user2.setAddress(address2);
        address3.setCity("city3");
        user3.setAddress(address3);

        List<String> cities = users.stream()
                .map(c -> c.getAddress().getCity())
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(cities);

    }
}
