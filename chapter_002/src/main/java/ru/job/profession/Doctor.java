package ru.job.profession;

class Doctor extends Profession {
    public void treat(Patient person) {

    }
    public Diagnose heal(Patient patient) {
        Diagnose diagnosis =new Diagnose() ;
        return diagnosis;
    }
}