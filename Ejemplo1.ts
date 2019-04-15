var foo : number = 2;
console.warn("hi people!");
setTimeout(function () {
  console.warn("hola");
},200);
function hola() {
  return 3;
};

foo = hola(); // Prueba retornando un numérico
// WARNING: es una Prueba
// Is foo a number or a string?
