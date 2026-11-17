public class MainPersona {
    public static void main(String[] args) {
        Docente d1 = new Docente("Laura", 35, "Matematica");
        Preceptor p1 = new Preceptor("Pedro", 40, "5to A");

        d1.mostrarInformacion();
        System.out.println();
        p1.mostrarInformacion();

        d1.setEdad(36);
        System.out.println("\\nDATOS MODIFICADOS");
        d1.mostrarInformacion();

        d1.setEdad(-5);
        System.out.println("Edad actual: " + d1.getEdad());
    }
}
