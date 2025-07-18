package reviewChapter4;

public class Review2 {
	public static void main(String[] args) {
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
//Europe October 30, 2Am goes back to 1Am
//Q3: 2022-10-30T01:00 [Europe/London]  -> 2022-10-30T03:00 [Europe/London]
    
    static void question4() {
        String x = "Course101";
        String y = "Course" + "101";
        String z = new String("Course101");
        System.out.println("Q4: " + (x == y) + ", " + (x == z) + ", " + x.equals(z));
    }
//Q4: true, false, true
    
    static void question5() {
        StringBuilder log = new StringBuilder();
        log.append("LOGIN").append(":").append("user123");
        log.insert(0, "[SYSTEM] ");
        log.replace(9, 13, "LOGOUT");
        System.out.println("Q5: " + log);
    }
//Q5: [SYSTEM] LOGOUTN:user123
//Q5: [SYSTEM]LLOGOUT:user123
    
    static void question6() {
        double base = 4;
        double height = 3;
        double area = 0.5 * base * height;
        int rounded = (int) Math.round(area);
        System.out.println("Q6: " + area + " → rounded: " + rounded);
    }
//Q6: 6.0 -> rounded: 6
    
    static void question7() {
        var zone = java.time.ZoneId.of("Europe/Berlin");
        var dt = java.time.ZonedDateTime.of(2022, 3, 27, 2, 30, 0, 0, zone);
        var after = dt.plusHours(1);
        System.out.println("Q7: " + dt + " → " + after);
    }
//In 2022, Europe/Berlin switches to DST on: March 27, 2022, at 2:00 AM.
//Q7:2022-03-27T03:30[Europe/Berlin] -> 2022-03-27T04:30[Europe/Berlin]
    
    static void question8() {
        String subject = "COMP2022";
        if (subject.length() >= 4) {
            System.out.println("Q8: " + subject.charAt(0) + ", " + subject.substring(4));
        }
    }
//Q8: C, 2022
    
    static void question9() {
        int[] scores1 = {70, 80, 90};
        int[] scores2 = {70, 80, 90};
        System.out.println("Q9: " + (scores1 == scores2) + ", " + java.util.Arrays.equals(scores1, scores2));
    }
//Q9: false, true
    
    static void question10() {
        double value = 5.8;
        int result = (int) Math.floor(value);
        long rounded = Math.round(value);
        System.out.println("Q10: " + result + " " + rounded);
    }
//Q10: 5 6.0

    static void question11() {
        var date = java.time.LocalDate.of(2023, 1, 15);
        date = date.plusDays(10);
        System.out.println("Q11: " + date);
    }
//Q11: 2023-01-25
    
    static void question12() {
        String msg = "  \tMessage\nLine2 ";
        String cleaned = msg.strip();
        String sub = cleaned.substring(1, 5);
        System.out.println("Q12: " + sub);
    }
//Q12: essa
    
    static void question13() {
        String name = "Max";
        StringBuilder id = new StringBuilder("2025");
        change(name, id);
        System.out.println("Q13: " + name + " " + id);
    }
//Q13: Max 2025-X
    
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
//Asia/Tokyo is UTC+9 and does not observe DST.
//Q14: 2023-12-01T08:00[Asia/Tokyo]
    
    static void question15() {
        String[] courses = {"Physics", "Biology", "Chemistry"};
        java.util.Arrays.sort(courses);
        int idx = java.util.Arrays.binarySearch(courses, "English");
        System.out.println("Q15: " + java.util.Arrays.toString(courses) + ", Index: " + idx);
    }

//Biology, Chemistry, Physics
//Q15: Physics, Biology, Chemistry, Index: -2

    static void question16() {
        String msg = "abc\\ndef\\tghi";
        String fixed = msg.translateEscapes();
        System.out.println("Q16: " + msg.length() + " → " + fixed.length());
    }
//Q16: 13 -> 11
    
    static void question17() {
        var sb = new StringBuilder("Result:Pass");
        try {
            String x = sb.substring(10, 6);
            System.out.println("Q17: " + x);
        } catch (Exception e) {
            System.out.println("Q17: " + e.getClass().getSimpleName());
        }
    }
//Q17: Excemption out of bounds
    
    static void question18() {
        String text = "  software  ";
        text = text.strip().substring(1, 5).toUpperCase();
        System.out.println("Q18: " + text);
    }
//Q18: OFTW
    
    static void question19() {
        String[] x = {"One", "Two"};
        String[] y = {"One", "Three"};
        int diff = java.util.Arrays.compare(x, y);
        System.out.println("Q19: " + diff);
    }
//Unpredictable Greater than 0
//Q19: 1
    
    static void question20() {
        var before = java.time.ZonedDateTime.of(
            java.time.LocalDate.of(2022, 10, 30),
            java.time.LocalTime.of(1, 30),
            java.time.ZoneId.of("Europe/London")
        );
        var after = before.plusHours(1);
        System.out.println("Q20: " + before.getOffset() + " → " + after.getOffset());
    }
//Get offset gives aways number
//Q20: 2022-10-30T01:30[Europe/London] -> 2022-10-30T03:30[Europe/London] 
    
    static void question21() {
        var sb = new StringBuilder("Exam123");
        sb.append("DONE").delete(0, 4).deleteCharAt(sb.length() - 1).reverse();
        System.out.println("Q21: " + sb);
    }
//Q21: NOD321
    
    static void question22() {
        var date = java.time.LocalDate.of(2020, 2, 29);
        var next = date.plusYears(1);
        System.out.println("Q22: " + next);
	}
//Q22: 2021-02-28
}
