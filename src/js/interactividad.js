
function esRobot() {
    var resultado = "";

    while (resultado != "blanco" && resultado != "BLANCO" && resultado != "Blanco") {
        resultado = prompt("Eres un robot?\n\n De qué color era el caballo blanco de Napoleón?");
    }
}

function tonalidad() {
    document.getElementById("login").style.backgroundColor = "#add8e6";
    ocument.getElementByTagName("header").style.backgroundColor = "#add8e6";
}

esRobot();