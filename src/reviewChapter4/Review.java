package reviewChapter4;

public class Review {
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
     int id = 2025;
     String label = "CS";
     String studentId = label + "-" + id + "-" + (id % 100 + 1);
     System.out.println("Q1: " + studentId);
 }
//Q1: CS-2025-26
 static void question2() {
     int[][] matrix = new int[2][];
     matrix[0] = new int[]{1, 2};
     matrix[1] = new int[3];
     for (int[] row : matrix) {
         for (int col : row) {
             System.out.print(col + " ");
         }
         System.out.print("| ");
     }
     System.out.println();
 }
// 1, 2 | 3 | ------------------
 
 static void question3() {
     var localDate = java.time.LocalDate.of(2022, 3, 13);
     var localTime = java.time.LocalTime.of(2, 15);
     var zone = java.time.ZoneId.of("America/New_York");
     var zdt = java.time.ZonedDateTime.of(localDate, localTime, zone);
     System.out.println("Q3: " + zdt);
 }
//Q3: 2022-03-13T03:15-5:00[America/New_York]--------
 
 static void question4() {
     String a = "HelloWorld";
     String b = new String("HelloWorld");
     String c = b.intern();
     boolean match1 = (a == b);
     boolean match2 = (a == c);
     System.out.println("Q4: " + match1 + " " + match2);
 }
//Q4: false true
 
 static void question5() {
     StringBuilder schedule = new StringBuilder("CS101");
     schedule.append(" - ").append("8:00AM");
     schedule.insert(0, "[Section A] ");
     schedule.replace(10, 15, "9:00AM");
     System.out.println("Q5: " + schedule);
 }
//Q5: [Section A9:00AM01-8:00AM
 
 static void question6() {
     double a = Math.pow(2, 3);//8.0
     int b = Math.round(4.7f); //5
     float c = (float) Math.random(); //1.0
     double[] result = {a, b, c};
     for (double d : result) System.out.print(d + " ");
     System.out.println();
 }
 //Always check value of container
//8.0 5 1.0
 
 static void question7() {
     var date1 = java.time.ZonedDateTime.of(2022, 11, 6, 1, 30, 0, 0, java.time.ZoneId.of("America/New_York"));
     var date2 = date1.plusHours(1);
     System.out.println("Q7: " + date2 + ", Offset Equal: "
     		+ "" + date1.getOffset().equals(date2.getOffset()));
 }
//Q7: 2022-11-06T01:30-5:00[America/New_York], Offset Equal: 
 static void question8() {
     String code = "MATH2023";
     if (code.length() > 4) {
         char dept = code.charAt(0);
         String number = code.substring(4);
         System.out.println("Q8: Dept = " + dept + ", Year = " + number);
     }
 }
//Q8: Dept = M, Year = 2023
 
 static void question9() {
     String[] a1 = {"Ann", "Bob"};
     String[] a2 = {"Ann", "Bob"};
     System.out.println("Q9: ref eq? " + (a1 == a2) + ""
     		+ ", content eq? " + java.util.Arrays.equals(a1, a2));
 }
//Q9: ref eq? false, content eq? true
 
 static void question10() {
     float a = (float) Math.random() * 100;
     double b = Math.floor(a);
     long c = Math.round(b);
     System.out.println("Q10: " + a + " " + b + " " + c);
 }
 //float no limit on decimal
//Q10: 73.0 73.0 73.0
 
 static void question11() {
     var start = java.time.LocalDate.of(2023, 6, 10);
     var deadline = start.plusDays(15);
     System.out.println("Q11: Deadline: " + deadline);
 }
//Q11: Deadline: 2023, 6, 25
 
 static void question12() {
     String raw = "   \tAlice\nBob\t ";
     String clean = raw.indent(1).strip();
     System.out.println("Q12: " + clean.substring(1, 5));
 }
//substring always 0-1
//Q12: Alice
 static void question13() {
     String name = "Leo";
     var id = new StringBuilder("2023");
     update(name, id);
     System.out.println("Q13: " + name + " " + id);
 }
//Q13: Leo 2023-01
 //LEO 2023-01
 static void update(String name, StringBuilder id) {
     name = name.toUpperCase();
     id.append("-01");
 }
 
 static void question14() {
     var local = java.time.LocalDateTime.of(2024, 5, 20, 14, 0);
     var zone = java.time.ZoneId.of("Asia/Manila");
     var zoned = java.time.ZonedDateTime.of(local, zone);
     var instant = zoned.toInstant();
     System.out.println("Q14: " + instant);
 }
 //Q14: 2024-05-20T14:00-08:00[Asia/Manila]
 
 static void question15() {
     String[] names = {"Zane", "Ann", "Mike"};
     java.util.Arrays.sort(names);
     int index = java.util.Arrays.binarySearch(names, "Bob");
     System.out.println("Q15: " + java.util.Arrays.toString(names) + ""
     		+ ", Index: " + index);
 }
//Q15: Ann, Mike, Zane, Index: -2
 
 static void question16() {
     String input = "one\\ntwo\\tthree";
/*
 *one
 *two	three
 */
     String translated = input.translateEscapes();
     System.out.println("Q16: " + input.length() + ""
     		+ " " + translated.length());
 }
//Q16: 15 13
 
 static void question17() {
     var sb = new StringBuilder("GRADE:A+");
     try {
         String sub = sb.substring(6, 3);
         System.out.println("Q17: " + sub);
     } catch (Exception e) {
         System.out.println("Q17: " + e.getClass().getSimpleName());
     }
 }
//Q17: Error
 
 static void question18() {
     String course = "   java101   ";
     String fixed = course.trim().toUpperCase()
    		 .substring(0, 5).concat("X");
     System.out.println("Q18: " + fixed);
 }
//Q18: JAVA1X
 
 static void question19() {
     String[] one = {"CS", "101"};
     String[] two = {"CS", "201"};
     System.out.println("Q19: "
     		+ "" + java.util.Arrays.compare(one, two));
 }
//Q19: -1
 
 static void question20() {
     var base = java.time.ZonedDateTime.of(
         java.time.LocalDate.of(2022, 3, 13),
         java.time.LocalTime.of(1, 30),
         java.time.ZoneId.of("US/Eastern")
     );
     var advanced = base.plusHours(2);
     System.out.println("Q20: " + advanced.getHour() + ""
     		+ ", offset changed? "
     		+ "" + !base.getOffset().equals(advanced.getOffset()));
 }
//don't count 2-3
 //Q20: 3, offset change? true
 
 static void question21() {
     var sb = new StringBuilder("Java2024");
     sb.append("$X").delete(0, 2).
     deleteCharAt(sb.length() - 1).reverse();
     System.out.println("Q21: " + sb);
 }
//Q21: $4202av
 static void question22() {
     var leap = java.time.LocalDate.of(2024, 2, 29);
     var future = leap.plusYears(1);
     System.out.println("Q22: " + future);
 }
 //Q22: 2025, 02, 28
}















