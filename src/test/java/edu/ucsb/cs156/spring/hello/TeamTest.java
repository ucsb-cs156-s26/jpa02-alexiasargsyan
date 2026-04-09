package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

@Test
    public void equals_same_object() {
        assertEquals(team, team);
    }

@Test
    public void equals_different_class() {
        assertFalse(team.equals("not a team"));
    }

@Test
    public void equals_same_name_same_members() {
        Team t2 = new Team("test-team");
        assertEquals(team, t2);
    }

@Test
    public void equals_different_name() {
        Team t2 = new Team("other-team");
        assertFalse(team.equals(t2));
    }

@Test
    public void equals_different_members() {
        Team t2 = new Team("test-team");
        t2.addMember("Alice");
        assertFalse(team.equals(t2));
    }

@Test
    public void hashCode_same_for_equal_teams() {
        Team t2 = new Team("test-team");
        assertEquals(team.hashCode(), t2.hashCode());
    }


}
