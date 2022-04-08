//q1(const keyword)
// const c = "Kv Bhargav Sai";
// console.log(c + " initial value");
//Q2(SCOPE OF LET KEYWORD)
// var bhar=function(a){
//     if(a>10){
//         let b=10
//         return (a*b);
//     }
//     else{
//         //b        //b is not accesible outside if condition this is an example of scoping
//       return a;
//     }
// }
// console.log(bhar(9));
//Q3(Enhanced object properties)
// let order={
//     id:1,
//     title:"Tandoori momos"
//     price:150,
//     printOrder(){
//         return(`id = ${this.id} , title =${this.title} , price =${this.price}` );
//      },
//      getPrice() {
//         return (`price =${this.price}`);
//     }
// }
// let obj1=Object.assign(order);
// console.log(obj1);
// console.log(order.printOrder());
// console.log(order.getPrice());
//Q4(Arrow functions)
// let names=['Tom','Ivan','jerry']
// const output=names.map(value=>({names1:value,length:value.length}));
// console.log(names);
//Q5 (a)
// let add=function(a:number,b:number){
//     return a+b;
// }
// console.log(add(11,22));
//Q5 (B)
// let username="Bhargav";
// let userfriends=function(username,...userfriend){
//     console.log(username);
//     console.log("List of friends");
//     for(let i in userfriend){
//         console.log(userfriend[i]);
//     }
// }
// userfriends(username,"duruv","varun","aman","aniket","ankur")
//Q5 C
// let name2=["duruv","varun","aman","aniket","ankur"]//list of array list
// let printcapitalNames=function(...name1){
//     console.log("NAMES");
//     for (let i in name1){
//      console.log(name1[i].toUpperCase()); //printing the elements in upper case
//      }
// }
// printcapitalNames(...name2)//using spread operator to split elements of array
//Q6
// function laptop(model, deskno, name) {
//     console.log(`The  laptop is From =>${model}, desk no=>${deskno},name=>${name}`);
// }
// laptop("DELL", "330", "Kv Bhargav Sai");
//Q7(A)
// let ab=["A","B","C","D"]
// let[value1,value2,value3,value4]=ab
// console.log(value3);
//Q7 b
// let organization ={ 
//     Name:"srm ktr" ,
//     adress : {
//         city:"chennai",
//         state:"TamilNadu",
//         pincode:  603203
//     }
// };
// let {adress:{pincode: p}} = organization;
// console.log(p);
