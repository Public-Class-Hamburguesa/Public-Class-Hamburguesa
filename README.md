# Despliegue de aplicación

En este documento plasmaremos como hemos desplegado nuestra aplicación mediante el uso de Apache Tomcat en un sistema operativo Ubunto 22.04

### 1. Nos aseguramos de tener todos los repositorios del sistema actualizados

```$ sudo apt update```

### 2. Instalación de Java

```$ sudo apt install openjdk-11-jdk```

### 3. Verificamos la versión del Java instalado 

```$ java version```

### 4. Comprobamos la disponibilidad del paquete de Apache Tomcat en el repositorio

```$ sudo apt-cache search tomcat```

### 5. Instalamos Apache Tomcat Server en nuetru Ubunto 22.04

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
