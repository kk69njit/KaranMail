package com.example.karanmail

class EmailFetcher {
    companion object {
        val senders = listOf("Scorpion", "Sub-Zero", "Johnny Cage", "Geras", "Kenshi", "Raiden", "Kung Lao", "Smoke", "Rain",
            "General Shao", "Baraka", "Ashrah", "Havik", "Sindel", "Syzoth")

        val title = listOf("Get Over Here!", "Ice to meet you!", "New Movie Opportunity", "Timeline discovered", "Search for Sento", "Appease the Elder Gods", "The Great Kung Lao",
            "Where there's Smoke..", "A storm is brewing!", "Plans to invade Earthrealm", "Tarkat Vaccinations", "Have you seen Quan Chi?", "CHAOS!", "Royal Invitation",
            "Stuck as Zatarren")

        val summary = listOf("Did you hear me? I said GET OVER HERE! You're never here man.",
            "It was awesome to meet up with you! As Earthrealm's defenders we gotta stick together.",
            "Hey, it's Johnny Cage again. I got a new movie idea. Shoot me a message back and we can sort it out.",
            "Timekeeper, hello again. I've searched through the hourglass and found two more timelines full of allies.",
            "I'm still looking for Sento. My ancestors are really mad I lost the sword again.",
            "I must consult with the Elder Gods if we wish to win this battle. I shall return.",
            "I've receieved word from my cousins that the Great Kung Lao is looking for us. We must RSVP!",
            "..there's Fire! ... I should stop saying that before people get the wrong idea.",
            "I, Rain, the grand water mage of Outworld wish to remind you that there is a hurricane coming your way!",
            "This is your General speaking. Here's the plan I've come up with to teach Earthrealm a lesson.",
            "This is your weekly reminder to get your vaccine against Tarkat! Also remember to social distance!",
            "Champion, I'm on the hunt for the master of demons himself, Quan Chi. Have you seen him?",
            "Chaos is everywhere! I will make it my mission to spread as much of it as possible!",
            "This is your formal invitation to the palace, champion. I hope to see you there for the tournament.",
            "Friend, I'm in a bit of a predicament. I'm stuck in my Zatarren form, any ideas on how to change back?")

        val dates = listOf("June 16", "June 15", "June 14", "June 13", "June 12", "June 11", "June 10", "June 9", "June 8", "June 7", "June 6", "June 5", "June 4", "June 3", "June 2")
        val image = listOf(R.drawable.scorpion, R.drawable.subzero, R.drawable.johnny, R.drawable.geras, R.drawable.kenshi, R.drawable.raiden, R.drawable.kunglao,
            R.drawable.smoke, R.drawable.rain, R.drawable.shao, R.drawable.baraka, R.drawable.ashrah, R.drawable.havik, R.drawable.sindel, R.drawable.reptile)

        val unread = listOf(0,1,0,1,1,0,1,0,1,0,1,0,1,0,1)

        fun getEmails(): MutableList<Email> {
            var emails : MutableList<Email> = ArrayList()
            for (i in 0..9) {
                val email = Email(senders[i], title[i], summary[i], dates[i], image[i], unread[i])
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            var newEmails : MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title[i], summary[i], dates[i], image[i], unread[i])
                newEmails.add(email)
            }
            return newEmails
        }
    }
}