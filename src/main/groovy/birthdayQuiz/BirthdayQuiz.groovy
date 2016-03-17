package birthdayQuiz

import java.awt.Desktop

class BirthdayQuiz {
    public static void main(String[] args) {

        // Transforms a list of Strings into dates
        static makeDate(List<String> date) {
            def unlock = []
            for (int i in date.indices) {
                def setDate = new Date(date[i])
                unlock += setDate.compareTo(new Date())
            }
            unlock
        }

        // Takes a String URL and opens it in the Browser
        static openURL(def url) {
            Desktop browser = Desktop.getDesktop().browse(new URI(url))
            browser
        }

        // Counts files in a given folder
        static int fileCounter(File file) {
            def fileSize = file.listFiles().findAll { it.name ==~ /.*.jpg/ }.size()
            fileSize
        }
    }
}
