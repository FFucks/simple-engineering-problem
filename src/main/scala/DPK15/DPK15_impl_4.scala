package DPK15

class DPK15_impl_4

@main def dpk15Impl4(): Unit = {

    val john = new PersonImpl4("John", 30)
    val paul = new PersonImpl4("Paul", 35)
    val george = new PersonImpl4("George", 28)

    john.addFriend("Paul")
    john.addFriend("George")

    paul.addFriend("John")

    george.addFriend("John")
    george.addFriend("Paul")
    george.addFriend("Ringo")

    val people = List(john, paul, george)

    val service = new PersonServiceImpl4(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl4 (name: String, age: Int) {
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

class FriendImpl4 {
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

class PersonServiceImpl4(private val people: List[PersonImpl4]) {

    def personWithMostFriends(): PersonImpl4 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl4 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl4 = {
        var result = people.head
        var oldestAge = 0

        for (person <- people) {
            for (friendName <- person.getFriends()) {
                val friend = people.find(_.getName() == friendName)
                if (friend.isDefined && friend.get.getAge() > oldestAge) {
                    oldestAge = friend.get.getAge()
                    result = person
                }
            }
        }

        result
    }
}
