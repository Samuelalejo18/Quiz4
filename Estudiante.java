/**
 * clase estudiante
 */


import java.util.Calendar;

public class Estudiante {
    private String name;
    private int yearOfBirth;
    private double subjectNote1;
    private double subject2Note2;
    private double subject3Note3;

    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/

    /**
     * Método constuctor para inicializar los atributos de la clase
     *
     * @param name          nombre del estudiante
     * @param yearOfBirth   fecha de nacimiento
     * @param subjectNote1  nota  de la materia 1
     * @param subject2Note2  nota  de la materia 2
     * @param subject3Note3 nota  de la materia 3
     */

    public Estudiante(String name, int yearOfBirth, double subjectNote1, double subjec2tNote2, double subject3Note3) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.subjectNote1 = subjectNote1;
        this.subject2Note2 = subjec2tNote2;
        this.subject3Note3 = subject3Note3;
    }


    /**
     * Método que permite obtener la edad del estudiante
     * * @return  Edad del estudiante
     */

    public double getAge() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - this.yearOfBirth;
    }

    /**
     * Método que permite obtener el promedio de las 3 notas del estudiante
     *
     * @return promedio de notas
     * <p>
     * Complejidad temporal: O(1) Tiempo constante
     */

    public double getAvarage() {
        return (this.subjectNote1 + this.subject2Note2 + this.subject3Note3) / 3;
    }




    }