function registrar(){
    var http = new XMLHttpRequest;

    http.onreadystatechange = function(){
        if (http.readyState==4 && http.status==200){
            document.getElementById("resultado").innerHTML=http.responseText;
        }
    }

    http.open("POST","http://localhost:8080/DAWregister/registrar", true);
    http.send("edad="+document.getElementById("edad").value+"email="+document.getElementById("email").value+"&&usuario="+document.getElementById("usuario").value+"&&contraseña="+document.getElementById("contraseña").value);
}
