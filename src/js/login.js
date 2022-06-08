function buscarUsuario(){
    var http = new XMLHttpRequest;

    http.onreadystatechange = function(){
        alert("Respuesta"+http.readyState+": "+http.responseText);
        if (http.readyState==4 && http.status==200){
            alert(http.responseText);
            document.getElementById("loginUsuario").innerHTML=http.responseText; //Usuario para mostrar en el header
        }
    }

    http.open("GET","http://localhost:8080/AppRestaurantes/Login?usuario="+document.getElementById("usuario").value, true);
    http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    http.send();
}

class Usuario {

    //Leer datos del producto
    leerDatosProducto(usuario){
        const infoUsuario = {
            user : usuario.querySelector('p').src,
        }
        let usuarioLS;
        usuarioLS = this.obtenerUsuarioLocalStorage();
        usuarioLS.forEach(function (usuarioLS){
            if(usuarioLS.user === infoProducto.user){
                usuarioLS = usuarioLS.user;
            }
        });
    }
    //Mostrar los productos guardados en el LS
    leerLocalStorage(){
        let usuarioLS;
        usuarioLS = this.obtenerUsuarioLocalStorage();
        usuarioLS.forEach(function (usuario){
            //Construir plantilla
            const row = document.createElement('p');
            row.innerHTML = `
                <p>${usuario.user}</p>`;
            //listaUsuarios.appendChild(row);
        });
    }

    //Almacenar en el LS
    guardarUsuarioLocalStorage(usuario){
        let usuarios;
        //Toma valor de un arreglo con datos del LS
        usuarios = this.obtenerUsuarioLocalStorage();
        //Agregar el usuario al header
        usuarios.push(usuario);
        //Agregamos al LS
        localStorage.setItem('usuarios', JSON.stringify(usuarios));
    }

    //Comprobar que hay elementos en el LS
    obtenerUsuarioLocalStorage(){
        let usuarioLS;

        //Comprobar si hay algo en LS
        if(localStorage.getItem('usuarios') === null){
            usuarioLS = [];
        }
        else {
            usuarioLS = JSON.parse(localStorage.getItem('usuarios'));
        }
        return usuarioLS;
    }

    //Eliminar todos los datos del LS
    vaciarLocalStorage(){
        localStorage.clear();
    }

    //Procesar usuario
    procesarUsuario(e){
        e.preventDefault();

        if(this.obtenerUsuarioLocalStorage().length === 0){
            alert("No ha iniciado sesión")
        }
        else {
            location.href = "login.html";
        }
    }

}
