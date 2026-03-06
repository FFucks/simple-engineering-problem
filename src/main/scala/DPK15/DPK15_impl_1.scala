package DPK15

/*DPK15 OOP with Classes
Create a class that can represent a person.The person should have a name, age and a list of friends.
person = new Person("John", 30)
person.addFriend("Paul")
person.addFriend("George")
person.addFriend("Ringo")
The person should have a method that can return the name of the person and the list of friends.
person.getFriends() ->["Paul", "George", "Ringo"]
    The person should have a method that can return the age.
person.getAge() -> 30
The person should have a method that canreturn the name of the person.
person.getName() -> "John"
Refactoring time :
    Now could you refactor the code and move the list of friends to a separate class ?
    Refactor the code so you dont allow the same friend to be added twice.
Refactor the code so you can remove a friend from the list.
More Refactoring :In one of your classes, could you create a method that tell who is the person
with more friends ?In one of your classes, could you create a method that tell who is the person
with less friends ?In one of your classes, could you create a method that tell who is the person
with the oldest friend ?*/

class DPK15_impl_1

@main def dpk15Impl1(): Unit = {

    val person = new Person("John", 30)

    person.addFriend("Paul")
    person.addFriend("George")
    person.addFriend("Ringo")

    println(person.getFriends())
    println(person.getAge)
    println(person.getName)

    person.removeFriend("George")

    println(person.getFriends())
}



class Person (name: String, age: Int) {

    private val friendsList = new Friend()

    def addFriend(name: String): Unit = {
        friendsList.addFriend(name)
    }

    def removeFriend(name: String): Unit = {
        friendsList.removeFriend(name)
    }

    def getFriends(): List[String] = {
        friendsList.getFriends()
    }

    def getAge: Int = {
        age
    }

    def getName: String = {
        name
    }
}

class Friend {

    private var friends: List[String] = List()

    def addFriend(name: String): Unit = {
        if (!friends.contains(name)) {
            friends = friends :+ name
        }
    }

    def removeFriend(name: String): Unit = {
        friends = friends.filter(_ != name)
    }

    def getFriends(): List[String] = {
        friends
    }
}

