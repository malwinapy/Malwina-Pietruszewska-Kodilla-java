package com.kodilla.spring.portfolio;

import com.kodilla.kodillaspring.KodillaSpringApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes={KodillaSpringApplication.class})
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> doneList = board.getDoneList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        List<String> toDoList = board.getToDoList().getTasks();

        doneList.add("live");
        inProgressList.add("laugh");
        toDoList.add("love");

        //Then
        assertEquals("live", doneList.get(0));
        assertEquals("laugh", inProgressList.get(0));
        assertEquals("love", toDoList.get(0));

    }
}