package birthdayQuiz.exercises

import birthdayQuiz.PlayerInput

import java.time.MonthDay

import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.getLoses
import static java.time.Month.APRIL

class _08_Hangman {
    static String description = '''8. Egy tapintatos professzionális férj 3 év alatt már kitalálja hogy hogyan kell szólítsák egymást a feleségével!
Ha nem, akkor ő lesz az akasztott ember…
'''

    static start = MonthDay.of(APRIL, 26)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKYk1nZ2lyckxUcGc'

    static Closure<Boolean> run = {
        def words = ['kincsifincs', 'husbandi & halfszkaj', 'kicsi kaka liliomszal']
        def wordsRedacted = ['k__________', '___b____ & ________j', '_____ ____ _____m____']
        def playerWordPool = []

        for (int j in 0..<wordsRedacted.size()) {
            def lettersTried = []
            def numberOfTries = (words[j].size() + 5)
            def wordRedactedList = wordsRedacted[j].toList()
            def wordList = words[j].toList()

            println "${numberOfTries} találat áll a rendelkezésedre.\n"
            println "${wordRedactedList} \n"

            List<String> container = wordRedactedList
            for (counter in 0..numberOfTries) {
                println "Találatok száma: ${numberOfTries}| eddig használt betük: ${lettersTried.join(',')}"

                def letter = PlayerInput.readLowercase()
                lettersTried += letter

                container = checkLetter(letter, wordList, container)
                println container

                numberOfTries -= 1

                if (container == wordList) {
                    println 'Talált!\n'
                    playerWordPool += container.join('')
                    break
                }
            }
        }


        def success = (words == playerWordPool)
        success
    }

    static checkLetter(String letter, List<String> wordIn, List<String> wordOut) {
        def wordNew
        for (i in wordIn.indices) {
            if (letter == wordIn[i]) {
                wordOut[i] = letter
            }
            wordNew = wordOut
        }
        wordNew
    }
}