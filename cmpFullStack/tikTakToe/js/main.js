// comstatnts



// apps state variables
let board;




// cahces elements here



// event listners


// fucntions


const init = () => {
  board = [
    '', '','',
    '','', '',
    '','','',
  ];
}
init();


const render = () => {
  board.forEach(function(mark, index){
    console.log(mark, index);
  });
render();


}