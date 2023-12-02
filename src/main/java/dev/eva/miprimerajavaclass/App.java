package dev.eva.miprimerajavaclass;

public final class App {
    private App() {
    }
    
    public static void main(String[] args) {

        // creación de objetos Persona.
        // Parte 1
        Person person1 = new Person("Robert", "Smith", 1980, "10159787T");
        Person person2 = new Person("Samantha", "García", 1990, "20690224P"); 

        // Parte 2: crear instancia con setters  
        person1.setbirthCountry("EEUU");
        person1.setGender('H');
        person2.setbirthCountry("Spain");
        person2.setGender('M');

        //Impresión de los Atributos de la persona 
        person1.printAttributes();
        person2.printAttributes();
    }

}
