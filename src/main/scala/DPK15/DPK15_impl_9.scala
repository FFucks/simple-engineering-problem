package DPK15

class DPK15_impl_9


@main def dpk15Impl9(): Unit = {

    val john = new PersonImpl9("John", 30)
    val paul = new PersonImpl9("Paul", 35)
    val george = new PersonImpl9("George", 28)
    val ringo = new PersonImpl9("Ringo", 26)

    john.addFriend(paul)
    john.addFriend(george)

    paul.addFriend(john)

    george.addFriend(john)
    george.addFriend(paul)
    george.addFriend(ringo)

    val people = List(john, paul, george)

    val service = new PersonServiceImpl9(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl9(name: String, age: Int) {

    private var friends: Set[PersonImpl9] = Set()

    def addFriend(friend: PersonImpl9): Unit =
        friends = friends + friend

    def removeFriend(friend: PersonImpl9): Unit =
        friends = friends - friend

    def getFriends(): List[PersonImpl9] =
        friends.toList

    def getFriendsCount(): Int =
        friends.size

    def getAge(): Int = age

    def getName(): String = name
}

class PersonServiceImpl9(private val people: List[PersonImpl9]) {

    def personWithMostFriends(): PersonImpl9 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl9 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl9 = {
        var result = people.head
        var oldestAge = 0

        people.foreach { person =>
            person.getFriends().foreach { friend =>
                if (friend.getAge() > oldestAge) {
                    oldestAge = friend.getAge()
                    result = person
                }
            }
        }

        result
    }
}