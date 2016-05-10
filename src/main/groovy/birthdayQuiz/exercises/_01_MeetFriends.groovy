package birthdayQuiz.exercises

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.getTaskLinks

class _01_MeetFriends {

    static String description = '''1. Első feladatod az lesz, hogy találkozz 30 barátoddal.
Mindenik személlyel kell készíts egy képet, ami kettőtöket ábrázolja.
Töltsd fel a képeket az app melletti Birthday Quiz folderbe.
Minderre van 49 napod. A képekböl 5 darab a konzi területén kell legyen
és a konzi jól felismerhető kell legyen a háttérben. \n'''

    static Closure<Boolean> run = {
        sleep(30000)
        println 'Addigis itt van ez a link'
        openUrl taskLinks[0]
        true
    }
}
