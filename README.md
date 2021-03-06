# Public Class Hamburguesa

## Video del proyecto 2 : [Proyecto 2-TimeInn Video](https://drive.google.com/file/d/1ioFLt9j6JfLDsbtAN8_JBZZFuR_H4-D4/view?usp=sharing)

Hemos diseñado una aplicación web cuyo fin es satisfacer la necesidad del local de comida rápida Public Hamburguesa, ofreciendo simpleza y eficiencia a sus clientes a la hora de realizar pedidos.

### Requisitos funcionales

1. CLIENTE_RF01: El usuario debe poder iniciar un pedido

2. CLIENTE_RF02: El usuario debe poder añadir uno o varios productos a su pedido.

3. CLIENTE_RF03: El usuario debe poder cancelar su pedido siempre y cuando no lo haya finalizado.

4. CLIENTE_RF04: El usuario debe poder confirmar y finalizar su pedido.

5. EMPLEADO_RF01: El empleado debe poder visualizar los pedidos en cola.

6. EMPLEADO_RF02: El empleado debe poder marcar un pedido como “listo”.

### Requisitos del sistemas

+ El acceso informativo a la aplicación debe de estar disponible las 24 horas.
+ Los pedidos solo deberán poder ser realizados en horario laboral.
+ La implementación debe realizarse desde un dispositivo con conexión a internet o desde los paneles disponibles en el establecimiento.

## Modelo entidad relación de la BDD

Un modelo entidad-relación es una herramienta para el modeladoEs el proceso que permite describir el tipo y las relaciones entre los datos. de datos que permite representar las entidades relevantes de una base de datos así como sus interrelaciones y propiedades.

<img src="https://i.gyazo.com/778ffe20b613c9a244172477e70bba2c.png">

## Diagrama de diseño general

<img src="https://i.gyazo.com/72611f4dc9e700211266f11ac5925d2b.png">

## Diagrama de actividades y flujo

**Diagrama de actividades y diagrama de flujo en los que se refleja el comportamiento de la aplicación a la hora de iniciar un pedido de un cliente**

Un diagrama de actividades es un diagrama de comportamiento que ilustra el flujo de actividades a través de un sistema. Los diagramas de actividad UML también pueden utilizarse para representar un flujo de eventos en un proceso comercial. Pueden utilizarse para examinar los procesos comerciales a fin de identificar su flujo y sus necesidades.

<img src="https://i.gyazo.com/64941304c1cddf68f9971d128f80ecc1.png">

Un Diagrama de Flujo representa la esquematización gráfica de un algoritmo, el cual muestra gráficamente los pasos o procesos a seguir para alcanzar la solución de un problema. Su correcta construcción es sumamente importante porque, a partir del mismo se escribe un programa en algún Lenguaje de Programación.

<img src="https://i.gyazo.com/7f99f2bf232f367a0c72db920089dd12.png">

# Despliegue de aplicación

En este documento plasmaremos como hemos desplegado nuestra aplicación mediante el uso de Apache Tomcat en un sistema operativo Ubuntu 22.04

### 1. Nos aseguramos de tener todos los repositorios del sistema actualizados

```$ sudo apt update```

### 2. Instalación de Java

```$ sudo apt install openjdk-11-jdk```

### 3. Verificamos la versión del Java instalado 

```$ java version```

### 4. Comprobamos la disponibilidad del paquete de Apache Tomcat en el repositorio

```$ sudo apt-cache search tomcat```

### 5. Instalamos Apache Tomcat Server en nuestro Ubuntu 22.04

```$ sudo apt install tomcat9 tomcat9-admin```

### 6. Comprobamos que el servidor esté encendido mediante el siguiente comando

```$ ss -ltn```

### 7. Uncomplicated firewall (UFW)

En caso de que el UFW estuviera activo, necesitaremos ejectuar el siguiente comando para que cualquier tipo de entrada llegue al puerto 8080

```sudo ufw allow from any to any port 8080 proto tcp```

### 8. Comprobamos la instalación de Apache Tomcat y su configuración

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982785705614913566/unknown.png">

### 9. Creamos un usuario de Tomcat

Para ello, abriremos el archivo "tomcat-users.xml" y crearemos nuestro usuario con el nombre, contraseña y roles que deseemos.

```$ sudo nano /etc/tomcat9/tomcat-users.xml```

<img src="https://linuxhint.com/wp-content/uploads/2020/06/word-image-30.png">

### 10. Reiniciamos Tomcat Server

Tras crear el usuario, reiniciamos Tomcat Server

```$ sudo systemctl restart tomcat9```

### 11. Abrimos el Tomcat Web Appication Manager

Accedemos a dicha dirección desde nuestro navegador

```http://127.0.0.1:8080/manager/html```

<img src="https://linuxhint.com/wp-content/uploads/2020/06/word-image-32.png">

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982767145102499870/unknown.png">

### 12. Movemos el .war de nuestro proyecto al directorio webapps de Tomcat 10.0.21

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982806855162142730/unknown.png">

### 13. Utilizamos el siguiente comando

```sudo sh catalina.sh run```

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982807425881088050/unknown.png">

Aparentemente la terminal se quedará parada, cuando esto ocurra, iniciamos una nueva terminal

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982807586204176414/unknown.png">

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982807933060542524/unknown.png">

### 14. Comprobación final

Podemos comprobar que en el puerto 8080 se encuentra Tomcat

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982808104259432535/unknown.png">

Y si introducimos la ruta de nuestro proyecto y su respectivo index.html, la aplicación estará completamente desplegada.

<img src="https://cdn.discordapp.com/attachments/897890284074041354/982808270177697802/unknown.png">

# Diseño Web de la aplicación

Una aplicación web, para poder ser utilizado por el usuario, requiere de su debido front-end, es decir, el conjunto de archivos html, css y javascript que servirán para plasmar de forma gráfica y vistosa el/los servicio/s relizado por el back-end.

<img src="https://i.gyazo.com/6130186c2b3d197527da4bbd4757a1e7.png">

## Inicio

Para este proyecto hemos optado por un header con una barra de navegación minimalistas con una paleta de colore cálida y apetitosa.

<img src="https://i.gyazo.com/3ac7877bbe4b566d3289d3d35968041d.png">

La barra de navegación, además, dispone de enlaces desplegables que la ayudan a mantenerse más compacta y simple.

<img src="https://i.gyazo.com/ccd74bbc486e98f3f91bc08626cdb6eb.png">

## Login

Hemos introducido un sistema anti-robots en el login mediante JavaScript para que no haya bots tratando de acceder a cuentas de usuarios registrados

<img src="https://i.gyazo.com/8e06298d7d79f911198bacc681aa0339.png">

La página dispone de distintas imagenes y descripciones de los productos.
