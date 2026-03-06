package DPK15

class DPK15_impl_5

@main def dpk15Impl5(): Unit = {

    val john = new PersonImpl5("John", 30)
    val paul = new PersonImpl5("Paul", 35)
    val george = new PersonImpl5("George", 28)

    john.addFriend("Paul")
    john.addFriend("George")

    paul.addFriend("John")

    george.addFriend("John")
    george.addFriend("Paul")
    george.addFriend("Ringo")

    val people = List(john, paul, george)

    val service = new PersonServiceImpl5(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl5 (name: String, age: Int) {
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

class FriendImpl5 {
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

class PersonServiceImpl5(private val people: List[PersonImpl5]) {

    def personWithMostFriends(): PersonImpl5 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl5 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl5 = {
        var result = people.head
        var oldestAge = 0

        people.foreach { person =>
            person.getFriends().foreach { friendName =>
                people.find(_.getName() == friendName).foreach { friend =>
                    if (friend.getAge() > oldestAge) {
                        oldestAge = friend.getAge()
                        result = person
                    }

                }
            }
        }
        result
    }
}
