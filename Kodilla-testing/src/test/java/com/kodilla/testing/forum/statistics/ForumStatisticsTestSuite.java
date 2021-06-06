package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 class AdvStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateUserNames(int numberOfUsers) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String userName =("User." + n);
            resultList.add(userName);
        }
        return resultList;
    }

    @Test
    void testCalculateAdvStatisticsWhen0 (){
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListUserName = generateUserNames(0);
        when(statisticsMock.usersNames()).thenReturn(resultListUserName);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, advStatistics.getNumberOfUsers());
        assertEquals(0, advStatistics.getNumberOfPosts());
        assertEquals(0, advStatistics.getNumberOfComments());
        assertEquals(0, advStatistics.getAverageNumberOfPostForUser());
        assertEquals(0, advStatistics.getAverageNumberOfCommentsForUser());
        assertEquals(0, advStatistics.getAverageNumberOfCommentsForPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenMany (){
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListUserName = generateUserNames(100);
        when(statisticsMock.usersNames()).thenReturn(resultListUserName);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, advStatistics.getNumberOfUsers());
        assertEquals(1000, advStatistics.getNumberOfPosts());
        assertEquals(10, advStatistics.getNumberOfComments());
        assertEquals(10, advStatistics.getAverageNumberOfPostForUser());
        assertEquals(0.1, advStatistics.getAverageNumberOfCommentsForUser());
        assertEquals(0.01, advStatistics.getAverageNumberOfCommentsForPost());
    }

    //    gdy liczba komentarzy > liczba postów,
    @Test
    void testCalculateAdvStatisticsWhenMoreComments (){
        //Given
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> resultListUserName = generateUserNames(5);
        when(statisticsMock.usersNames()).thenReturn(resultListUserName);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, advStatistics.getNumberOfUsers());
        assertEquals(10, advStatistics.getNumberOfPosts());
        assertEquals(100, advStatistics.getNumberOfComments());
        assertEquals(2, advStatistics.getAverageNumberOfPostForUser());
        assertEquals(20, advStatistics.getAverageNumberOfCommentsForUser());
        assertEquals(10, advStatistics.getAverageNumberOfCommentsForPost());
    }

}