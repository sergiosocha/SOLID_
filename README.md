
# SOLID

Identificar los principios solid violados y documentarlos

Integrantes: 
+ Cristian Steven Soto Zapata,
+ Sebastian Piñeros Castellanos
+ Sergio Eduardo Socha Mendoza


## Análisis por clase:

### Interface "EmployeeOperations.java"

En esta clase no se cumple el principio de responsabilidad única, es decir tenemos una interfaz donde podemos observar que tenemos múltiples operaciones de diferentes ámbitos, es decir tenemos operaciones para empleado, salario y tambien persistencia para guardar un archivo.

Tambien incumple el principio de segregación de interfaces, por lo mismo que en el anterior, se está dependiendo de una sola interfaz para realizar múltiples procesos, cuando es preferible tener múltiples interfaces con responsbilidades bien definidas

Inversión de dependencias, ya que al estar mezclados los modulos en una misma interfaz, no se cumple este principio.

### Clase "Employee.java"

En la clase "Employee.java" no se viola ningún principio solid

### Clase "ReportGenerator.java"

En esta clase se viola el _principio de inversión de dependencias_, ya que un módulo de alto nivel, como lo es ReportGenerator, depende de módulos de bajo nivel, como 'generateReportExcel' y 'generateReportPDF'

### Clase "EmployeeManager.java"

En la clase  se viola el _principio de responsabilidad única_ donde existen diferentes operacioens dentro, como lo son: añadir un nuevo empleado, eliminar el empleado, calcular el salario y una persistencia es decir guardar en archivo

Tambien se viola el principio de _Segregación de interfaces_ por que no se deberia dejar responsabilidades o procesos de cálculo de salarios y de persistencia al guardar en archivo a una clase que se encarga de gestionar a los empleados

### Clase "PartTimeEmployee.java"

En esta clase se viola el _principio de substitucion de liskov_, ya que se espera que el método procedente de la clase padre como lo es 'getName' funcione correctamente pero al sustituirlo en este caso solo genera una excepción "throw new UnsupportedOperationException(), a simple vista se puede considerar un code smell, ya que la excepción indica que PartTimeEmployee no debe heredar el comportamiento de Employee, si se utiliza la clase de PartTimeEmployee es muy probable que como resultado se obtenga la excepción, y si la excepción existe es porque fallará al menos en la mayoría de casos. ;"

### Clase "SalaryCalculator.java"

En esta clase se viola el _principio de inversión de dependencias_, ya que depende de la clase 'EmployeeManager' y no de una abstracción, esto genera un nivel de acoplamiento en el que si afecto o genero un cambio employeemanager directamente se afecta salaryCalculator, siendo employeeManager una de las clases que se deben refactorizar generaría errores en este caso en el calculo del salario, que depende de esta, cierra en gran medida la eficiencia con la que se puede escalar el codigo de forma limpia.
