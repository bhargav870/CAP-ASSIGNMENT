//advanced functions assignment 
//question1
const isEven = (num) => num % 2 == 0; 
let arr=[1,3,5,4,2];
const Sqr = (num) => num * num;
var resarr = [];
function find(arr, func) {
    if(func(arr.slice(0,1))){return arr.slice(0,1);}  //it would be even then it would return value or it would go to else after checking first position
    else{
    arr= arr.slice(1,(arr.length)); // in this after slicing first position it would pass remainig array and then passed to if loop 
    return find(arr,func);  //that sliced array is saved here and sent again up where it would check irst element
    }
}
//find(arr,isEven) //we have to use this in direct console
//question2
function map(arr,fun){
    if(arr.length==0){
        return resarr;}
    else{
    resarr.push(fun(arr.slice(0,1)))
    console.log(resarr);
    arr= arr.slice(1,(arr.length));
    return map(arr,fun);
    }
}
function Q1(){
    document.getElementById("hello").innerHTML = `The Orginal array is : <br>[${arr}] <br> and the result of find(arr, isEven) is : <br> [${find(arr, isEven)}]`;
}
function Q2(){
    document.getElementById("hello").innerHTML = `The Orginal array is : <br>[${arr}] <br> and the result of map(arr, Sqr) is : <br> [${map(arr, Sqr)}]`;
}
var Q3=function(a,b){return a*b;}
console.log(Q3);