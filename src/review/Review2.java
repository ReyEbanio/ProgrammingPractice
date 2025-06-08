package review;

public class Review2 {
	public static void main(String[] args) {
		System.out.println("Test");
	    question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
        question17();
        question18();
        question19();
        question20();
        question21();
        question22();
    }

    static void question1() {
        int id = 50;
        String dept = "IT";
        String fullId = dept + id + (id + 1) + dept.length();
        System.out.println("Q1: " + fullId);
    }
//Q1: IT50512
    
    static void question2() {
        String[][] table = {
            {"Math", "90"},
            {"English", "85"}
        };
        System.out.println("Q2: " + table[1][0] + ": " + table[1][1]);
    }
//Q2: English: 85
    
    static void question3() {
        var date = java.time.LocalDate.of(2022, 10, 30);
        var time = java.time.LocalTime.of(1, 0);
        var zone = java.time.ZoneId.of("Europe/London");
        var zdt = java.time.ZonedDateTime.of(date, time, zone);
        var shifted = zdt.plusHours(1);
        System.out.println("Q3: " + zdt + " → " + shifted);
    }
//
    
    static void question4() {
        String x = "Course101";
        String y = "Course" + "101";
        String z = new String("Course101");
        System.out.println("Q4: " + (x == y) + ", " + (x == z) + ", " + x.equals(z));
    }

    static void question5() {
        StringBuilder log = new StringBuilder();
        log.append("LOGIN").append(":").append("user123");
        log.insert(0, "[SYSTEM] ");
        log.replace(9, 13, "LOGOUT");
        System.out.println("Q5: " + log);
    }

    static void question6() {
        double base = 4;
        double height = 3;
        double area = 0.5 * base * height;
        int rounded = (int) Math.round(area);
        System.out.println("Q6: " + area + " → rounded: " + rounded);
    }

    static void question7() {
        var zone = java.time.ZoneId.of("Europe/Berlin");
        var dt = java.time.ZonedDateTime.of(2022, 3, 27, 2, 30, 0, 0, zone);
        var after = dt.plusHours(1);
        System.out.println("Q7: " + dt + " → " + after);
    }

    static void question8() {
        String subject = "COMP2022";
        if (subject.length() >= 4) {
            System.out.println("Q8: " + subject.charAt(0) + ", " + subject.substring(4));
        }
    }

    static void question9() {
        int[] scores1 = {70, 80, 90};
        int[] scores2 = {70, 80, 90};
        System.out.println("Q9: " + (scores1 == scores2) + ", " + java.util.Arrays.equals(scores1, scores2));
    }

    static void question10() {
        double value = 5.8;
        int result = (int) Math.floor(value);
        long rounded = Math.round(value);
        System.out.println("Q10: " + result + " " + rounded);
    }

    static void question11() {
        var date = java.time.LocalDate.of(2023, 1, 15);
        date = date.plusDays(10);
        System.out.println("Q11: " + date);
    }

    static void question12() {
        String msg = "  \tMessage\nLine2 ";
        String cleaned = msg.strip();
        String sub = cleaned.substring(1, 5);
        System.out.println("Q12: " + sub);
    }

    static void question13() {
        String name = "Max";
        StringBuilder id = new StringBuilder("2025");
        change(name, id);
        System.out.println("Q13: " + name + " " + id);
    }

    static void change(String str, StringBuilder sb) {
        str += "well";
        sb.append("-X");
    }

    static void question14() {
        var now = java.time.LocalDateTime.of(2023, 12, 1, 8, 0);
        var zone = java.time.ZoneId.of("Asia/Tokyo");
        var zdt = java.time.ZonedDateTime.of(now, zone);
        var instant = zdt.toInstant();
        System.out.println("Q14: " + instant);
    }

    static void question15() {
        String[] courses = {"Physics", "Biology", "Chemistry"};
        java.util.Arrays.sort(courses);
        int idx = java.util.Arrays.binarySearch(courses, "English");
        System.out.println("Q15: " + java.util.Arrays.toString(courses) + ", Index: " + idx);
    }

    static void question16() {
        String msg = "abc\\ndef\\tghi";
        String fixed = msg.translateEscapes();
        System.out.println("Q16: " + msg.length() + " → " + fixed.length());
    }

    static void question17() {
        var sb = new StringBuilder("Result:Pass");
        try {
            String x = sb.substring(10, 6);
            System.out.println("Q17: " + x);
        } catch (Exception e) {
            System.out.println("Q17: " + e.getClass().getSimpleName());
        }
    }

    static void question18() {
        String text = "  software  ";
        text = text.strip().substring(1, 5).toUpperCase();
        System.out.println("Q18: " + text);
    }

    static void question19() {
        String[] x = {"One", "Two"};
        String[] y = {"One", "Three"};
        int diff = java.util.Arrays.compare(x, y);
        System.out.println("Q19: " + diff);
    }

    static void question20() {
        var before = java.time.ZonedDateTime.of(
            java.time.LocalDate.of(2022, 10, 30),
            java.time.LocalTime.of(1, 30),
            java.time.ZoneId.of("Europe/London")
        );
        var after = before.plusHours(1);
        System.out.println("Q20: " + before.getOffset() + " → " + after.getOffset());
    }

    static void question21() {
        var sb = new StringBuilder("Exam123");
        sb.append("DONE").delete(0, 4).deleteCharAt(sb.length() - 1).reverse();
        System.out.println("Q21: " + sb);
    }

    static void question22() {
        var date = java.time.LocalDate.of(2020, 2, 29);
        var next = date.plusYears(1);
        System.out.println("Q22: " + next);
	}
}
