package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.OpenUrl.openUrl
import static java.time.Month.APRIL

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
                        'http://www.youjizz.com',
                        'http://www.elle.ro/beauty/cum-sa-scapi-de-celulita-metode-care-functioneaza-garantat-406606']

    static String description = '3. Ne ess pánikba. Találd meg a következő feladatot. \n'

    static start = MonthDay.of(APRIL, 1)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKeXNET0c3Q3ByWFk'

    static Closure<Boolean> run = {
        for (tab in virusTabs) {
            sleep(2000)
            openUrl(tab)
        }
        true
    }
}