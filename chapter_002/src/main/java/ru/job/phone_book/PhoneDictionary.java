package ru.job.phone_book;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Return list of the persons that contains the key in any persons field.
     *
     * @param key Search key.
     * @return list of found persons.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            String personName = person.getName();
            String personSurname = person.getSurname();
            String personPhone = person.getPhone();
            String personAddress = person.getAddress();
            if (key.contains(personName) || key.contains(personSurname) || key.contains(personPhone) || key.contains(personAddress)) {
                result.add(person);
            }
        }

        return result;
    }
}
