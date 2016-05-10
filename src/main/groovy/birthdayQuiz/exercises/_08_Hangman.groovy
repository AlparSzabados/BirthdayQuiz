package birthdayQuiz.exercises

import birthdayQuiz.PlayerInput

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _08_Hangman {
    static String description = '''8. Egy tapintatos professzionális férj 3 év alatt már kitalálja hogy hogyan kell szólítsák egymást a feleségével!
Ha nem, akkor ő lesz az akasztott ember…\n'''

    static Closure<Boolean> run = {
        def words = ['kincsifincs', 'husbandi & halfszkaj', 'kicsi kaka liliomszal']
        def wordsRedacted = ['k__________', '___b____ & ________j', '_____ ____ _____m____']
        def playerWordPool = []

        for (j in 0..<wordsRedacted.size()) {
            def lettersTried = []
            def numberOfTries = (words[j].size() + 10)
            def wordRedactedList = wordsRedacted[j].toList()
            def wordList = words[j].toList()

            println "you have ${numberOfTries} tries.\n"
            println "${wordRedactedList} \n"

            List<String> container = wordRedactedList
            for (counter in 0..numberOfTries) {
                println "tries left: ${numberOfTries}| letters tried: ${lettersTried.join(',')}"

                def letter = PlayerInput.readLowercase()
                lettersTried += letter

                container = checkLetter(letter, wordList, container)
                println container

                numberOfTries -= 1

                if (container == wordList) {
                    println 'Check!\n'
                    playerWordPool += container.join('')
                    break
                }
            }
        }

        if (words == playerWordPool) {
            openUrl wins[0]
            openUrl taskLinks[7]
            return true
        } else {
            openUrl loses[0]
            false
        }
    }

    static checkLetter(String letter, List<String> wordIn, List<String> wordOut) {
        def wordNew
        for (i in wordIn.indices) {
            if (letter == wordIn[i]) {
                wordOut[i] = letter
                wordNew = wordOut
            } else {
                wordNew = wordOut
            }
        }
        wordNew
    }
}