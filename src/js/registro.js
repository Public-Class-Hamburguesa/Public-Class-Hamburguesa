function registrar(){
    var http = new XMLHttpRequest;

    http.onreadystatechange = function(){
        if (http.readyState==4 && http.status==200){
            alert("hola");
            alert(http.responseText);
            document.getElementById("resultado").innerHTML=http.responseText;
        }
    }

    http.open("POST","http://localhost:8080/AppRestaurantes/Registrar", true);
    http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    http.send("edad="+document.getElementById("edad").value+"&&email="+document.getElementById("email").value+"&&usuario="+document.getElementById("usuario").value+"&&contrasenya="+document.getElementById("contrasenya").value);
}
