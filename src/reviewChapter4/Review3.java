package reviewChapter4;

public class Review3 {
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

    static void question19s() {
        String[] a = {"ENG", "MATH"};
        String[] b = {"ENG", "SCI"};
        int cmp = java.util.Arrays.compare(a, b);
        System.out.println("Q19: Comparison result: " + cmp);
        //-6
        
    }
	//Q19: Comaparison result: -6
	    static void question1() {
	        int year = 2025;
	        String dept = "ENG";
	        String id = dept + "-" + (year % 100) + ""
	        		+ "-" + (100 + dept.length());
	        System.out.println("Q1: " + id);
	    }
//Q1: ENG-25-97
	    
	    static void question2() {
	        String[][] schedule = {
	            {"CS101", "8AM"},
	            {"MATH200", "10AM"}
	        };
	        System.out.println("Q2: " + schedule[1][0] + ""
	        		+ " @ " + schedule[1][1]);
	    }
//Q2: MATH200 @ 10AM
	    
	    static void question3() {
	        java.time.LocalDate date = java.time.LocalDate.of(2022, 3, 27);
	        java.time.LocalTime time = java.time.LocalTime.of(1, 30);
	        java.time.ZoneId zone = java.time.ZoneId.of("Europe/Berlin"); // UTC+1, DST to UTC+2
	        java.time.ZonedDateTime before = java.time.ZonedDateTime.of(date, time, zone);
	        java.time.ZonedDateTime after = before.plusHours(1);
	        System.out.println("Q3: " + before + " to " + after);
	    }
//Q3: 2022-03-27T01:30 to 2022-03-27T03:30
	    
	    static void question4() {
	        String s1 = "FinalExam";
	        String s2 = new String("FinalExam");
	        System.out.println("Q4: " + (s1 == s2) + ", "
	        		+ "" + s1.equals(s2) + ", " + (s1 == s2.intern()));
	    }
//Q4: false, true, true
	    static void question5() {
	        StringBuilder sb = new StringBuilder("CourseList");
	        sb.append(":MATH").append("-ENG").delete(10, 14).insert(6, "_");
	        System.out.println("Q5: " + sb);
	    }
//Q5: Course_ListH-ENG
	    
	    static void question6() {
	        double base = 5;
	        double height = 6;
	        double area = 0.5 * base * height;
	        int rounded = (int) Math.round(area);
	        System.out.println("Q6: Area: " + area + ", Rounded: " + rounded);
	    }
//Q6: Area: 15.0,Rounded: 15
	    
	    static void question7() {
	        var zone = java.time.ZoneId.of("Asia/Manila"); // UTC+8, no DST
	        var dt = java.time.ZonedDateTime.of(2022, 6, 1, 9, 0, 0, 0, zone);
	        //Philippines is +8 UTC - 9AM
	        //Europe +1 UTC - 2Am
	        //Converted to Europe by getting the time in europe in the same instant
	        var dt2 = dt.withZoneSameInstant(java.time.ZoneId.of("Europe/London")); // UTC+1 (DST)
	        System.out.println("Q7: PH: " + dt + "\n, UK: " + dt2);
	    }
//Q7: PH:2022-06-01T09:00[Asia/Manila],UK: 2022-06-01T08:00["Europe/London"]
	    
	    static void question8() {
	        String course = "MATH2023B";
	        char code = course.charAt(0);
	        String year = course.substring(4, 8);
	        char section = course.charAt(course.length() - 1);
	        System.out.println("Q8: " + code + ", " + year + ", " + section);
	    }
//Q8: M, 2023, B 
	    static void question9() {
	        String[] groupA = {"Alice", "Bob"};
	        String[] groupB = {"Alice", "Bob"};
	        boolean equal = java.util.Arrays.equals(groupA, groupB);
	        System.out.println("Q9: ref eq? " + (groupA == groupB) + ", "
	        		+ "value eq? " + equal);
	    }
//Q9: ref eq? false value eq? true
	    
	    static void question10() {
	        float gpa = 3.75f;
	        long rounded = Math.round(gpa);
	        int floored = (int) Math.floor(gpa);
	        System.out.println("Q10: Rounded: " + rounded + ","
	        		+ " Floored: " + floored);
	    }
//Q10: Rounded: 4.0, Floored: 3
	    
