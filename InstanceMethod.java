package test55;

public class InstanceMethod {
    static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }

        public int average() {
            return (getEnglishScore() + getMathScore()) / 2;
        }
    }

    public static void main(String[] args) {
        Student kis = new Student("kis", 60, 80);
        int a = kis.average();
        System.out.println("平均点は" + a + "点です");
    }
}