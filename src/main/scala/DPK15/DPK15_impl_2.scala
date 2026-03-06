package DPK15

class DPK15_impl_2

@main def dpk15Impl2(): Unit = {

    val john = new PersonImpl2("John", 30)
    val paul = new PersonImpl2("Paul", 35)
    val george = new PersonImpl2("George", 28)

    john.addFriend("Paul")
    john.addFriend("George")

    paul.addFriend("John")

    george.addFriend("John")
    george.addFriend("Paul")
    george.addFriend("Ringo")

    val people = List(john, paul, george)

    val service = new PersonServiceImpl2(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl2 (name: String, age: Int) {

    private val friendsList = new FriendImpl2()

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

class FriendImpl2 {

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

class PersonServiceImpl2(private val people: List[PersonImpl2]) {

    def personWithMostFriends(): PersonImpl2 = {
        var result = people.head
        var maxFriends = result.getFriendsCount()

        people.foreach { person =>
            val count = person.getFriendsCount()

            if (count > maxFriends) {
                maxFriends = count
                result = person
            }
        }

        result
    }

    def personWithLeastFriends(): PersonImpl2 = {
        var result = people.head
        var minFriends = result.getFriendsCount()

        people.foreach { person =>
            val count = person.getFriendsCount()

            if (count < minFriends) {
                minFriends = count
                result = person
            }
        }

        result
    }

    def personWithOldestFriend(): PersonImpl2 = {
        var result: PersonImpl2 = people.head
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
