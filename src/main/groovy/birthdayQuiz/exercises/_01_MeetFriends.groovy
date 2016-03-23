package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.MARCH

class _01_MeetFriends {
    static String description = '''1. Első feladatod az lesz, hogy találkozz 30 barátoddal.
Mindenik személlyel kell készíts egy képet, ami kettőtöket ábrázolja.
Töltsd fel a képeket az app melletti BirthdayQuiz folderbe.
Minderre van 49 napod. A képekböl 5 darab a konzi területén kell legyen
és a konzi jól felismerhető kell legyen a háttérben.
'''

    static start = MonthDay.of(MARCH, 24)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKOU5xUWQ4ZlJ5clk'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()

        openUrl('http://giphy.com/gifs/afv-funny-fail-lol-l4KibWpBGWchSqCRy') 

        println 'Addigis itt van ez a link'
        true
    }
}
