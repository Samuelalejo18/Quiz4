/**
 * clase Principal
 */
public class Principal {
    /*
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Estudiante estudianteSamuel = new Estudiante("samuel", 2004, 50, 40, 45);
        Estudiante estudianteMaik = new Estudiante("maik", 2003, 40, 35, 30);

        estudianteSamuel.getAge();
        System.out.println("La edad de Samuel es de  " + estudianteSamuel.getAge() + " años");
        estudianteSamuel.getAvarage();
        System.out.println("El promedio de las notas de Samuel es de " + estudianteSamuel.getAvarage());
        estudianteMaik.getAge();
        System.out.println("La edad de Maik es  de  " + estudianteMaik.getAge() + " años");
        estudianteMaik.getAvarage();
        System.out.println("El promedio de las notas de Maik es de  " + estudianteMaik.getAvarage());


    }
}
