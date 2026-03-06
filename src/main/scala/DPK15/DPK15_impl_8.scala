package DPK15

class DPK15_impl_8

@main def dpk15Impl8(): Unit = {

    val john = new PersonImpl8("John", 30)
    val paul = new PersonImpl8("Paul", 35)
    val george = new PersonImpl8("George", 28)
    val ringo = new PersonImpl8("Ringo", 26)

    john.addFriend(paul)
    john.addFriend(george)

    paul.addFriend(john)

    george.addFriend(john)
    george.addFriend(paul)
    george.addFriend(ringo)

    val people = List(john, paul, george)

    val service = new PersonServiceImpl8(people)

    println(service.personWithMostFriends().getName())
    println(service.personWithLeastFriends().getName())
    println(service.personWithOldestFriend().getName())
}

class PersonImpl8 (name: String, age: Int) {
    private val friendsList = new FriendImpl8()

    def addFriend(friend: PersonImpl8): Unit = friendsList.addFriend(friend)

    def removeFriend(friend: PersonImpl8): Unit = friendsList.removeFriend(friend)

    def getFriends(): List[PersonImpl8] = friendsList.getFriends()

    def getFriendsCount(): Int = friendsList.getFriendsCount()

    def getAge(): Int = age

    def getName(): String = name
}

class FriendImpl8 {
    private var friends: Set[PersonImpl8] = Set()

    def addFriend(friend: PersonImpl8): Unit = {
        friends = friends + friend
    }

    def removeFriend(friend: PersonImpl8): Unit = {
        friends = friends - friend
    }

    def getFriends(): List[PersonImpl8] = {
        friends.toList
    }

    def getFriendsCount(): Int = {
        friends.size
    }
}

class PersonServiceImpl8(private val people: List[PersonImpl8]) {

    def personWithMostFriends(): PersonImpl8 = {
        people.maxBy(_.getFriendsCount())
    }

    def personWithLeastFriends(): PersonImpl8 = {
        people.minBy(_.getFriendsCount())
    }

    def personWithOldestFriend(): PersonImpl8 = {
        people.flatMap(person => person.getFriends().map(friend => (person, friend)))
            .maxBy { case (_, friend) => friend.getAge() }
            ._1
    }
}
