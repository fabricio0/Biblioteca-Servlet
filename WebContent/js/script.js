function trocadiv(){
const idLogin = document.querySelector('.sub-nav li:nth-child(2) a');
const idCadastro = document.querySelector('.sub-nav li:nth-child(3) a');
[idLogin,idCadastro].forEach( (item) => {
	item.addEventListener('click' ,click);
	console.log(item);
})

function click(event){
const events = event.target;
const nomeAttributo = events.getAttribute('data-refs');
const posicaoTela = document.querySelector(nomeAttributo);
const topo = posicaoTela.getBoundingClientRect().top;

window.scrollTo({
	top: topo,
	behavior: 'smooth',
});
}
}


function scrollsuave(){
const frms = document.querySelectorAll('.formulario');
const frms2 = document.querySelectorAll('.formulario-cad');
const frmsCliente = document.querySelectorAll('.form-info-grid');
const frmsCliente2 = document.querySelectorAll('.form-info-grid-cadastro');
frmsCliente.forEach((item,index) => {
	item.addEventListener('click',() => {
		frms.forEach((item) => {
		item.classList.add('inativo');
		item.classList.remove('anima');
	});
	frms[index].classList.remove('inativo');
	frms[index].classList.add('anima');
	});
});
frmsCliente2.forEach((item,index) => {
	item.addEventListener('click',() => {
		frms2.forEach((item) => {
		item.classList.add('inativo');
		item.classList.remove('animaRight');
		item.classList.remove('especial');
	});
	frms2[index].classList.remove('inativo');
	frms2[index].classList.add('animaRight');
	if (index == 1) frms2[index].classList.add('especial'); 
	else if (index == 3) {frms2[index].classList.add('especial2');}
	});
});
}
scrollsuave();
trocadiv();



