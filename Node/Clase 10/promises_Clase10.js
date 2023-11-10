function hola(nombre) {
	return new Promise(function (resolve, reject) {
		setTimeout(function () {
			console.log('Hola ' + nombre);
			resolve(nombre);
		}, 1000);
	});
}

function hablar(nombre) {
	return new Promise((resolve, reject) => {
		// usamos la sintaxis ES6
		setTimeout(function () {
			console.log('bla bla bla');
			resolve(nombre);
		}, 1000);
	});
}

//Función asincrona - adios
function adios(nombre) {
	return new Promise((resolve, reject) => {
		setTimeout(function () {
			console.log('Adiós ' + nombre); //forma correcta de concatenar
			//resolve();
			reject('Hay un error');
		}, 1000);
	});
}