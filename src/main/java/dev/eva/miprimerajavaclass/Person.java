package dev.eva.miprimerajavaclass;

// imports

// Clase Person para crear objetos tipo persona //
public class Person {

    // atributos Parte 1
    public String name;
    public String surname;
    public int birthdate;
    public String DNI;  
    // atributos nuevos: Parte 2
    public String birthCountry;
    public char gender; // 'M', 'H', 'O'
    
    // constructor //
    public Person (String name, String surname, int birthdate, String DNI) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.DNI = DNI;
    }
        // getters & setters //

        // get: devuelve los valores de los atributos
        //Parte 1:
        public String getName() {
            return name;
        }        
        public String getSurname() {
            return surname;
        }
        public int getBirthdate() {
            return birthdate;
        }
        public String getDNI() {
            return DNI;
        }                
        //set: añade o modifica los valores de los atributos
        //Parte 2:
        public void setGender (char gender) {
            this.gender = gender;
        }
        public void setbirthCountry (String birthCountry) {
            this.birthCountry = birthCountry;
        }
                
        // métodos //
        public void printAttributes () {
            //código método
            System.out.println("\nName: " + getName() + "\nSurname: " + getSurname() +"\nBirth date: " + getBirthdate() +"\nDNI: " + getDNI() + "\nBirth Country: " + birthCountry + "\nGender: " + gender);
        }
    }

