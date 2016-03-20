package birthdayQuiz

def word = ['a', 'p', 'p', 'l', 'e']
def wordOut = ['a', '_', '_', '_', '_']

def checkLetter(String letter, ArrayList<String> wordIn, ArrayList<String> wordOut) {
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
def counter = 0

println "you have 10 tries"

while (counter < 10) {
    def contain = wordOut
    contain = checkLetter(PlayerInput.playerInput(), word, contain)
    println contain

    if (contain == word) {
        println "check"
        counter = 10
    } else {
        counter++
    }
}