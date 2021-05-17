fun main(){
println(indices(listOf("Kenya","Somalia","Tanzania","Ethiopia","Burundi","Somalia","Uganda","South Sudan","Sudan","Rwanda")))
println(people(listOf(3,5,6,7,4)))
var persons= mutableListOf<Person>(Person("June",23,4.5,63.5),
    Person("Kagema",32,5.5,78.9),
    Person("Mabel",29,5.3,59.9))
(person(persons))
    individuals()
var cars= mutableListOf<Car>(Car("KCJ 33E",44303),Car("KCD 89C",56097))
    carLists(cars)
}
fun indices(names:List<String>):List<String>{//Question1
    var x= mutableListOf<String>()
   for (name in names){
       if (names.indexOf(name)%2==0){
           x.add(name)
       }
   }
    return x
}

data class Heights(var total:Int,var average:Double)//Question2
fun people(heights:List<Int>):Heights{
    var totalHeight=heights.sum()
    var averageHeight=heights.average()
    var both=Heights(totalHeight, averageHeight)
    return both
}

data class Person(var name:String,var age:Int,var height:Double,var weight:Double )//Question3
fun person(people:MutableList<Person>){
    var sortedByAge=people.sortedByDescending { people->people.age }
    println(sortedByAge)
}

data class People(var name:String,var age:Int,var height:Double,var weight:Double )
fun individuals(){
    var person1= mutableListOf<People>(People("Sheria",21,4.3,54.5),
        People("Sharin",35,5.8,67.4))
    person1.addAll(mutableListOf(People("Lucy",25,6.4,89.3),
        People("Roberts",45,5.3,78.3)))
    println(person1)
}

data class Car(var registration:String,var mileage:Int)//Question5

fun carLists(cars:List<Car>):Int{
var totalMileage=0
    for (car in cars){
        totalMileage+=car.mileage
    }
    return totalMileage
}