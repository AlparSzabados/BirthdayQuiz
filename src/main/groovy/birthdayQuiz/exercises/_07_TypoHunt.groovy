package birthdayQuiz.exercises

import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readLowercase
import static birthdayQuiz.UrlHolder.getTaskLinks
import static birthdayQuiz.UrlHolder.getWins
import static birthdayQuiz.UrlHolder.loses
import static birthdayQuiz.UrlHolder.wins

class _07_TypoHunt {
    static
    final typos = ['tuléltél', 'többett', 'képekböl', 'generály', 'bőlcseleteit', 'lementtetted', 'karíkázós', 'meg kapod', 'lyó', 'irt']
    static playerWords = []
    static counter = 0

    static String description = '''7. András szereti a lyó minőségű dolgokat. András már hetek óta szenved amiatt,
hogy fúj ez az applikáció milyen tele van helyesírási hibákkal. Nos, ezek szándékosak voltak.
Visszagörgetve (vagy akár emlékezetből) írd be az eddig talált 10 hibásan irt szót.
'''

    static Closure<Boolean> run = {
        for (i in typos.indices) {
            println "Kérem a szavakat. (${i + 1})"
            println 'Nyomj egy Enter-t amikor készen állsz.'
            playerWords += readLowercase()
        }

        for (i in typos.indices)
            for (j in typos.indices)
                if (playerWords[i] == typos[j].toLowerCase())
                    counter += 1

        println "${counter} szót találtál meg a 10-ből."

        if (counter <= 5){
            openUrl pickRandom(loses)
        } else {
            openUrl pickRandom(wins)
        }
        openUrl taskLinks[6]
        true
    }
}