
# SOLID

Identificar los principios solid violados y documentarlos

Integrantes: 
+ Cristian Steven Soto Zapata,
+ Sebastian Piñeros Castellanos
+ Sergio Eduardo Socha Mendoza


## Analisis por clase:

### Interface "EmployeeOperations.java"

En esta clase no se cumple el principio de responsabilidad unica, es decir tenemos una interfaz donde podemos observar que tenemos multiples operaciones de cosas diferentes, es decir tenemos operaciones para empleado, salario y tambien persistencia para guardar un archivo.

Tambien incumple el principio de segregacion de interfaces, por lo mismo que en el anterior se esta dependiendo de una sola interfaz para realizar multiples procesos, cuando es preferible tener muchas interfaces con responsbilidades definidas

Inversion de dependencias, ya que al estar mezclados los modulos en una misma interfaz 

### Clase "Employee.java"

En la clase "Employee.java" no se viola ningun principio solid

### Clase "ReportGenerator.java"



### Clase "EmployeeManager.java"

En la clase  se viola el _principio de responsabilidad_ unica donde existen diferentes operacioens dentro como lo es aadir un nuevo empleado, eliminar el empleado, calcular el salario y una persistencia es decir guardar en archivo

Tambien se viola el principio de _Segregacion de interfaces_ por que no se deberia dejar responsabilidades o procesos de calculo de salarios y de persistencia al guardar en archivo a una clase que se encarga de gestionar a los empleados

### Clase "PartTimeEmployee.java"

En esta clase se viola el _principio de substitucion de liskov_, ya que se esta sobre escribiendo un metodo procedente de la clase padre solo para poner una excepción en este caso "throw new UnsupportedOperationException();"

### Clase "SalaryCalculator.java"