	    static void question11() {
	        java.time.LocalDate start = java.time.LocalDate.of(2023, 9, 1);
	        java.time.LocalDate due = start.plusDays(21);
	        System.out.println("Q11: Start: " + start + ", Due: " + due);
	    }
//Q11: Start: 2023-09-01, Due: 2023-09-22
	    
	    static void question12() {
	        String input = "  \tHello\nWorld  ";
	        String formatted = input.indent(2).strip();
	        //Hello
	        //World
	        System.out.println("Q12: " + formatted.substring(0, 5));
	    }
//Q12: Hello
	    
	    static void question13() {
	        String name = "Eva";
	        StringBuilder id = new StringBuilder("ID2023");
	        modify(name, id);
	        System.out.println("Q13: " + name + ", " + id);
	    }
//Q13: Eva, ED2023-X
	    static void modify(String name, StringBuilder id) {
	        name = name.toUpperCase();
	        id.append("-X");
	    }

	    static void question14() {
	        var dt = java.time.LocalDateTime.of(2024, 10, 5, 12, 0);
	        var zone = java.time.ZoneId.of("UTC");
	        var zdt = java.time.ZonedDateTime.of(dt, zone);
	        var instant = zdt.toInstant();
	        System.out.println("Q14: Instant: " + instant);
	    }
	    //just retain value
//Q14: Instant: 2024-10-05T00:00
	    
	    static void question15() {
	        String[] names = {"Zoe", "Anna", "Mark"};
	        java.util.Arrays.sort(names);
	        int result = java.util.Arrays.binarySearch(names, "Ben");
	        System.out.println("Q15: " + java.util.Arrays.toString(names) + ""
	        		+ ", Search 'Ben': " + result);
	    }
//Q15: [Anna, Mark, Zoe], Search 'Ben': -2
	    
	    static void question16() {
	        String escaped = "Hello\\nWorld\\t!";
	        String unescaped = escaped.translateEscapes();
	        System.out.println("Q16: Original len: " + escaped.length() + ""
	        		+ ", After translate: " + unescaped.length());
	        //Hello
	        //World
	    }
//Q16: Original len: 15, After translate: 13
	    
	    static void question17() {
	        StringBuilder sb = new StringBuilder("Grade=A+");
	        try {
	            System.out.println("Q17: " + sb.substring(7, 3));
	        } catch (Exception e) {
	            System.out.println("Q17: Exception - " + e.getClass().getSimpleName());
	        }
	    }
//Q17: error 
	    static void question18() {
	        String course = "  cs101  ";
	        course = course.strip().toUpperCase().substring(0, 4);
	        System.out.println("Q18: " + course);
	    }
	    //CS10
//Q18: CS10
	    
	    static void question19() {
	        String[] a = {"ENG", "MATH"};
	        String[] b = {"ENG", "SCI"};
	        int cmp = java.util.Arrays.compare(a, b);
	        System.out.println("Q19: Comparison result: " + cmp);
	        //-6
	    }
//Q19: Comparison result: any positive unpredictable
	    
	    static void question20() {
	        var before = java.time.ZonedDateTime.of(
	            java.time.LocalDate.of(2022, 10, 30),
	            java.time.LocalTime.of(1, 30),
	            java.time.ZoneId.of("Europe/London") // DST ends, UTC+1 → UTC+0
	        );
	        var after = before.plusHours(2);
	        System.out.println("Q20: Before offset: " + before.getOffset() + ""
	        		+ ", After offset: " + after.getOffset());
	    }
//Q20: Before offset: -1 ,After offset: 3
	    //
	    
	    static void question21() {
	        StringBuilder sb = new StringBuilder("COMP123");
	        sb.append("X!").delete(0, 2).deleteCharAt(sb.length() - 1).reverse();
	        System.out.println("Q21: " + sb);
	    }
//Q21: X321PM
	    
	    static void question22() {
	        java.time.LocalDate leap = java.time.LocalDate.of(2024, 2, 29);
	        java.time.LocalDate next = leap.plusYears(1);
	        System.out.println("Q22: Original: " + leap + ", After +1 year: " + next);
	    }
//Q22: Original: 2024-02-29, After +1 year: 2025, 2, 28
	    
	}













