/*
ENCAPSULAMIENTO: Es el proceso de ocultar los detalles internos de un objeto y exponer solo lo necesario a través de métodos públicos. 
Esto ayuda a proteger los datos y a mantener la integridad del objeto. En Java, esto se logra utilizando modificadores de acceso como:

 MODIFICADORES DE ACCESO:
 public: Se puede usar desde cualquier lugar. puedo definir Clases, atributos y métodos como públicos, lo que significa que pueden ser accedidos desde cualquier parte del programa.
 private: Solo se puede usar dentro de la misma clase, obligas a usar métodos para acceder a los datos, lo que ayuda a proteger la integridad de los datos y a controlar cómo se accede a ellos.
         se le asigna private a los atributos para que no puedan ser accedidos directamente desde fuera de la clase, y se crean métodos públicos (getters y setters) 
         para acceder y modificar esos atributos de manera controlada. tambien se pueden hacer métodos privados para que solo puedan ser utilizados dentro de la clase.
 protected:Se puede acceder desde la misma clase, desde otras clases del mismo paquete y también desde clases hijas (herencia), incluso si están en otro paquete.
           Es un nivel intermedio entre public y private, y se usa principalmente cuando se trabaja con herencia.

MODIFICADORES DE COMPORTAMIENTO

static
final


el void va en los métodos, no en los atributos, el void indica que el método no devuelve ningún valor. Si queremos que un método devuelva un valor, 
debemos especificar el tipo de dato que devuelve en lugar de void. si tiene un return el metodo no debe ir el void

hacemos metodos public para que puedan ser accedidos desde fuera de la clase, y asi poder interactuar con los objetos de esa clase.
estos metodos puedes acceder a los atributos privados de la clase, lo que nos permite controlar cómo se accede y modifica esos atributos, protegiendo así la integridad de los datos.
en el  main llamamos alos metodos public para obtener informacion de los atributos privados, o para modificar esos atributos de manera controlada, sin acceder directamente a ellos.

si son private podemos accder a los valores por get y set, si son public accedemos directamente a los atributos, pero esto no es recomendable porque no tenemos control sobre como se modifican esos atributos, lo que puede llevar a errores o a datos inconsistentes.
si son public podemos accecer con el nombre de la clase.atributo    pero esto no es recomendable porque no tenemos control sobre como se modifican esos atributos, lo que puede llevar a errores o a datos inconsistentes.

--------------------------------------------------------------------------------------------------------------------------
Accesadores y Mutadores (Getters y Setters): Son métodos públicos que permiten acceder y modificar los atributos privados de una clase.
- Getters: Son métodos que devuelven el valor de un atributo privado. Se nombran comúnmente con el prefijo "get" seguido del nombre del atributo con la primera letra en mayúscula. 
  Por ejemplo, getSaldo() para acceder al saldo de una cuenta bancaria.
- Setters: Son métodos que permiten modificar el valor de un atributo privado. Se nombran comúnmente con el prefijo "set" seguido del nombre del atributo con la primera letra en mayúscula. 
  Por ejemplo, setSaldo(double saldo) para modificar el saldo de una cuenta bancaria.


*/