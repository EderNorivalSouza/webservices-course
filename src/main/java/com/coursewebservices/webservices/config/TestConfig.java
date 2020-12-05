package com.coursewebservices.webservices.config;

import com.coursewebservices.webservices.entities.Category;
import com.coursewebservices.webservices.entities.Order;
import com.coursewebservices.webservices.entities.User;
import com.coursewebservices.webservices.entities.enums.OrderStatus;
import com.coursewebservices.webservices.repositories.CategoryRepository;
import com.coursewebservices.webservices.repositories.OrderRepository;
import com.coursewebservices.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com",
                "9888888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com",
                "9777777777", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),
                OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),
                OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),
                OrderStatus.WAITING_PAYMENT, user1);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

        Category category1 = new Category(null,"Eletronics");
        Category category2 = new Category(null,"Books");
        Category category3 = new Category(null,"Computers");

        categoryRepository.saveAll(Arrays.asList(category1,category2,category3));

    }
}
