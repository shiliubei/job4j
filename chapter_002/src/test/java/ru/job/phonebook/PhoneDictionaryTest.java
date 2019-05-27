package ru.job.phonebook;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Александр", "Пушкин", "нет", "Набережная реки Мойки, 12")
        );
        List<Person> persons = phones.find("Александр");
        assertThat(persons.iterator().next().getSurname(), is("Пушкин"));
    }
//
//    @Test
//    public void whenFindByAddress() {
//        PhoneDictionary phones1 = new PhoneDictionary();
//        phones1.add(
//                new Person("Александр", "Пушкин", "нет", "Набережная реки Мойки, 12")
//        );
//        List<Person> persons1 = phones1.find("12");
//        assertThat(persons1.iterator().next().getAddress(), is("Набережная реки Мойки, 12"));
//    }
}