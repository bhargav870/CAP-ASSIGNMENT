// Q1 :

class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
}
r = new Rectangle(4,5); // use these for calling above class in console
r.width
r.height
//   Q2:
class AREAPERIMETER{
    constructor(width, height) {
      this.width = width;
      this.height = height;
  }
   getArea = () => { return this.width * this.height; };
  getPerimeter = () => { return 2 * (this.width + this.height); };
}
//use this for calling  above class in console
r = new AREAPERIMETER(4,5)
r.getArea()
r.getPerimeter()

// Q3:
s = new AREAPERIMETER(4,10); // FIRST PUT THIS IN CONSOLE AND DEIE VALUES THEN USE CONSOLE VALUES
console.log(`New rectangle s of length ${s.length} & width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);
s.width = 5;
console.log(`rectangle s of length ${s.length} & Changed width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);

//Q4:
var myObject = {firstname: "Kv",lastname: "sai",age: "22",city: "Gurgaon",state: "Haryana",country: "India"};
console.log(`First-name is ${myObject.firstname} , lastname  is ${myObject.lastname} , age is ${myObject.age} , city is ${myObject.city} , state is ${myObject.state} , country is ${myObject.country}`);
myObject.lastname = "Kurakula";
console.log(`Changed Lastname ${myObject.lastname}`);
//Q5:
console.log(`since there is no middle name defined The middle name is : ${myObject.MiddleName}`);
myObject.MiddleName = "Bhargav";
console.log(`After defining The middle name is : ${myObject.MiddleName}`);
//Q6:
var string = "{firstName:'Nikki', age:19, city:'Vishakapatnam', state:'AndraPradesh', country:'India'}"; 
eval('var obj='+string); //The Eval function evaluates the string expression and returns its value in number form rather tha string 
console.log(obj);
obj.MiddleName = "Nikitha";
console.log(` The middle name is : ${obj.MiddleName}`);
//q7:
var obj = '{ "firstName":"kv bhargav", "lastName":"Sai" }';
obj = JSON.parse(obj); //converts to a jason by using parse
console.log(obj); 

//Next 3 questions 
//question1
class person{
    constructor(fname ,lname ,age ,skills ,address,city,pincode,dateofbirth,married,profession)
     {
 this.fname=fname;
 this.lname=lname;
 this.age=age;
 this.skills=skills;
 this.dateofbirth=dateofbirth;
 this.address=address;
 this.married=married;
 this.profession=profession;

 }
}
person1=new
person("nikhil","goud",22,["c"],"24/10/1996",{city:"hyderabad",pincode:"521185"},"false","sr analyst")
person2=new
person("harish","chinna",21,"HTML","08/06/1997",{city:"Ameerpet",pincode:"500038"},"false","jranalyst")
//question2