package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
       public static void main(String[] args) {
            Forum forum = new Forum();
            Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getTheForumUsersList().stream()
                    .filter(forumUser -> forumUser.getSex()=='M')
                    .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear()>20)
                    .filter(forumUser -> forumUser.getPostsQuantity()>=1)
                    .collect(Collectors.toMap(ForumUser::getForumUserId, forumUser -> forumUser));

           System.out.println("# elements: " + theResultMapOfForumUsers.size());
           theResultMapOfForumUsers.entrySet().stream()
                   .map(entry->entry.getKey() + ": " + entry.getValue())
                   .forEach(System.out::println);

        }
        }
