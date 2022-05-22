# Intrucciones para ejecutar el juego
1. Debes descargar el Driver para la conexion entre java y Mysql recuerda descargar el archivo .jar

https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.29

Se utilizo la version 8.0.29 para la conexion con mysql.

Luego debes agregarlo como libreria en tu proyecto
Para este ejemplo usamos NetBeans IDE 13.
A continuacion puedes ver un breve ejemplo de como agregar este driver como libreria. 

1.1 Vas al archivo del juego y te ubicas en la carpeta librerias
 

1.2 das click derecho y seleccionas Add JAR/Folder
 

1.3 Buscas la ubicacion donde descargaste el archivo, del link https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.29 recuerda descomprimirlo luego de la descarga.

 

Selecciona el archivo mysql-connector-java-8.0.29.jar y le das a open luego de esto veras que fue añadido a Libraries

 

 Ahora vamos a instalar mysql

2. Debes tener mysql en tu equipo lo puedes descargar desde el siguiente Link
https://dev.mysql.com/downloads/mysql/
 

Descargamos el instalador de mayor peso puesto que realiza una instalacion mucho mas completa ademas de trae MySQL Workbench 8.0 CE dentro de los paquetes de instalacion, para descarga e instalacion puedes seguir los pasos del siguiente video: https://www.youtube.com/watch?v=hUZKNsnHe_A


3. Antes de correr el codigo en java debes crear las tablas en mysql para eso encontraras las lineas de codigo 
en la carpeta,BasedeDatos donde encontrar un archivo ejecutable en MySQL Workbench 8.0 CE.

 

Ejecutas los comandos dentro del administrador de bases de datos en este caso es MySQL Workbench 8.0 CE y tendras creadas las tablas, ahora vamos a ejecutar el codigo en java, para esto primero tenemos que validar algunas cosas.

1. Para la conexion a mysql debes validar el usuario y contraseña usado en mysql, para este codigo se uso el usuario root y la contraseña mysql
 
dentro del package MainLogin en la carpeta del proyecto del juego encuentras la clase ConSQL la cual establese la conexion entre java y mysql en la url tenemos el puerto que se utiliza, en la variable 'url' indicamos la direccion y el puerto, en la variable 'user' indicamos el usuario y en la variable 'password' la contraseña para conectar con la base de datos de mysql si tu conexion es diferente puedes modificar modificar el atributo url, de igual manera si tu usuario y contraseña de mysql es distinto puedes modificar los atributos user y password respectivamente.


Una vez tengamos corriedo mysql en nuestro equipo y las tablas esten creadas en nuestra base de datos, podremos ejecutar el codigo. Para correr mysql podremos usar ampps que lo puedes encontrar gratuito en el siguiente link :

https://ampps.com/ 

aunque puedes usar el que a ti te guste. Listo vamos a realizar la ejecucion del codigo.


Para esto vamos a apache NetBeans IDE 13 en el package MainLogin abrimos la clase Splash.java y ejecutamos el siguiente metodo main


public static void main(String args[]) throws InterruptedException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

Nos encontramos ahora con la interfaz del juego donde primero tenemos un Splash que hace una prueba a la conexion con mysql para luego mandarnos a una pestaña de creacion de usuario.Puedes ver ejemplos del juego en el siguiente video: 


https://youtu.be/N36-At-QaQY

Recuerda mi nombre es Einer Aponte y me encantaria hacer parte del equipo SofkaU.


Gracias!!




















