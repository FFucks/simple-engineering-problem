package DPK15

class DPK15_impl_3

@main def dpk15Impl3(): Unit = {

    val john = new PersonImpl3("John", 30)
    val paul = new PersonImpl3("Paul", 35)
    val george = new PersonImpl3("George", 28)

    john.addFriend("Paul")
    john.addFriend("George")

    paul.addFriend("John")

    george.addFriend("John")
    george.addFriend("Paul")
    george.addFriend("Ringo")

    val people = List(john, paul, george)

    val service = new PersonServiceImpl3(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl3 (name: String, age: Int) {

    private val friendsList = new FriendImpl3()

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

class FriendImpl3 {

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

class PersonServiceImpl3(private val people: List[PersonImpl3]) {

    def personWithMostFriends(): PersonImpl3 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl3 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl3 = {
        var result: PersonImpl3 = people.head
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
