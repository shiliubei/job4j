package ru.job.profession;


public class Professions {
    String name;
}

class Doctor extends Profession {
    public void treat(Patient person) {

    }
}

class Teacher extends Profession {
    public void teach(Student person) {

    }
}

class Engineer extends Profession {
    public void buildHouse(House house) {

    }
}

class Patient {
    String name;
}

class House {
    String name;
}


class Student {
    String name;
}