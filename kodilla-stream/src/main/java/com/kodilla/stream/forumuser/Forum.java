package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum(){
        theForumUsersList.add(new ForumUser(1, "Jan Kowalski", 'M', LocalDate.of(1980,02,2), 3));
        theForumUsersList.add(new ForumUser(2, "Adam Nowak", 'M', LocalDate.of(2000,1,1), 7));
        theForumUsersList.add(new ForumUser(3, "Anna Kowalska", 'F', LocalDate.of(2005,2,5),17));
        theForumUsersList.add(new ForumUser(4, "Grażyna Nowak", 'F', LocalDate.of(1986,8,1), 2));
        theForumUsersList.add(new ForumUser(5, "Gal Anonim", 'M', LocalDate.of(1999,10,10),1723));
        theForumUsersList.add(new ForumUser(6, "Bożenka Zklanu", 'F', LocalDate.of(20015,9,9), 23));
        theForumUsersList.add(new ForumUser(7, "Kot Prezesa", 'M', LocalDate.of(1955,12,12), 1));

    }
    public List<ForumUser> getTheForumUsersList(){ return new ArrayList<>(theForumUsersList);}

}
