package birthdayQuiz

class GenerateRandom {
    static final RANDOM = new Random()

    static pickRandom(List<String> list) {
        list[RANDOM.nextInt(list.size())]
    }
}
