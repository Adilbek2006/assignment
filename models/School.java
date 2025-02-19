package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Person> members;
    public School() {
        members = new ArrayList<>();
    }
    public void addMember (Person person) {
        members.add(person);
    }
    @Override
    public String toString() {
        String result = "";
        for (Person member : members) {
           result += member.toString() + "\n";
        }
        return result.toString();
    }

}
