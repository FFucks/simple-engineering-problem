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

    val john = new PersonImpl1("John", 30)
    val paul = new PersonImpl1("Paul", 35)
    val george = new PersonImpl1("George", 28)

    john.addFriend("Paul")
    john.addFriend("George")

    paul.addFriend("John")

    george.addFriend("John")
    george.addFriend("Paul")
    george.addFriend("Ringo")

    val people = List(john, paul, george)

    val service = new PersonServiceImpl1(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl1 (name: String, age: Int) {

    private val friendsList = new FriendImpl1()

    def addFriend(name: String): Unit = {
        friendsList.addFriend(name)
    }

    def removeFriend(name: String): Unit = {
        friendsList.removeFriend(name)
    }

    def getFriends(): List[String] = {
        friendsList.getFriends()
    }

    def getFriendsCount(): Int = {
        friendsList.getFriends().size
    }

    def getAge(): Int = {
        age
    }

    def getName(): String = {
        name
    }
}

class FriendImpl1 {

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

class PersonServiceImpl1(private val people: List[PersonImpl1]) {

    def personWithMostFriends(): PersonImpl1 = {
        var result = people.head
        var maxFriends = people.head.getFriendsCount()

        for (person <- people) {
            if (person.getFriendsCount() > maxFriends) {
                maxFriends = person.getFriendsCount()
                result = person
            }
        }

        result
    }

    def personWithLeastFriends(): PersonImpl1 = {
        var result = people.head
        var minFriends = people.head.getFriendsCount()

        for (person <- people) {
            if (person.getFriendsCount() < minFriends) {
                minFriends = person.getFriendsCount()
                result = person
            }
        }

        result
    }

    def personWithOldestFriend(): PersonImpl1 = {
        var result: PersonImpl1 = people.head
        var oldestAge: Int = 0

        for (person <- people) {
            for (friendName <- person.getFriends()) {
                for (p <- people) {
                    if (p.getName() == friendName) {
                        if (p.getAge() > oldestAge) {
                            oldestAge = p.getAge()
                            result = person
                        }
                    }
                }
            }
        }
        result
    }
}

