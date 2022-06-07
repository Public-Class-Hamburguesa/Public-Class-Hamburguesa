function buscarUsuario(){
    var http = new XMLHttpRequest;

    http.onreadystatechange = function(){
        if (http.readyState==4 && http.status==200){
            alert(http.responseText);
            document.getElementById("loginUsuario").innerHTML=http.responseText; //id para mostrar en el header
        }
    }

    http.open("GET","http://localhost:8080/AppRestaurantes/Cliente?usuario="+document.getElementById("usuario").value, true);
    http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    http.send();
    //http.send("usuario="+document.getElementById("usuario").value+"&&contrasenya="+document.getElementById("contrasenya").value);
}
