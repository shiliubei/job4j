package ru.job.profession;


public class Professions {
    String name;
    public String getName(String name){
        return this.name;
    }
}

class Doctor extends Professions {
    public void treat(Patient person) {

    }
    public Diagnose heal(Patient patient) {
        Diagnose diagnosis =new Diagnose() ;
        return diagnosis;
    }
}
class Diagnose{
    String diagnosis;
    public String esteblishDiagnosis(String diagnosis){
        return this.diagnosis;
    }

}
class Teacher extends Professions {
    public void teach(Student person) {

    }
}

class Engineer extends Professions {
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