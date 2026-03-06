package DPK15

class DPK15_impl_10

@main def dpk15Impl10(): Unit = {

    val john = new PersonImpl10("John", 30)
    val paul = new PersonImpl10("Paul", 35)
    val george = new PersonImpl10("George", 28)
    val ringo = new PersonImpl10("Ringo", 26)

    john.addFriend(paul)
    john.addFriend(george)

    paul.addFriend(john)

    george.addFriend(john)
    george.addFriend(paul)
    george.addFriend(ringo)

    val people = List(john, paul, george)

    val service = new PersonServiceImpl10(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl10(name: String, age: Int) {

    private var friends: Set[PersonImpl10] = Set()

    def addFriend(friend: PersonImpl10): Unit =
        friends = friends + friend

    def removeFriend(friend: PersonImpl10): Unit =
        friends = friends - friend

    def getFriends(): List[PersonImpl10] =
        friends.toList

    def getFriendsCount(): Int =
        friends.size

    def getAge(): Int = age

    def getName(): String = name
}

class PersonServiceImpl10(private val people: List[PersonImpl10]) {

    def personWithMostFriends(): PersonImpl10 =
        people.reduce { (a, b) =>
            if (a.getFriendsCount() > b.getFriendsCount()) {
                a
            } else {
                b
            }
        }

    def personWithLeastFriends(): PersonImpl10 =
        people.reduce { (a, b) =>
            if (a.getFriendsCount() < b.getFriendsCount()) {
                a
            } else {
                b
            }
        }


    def personWithOldestFriend(): PersonImpl10 = {
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
