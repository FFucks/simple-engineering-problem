package DPK15

class DPK15_impl_6

@main def dpk15Impl6(): Unit = {

    val john = new PersonImpl6("John", 30)
    val paul = new PersonImpl6("Paul", 35)
    val george = new PersonImpl6("George", 28)

    john.addFriend("Paul")
    john.addFriend("George")

    paul.addFriend("John")

    george.addFriend("John")
    george.addFriend("Paul")
    george.addFriend("Ringo")

    val people = List(john, paul, george)

    val service = new PersonServiceImpl6(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl6 (name: String, age: Int) {
    private val friendsList = new FriendImpl6()

    def addFriend(friendName: String): Unit = friendsList.addFriend(friendName)

    def removeFriend(friendName: String): Unit = friendsList.removeFriend(friendName)

    def getFriends(): List[String] = friendsList.getFriends()

    def getFriendsCount(): Int = friendsList.getFriends().size

    def getAge(): Int = age

    def getName(): String = name
}

class FriendImpl6 {
    private var friends: Set[String] = Set()

    def addFriend(name: String): Unit = {
        friends = friends + name
    }

    def removeFriend(name: String): Unit = {
        friends = friends.filter(_ != name)
    }

    def getFriends(): List[String] = {
        friends.toList
    }
}

class PersonServiceImpl6(private val people: List[PersonImpl6]) {

    def personWithMostFriends(): PersonImpl6 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl6 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl6 = {
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
