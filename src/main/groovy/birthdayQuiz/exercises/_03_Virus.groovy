package birthdayQuiz.exercises

import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.getTaskLinks

class _03_Virus {
    static virusTabs = ['http://www.o-bible.com/kjv.html',
                        'https://www.youtube.com/watch?v=RFqBxCG2ezE',
                        'http://www.pornhub.com/',
                        'http://giphy.com/gifs/applause-clapping-clap-aLdiZJmmx4OVW',
                        'http://www.christiandatingforfree.com/',
                        'http://www.matrimoniale.ro/',
                        'http://www.detoatepentrutoti.ro/anunturi/Romania/Locuri-de-munca/cereri-si-oferte/munca-domiciliu/',
                        'http://www.mahar.ro/categorie/munca-la-domiciliu/',
                        'http://www.romedic.ro/marirea-penisului-0P14710',
                        'http://www.youjizz.com']

    static String description = '3. Ne ess pánikba. Találd meg a következő feladatot. \n'
    static Closure<Boolean> run = {
        sleep(3000)
        openUrl taskLinks[2]
        for (tab in virusTabs) {
            openUrl(tab)
            sleep(1000)
        }
        true
    }
}