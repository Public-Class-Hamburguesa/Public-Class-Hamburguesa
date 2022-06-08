const usuario = new Usuario();
const nombreUsuario = document.querySelector('#loginUsuario');

cargarEventos();

function cargarEventos(){

    //Al cargar documento se muestra lo almacenado en LS
    document.addEventListener('DOMContentLoaded', usuario.leerLocalStorage());

    //Enviar pedido a otra pagina
    procesarPedidoBtn.addEventListener('click', (e)=>{usuario.procesarUsuario(e)});
}
