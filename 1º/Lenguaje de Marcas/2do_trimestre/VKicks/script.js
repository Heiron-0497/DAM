function validarFormulario() {
    var usuarioInput = document.getElementById("username");
    var contrasenaInput = document.getElementById("password");
  
    var usuario = usuarioInput.value.trim();
    var contrasena = contrasenaInput.value.trim();
  
    if (usuario === "" || contrasena === "") {
      alert("Por favor, completa todos los campos.");
      return false;
    }
  
    var correoRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!correoRegex.test(usuario)) {
      alert("El formato del e-mail es incorrecto. Por favor, ingresa un correo electrónico válido.");
      return false;
    }
  
    return true;
  }


var selectProducto = document.getElementById("select-producto");
var btnAgregar = document.getElementById("btn-agregar");
var carrito = document.getElementById("carrito");
var itemsCarrito = document.getElementById("items-carrito");
var totalCarrito = document.getElementById("total-carrito");
var btnVaciarCarrito = document.getElementById("vaciar-carrito");

var productosEnCarrito = {};

btnAgregar.addEventListener("click", function() {
  var productoSeleccionado = selectProducto.value;
  var precioProducto = obtenerPrecioProducto(productoSeleccionado);
  
  if (productoSeleccionado !== "" && precioProducto !== null) {
    if (productosEnCarrito.hasOwnProperty(productoSeleccionado)) {
      productosEnCarrito[productoSeleccionado].cantidad++;
    } else {
      productosEnCarrito[productoSeleccionado] = {
        cantidad: 1,
        precio: precioProducto
      };
    }

    actualizarCarrito();
  }
});

btnVaciarCarrito.addEventListener("click", function() {
  productosEnCarrito = {};
  actualizarCarrito();
});

function obtenerPrecioProducto(productoSeleccionado) {
  var cantidadPrecio = productoSeleccionado.split(" - ");
  
  if (cantidadPrecio.length === 2 && cantidadPrecio[1].endsWith("€")) {
    var cantidad = parseFloat(cantidadPrecio[1].slice(0, -1));
    if (!isNaN(cantidad)) {
      return cantidad;
    }
  }
  
  return null;
}

function actualizarCarrito() {
  itemsCarrito.innerHTML = "";
  var total = 0;

  for (var producto in productosEnCarrito) {
    if (productosEnCarrito.hasOwnProperty(producto)) {
      var item = productosEnCarrito[producto];
      var cantidad = item.cantidad;
      var precio = item.precio;
      var subtotal = cantidad * precio;

      var itemCarrito = document.createElement("div");
      itemCarrito.textContent = producto + " (Cantidad: " + cantidad + ")";
      itemsCarrito.appendChild(itemCarrito);

      total += subtotal;
    }
  }

  totalCarrito.textContent = "Total: " + total.toFixed(2) + "€";

  if (total > 0) {
    carrito.classList.add("mostrar");
  } else {
    carrito.classList.remove("mostrar");
  }
}

  