package birthdayQuiz.exercises

import static birthdayQuiz.OpenUrl.openUrl

class _03_ { // TODO rename
    static virusTabs = ['http://giphy.com/gifs/applause-clapping-clap-aLdiZJmmx4OVW']

    static String description = ''
    static Closure<Boolean> run = {
        openUrl task03Link
        for (tab in virusTabs)
            openUrl(tab)
        true
    }
}