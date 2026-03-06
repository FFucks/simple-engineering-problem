package DPK15

class DPK15_impl_7

@main def dpk15Impl7(): Unit = {

    val john = new PersonImpl7("John", 30)
    val paul = new PersonImpl7("Paul", 35)
    val george = new PersonImpl7("George", 28)
    val ringo = new PersonImpl7("Ringo", 26)

    john.addFriend(paul)
    john.addFriend(george)

    paul.addFriend(john)

    george.addFriend(john)
    george.addFriend(paul)
    george.addFriend(ringo)

    val people = List(john, paul, george)

    val service = new PersonServiceImpl7(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl7 (name: String, age: Int) {
    private val friendsList = new FriendImpl7()

    def addFriend(friend: PersonImpl7): Unit = friendsList.addFriend(friend)

    def removeFriend(friend: PersonImpl7): Unit = friendsList.removeFriend(friend)

    def getFriends(): List[PersonImpl7] = friendsList.getFriends()

    def getFriendsCount(): Int = friendsList.getFriendsCount()

    def getAge(): Int = age

    def getName(): String = name
}

class FriendImpl7 {
    private var friends: Set[PersonImpl7] = Set()

    def addFriend(friend: PersonImpl7): Unit = {
        friends = friends + friend
    }

    def removeFriend(friend: PersonImpl7): Unit = {
        friends = friends - friend
    }

    def getFriends(): List[PersonImpl7] = {
        friends.toList
    }

    def getFriendsCount(): Int = {
        friends.size
    }
}

class PersonServiceImpl7(private val people: List[PersonImpl7]) {

    def personWithMostFriends(): PersonImpl7 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl7 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl7 = {
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



