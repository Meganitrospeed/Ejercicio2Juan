/**
 *
 * @author Juan
 * @descripcion Examen final <3
 */
public class eje2 {
    public static void main(String[] args) {
             String Matricula;
             String Nombre;
             int Edad;
             String DNI;
             TreeSet<Ejercicio2> Matriculas = new TreeSet<>();
             Scanner teclado = new Scanner(System.in);
             Scanner tecladoInt = new Scanner(System.in);

            public eje2(String comprobaciones, String name, int edades, String docidentificativo) {
                this.Matricula = comprobaciones;
                this.Nombre = name;
                this.Edad = edades;
                this.DNI = docidentificativo;
            }

            public static boolean comprobarMatricula(String matriculitasbonitas) {
                Pattern patron = Pattern.compile("[0-9]\\d{9}");
                Matcher checking = patron.matcher(matriculitasbonitas);
                if (checking.find()) {
                    return true;
                }
                return false;
            }

            static void añadirnuevamatricula() {
                String checkeo;
                do {
                    System.out.println("Introduce tu matricula por favor: ");
                    checkeo = teclado.nextLine();
                    if (!comprobarMatricula(checkeo)) {
                        System.out.println("La matricula no es correcta, por favor intentalo de nuevo");
                    }
                } while (!revisarMatricula(checkeo));
                System.out.println("Introduce tu nombre: ");
                String nombreteclado = teclado.nextLine();
                int edad;
                do {
                    System.out.println("¿Cual es tu edad?: ");
                    edad = tecladoInt.nextInt();
                } while (edad > 100 || edad < 16);
                System.out.println("Cual es su DNI: ");
                String nif = teclado.nextLine();
                Matriculas.add(new Ejercicio2(checkeo, nombreteclado, edad, nif));
                System.out.println("Registro creado correctamente");

            }
        }