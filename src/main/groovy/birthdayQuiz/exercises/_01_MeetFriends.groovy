package birthdayQuiz.exercises

import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readLowercase
import static birthdayQuiz.UrlHolder.getWins
import static birthdayQuiz.UrlHolder.taskLinks

class _01_MeetFriends { 
    static String description = '''1. Első feladatod az lesz, hogy találkozz 30 barátoddal.
Mindenik személlyel kell készíts egy képet, ami kettőtöket ábrázolja.
Töltsd fel a képeket az app melletti Birthday Quiz folderbe.
Minderre van 49 napod. A képekböl 5 darab a konzi területén kell legyen
és a konzi jól felismerhető kell legyen a háttérben.
'''

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()
        println 'Addigis itt van ez a link'
        openUrl taskLinks[0]
        openUrl pickRandom(wins)
        true
    }
}
