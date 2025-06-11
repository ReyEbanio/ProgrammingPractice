package review;

public class Review4 {
	public static void main(String[] args) {
	question1();  question2();  question3();  question4();  question5();  question6();
     question7();  question8();  question9();  question10(); question11(); question12();
     question13(); question14(); question15(); question16(); question17(); question18();
     question19(); question20(); question21(); question22();
	}

 static void question1() {
     // Q1: Build a readable order number from order type + year + counter
     String type = "INV";
     int year = 2025;
     int counter = 42;
     String orderId = type + "-" + year + "-" + (1000 + counter);
     System.out.println("Q1: " + orderId);
 }

 //Q1: INV-2025-1042
 
 static void question2() {
     // Q2: Store attendance for 2 weeks (days x status)
     String[][] attendance = {
         {"Present", "Absent", "Late", "Present", "Present"},
         {"Present", "Present", "Present", "Late", "Present"}
     };
     System.out.println("Q2: Week 2, Day 3: " + attendance[1][2]);
 }
//Q2: Week 2, Day 3: Present
 
 static void question3() {
     // Q3: Convert scheduled time from Tokyo to New York
     var tokyoZone = java.time.ZoneId.of("Asia/Tokyo");      // UTC+9
     var nyZone = java.time.ZoneId.of("America/New_York");   // UTC-5 or -4 (DST)
     var meeting = java.time.ZonedDateTime.of(2025, 4, 1, 9, 0, 0, 0, tokyoZone);
     var converted = meeting.withZoneSameInstant(nyZone);
     System.out.println("Q3: Tokyo: " + meeting + ", NY: " + converted);
 }
//Q3: Tokyo: 2025-04-01T00:00, NY: 2025-04-01T14:00
 
 static void question4() {
     // Q4: Compare object references vs values for caching IDs
     String cachedId = "DOC123";
     String rawId = new String("DOC123");
     System.out.println("Q4: " + (cachedId == rawId) + ", " + cachedId.equals(rawId));
 }
//Q4: false, true
 
 static void question5() {
     // Q5: Format a log entry with system and user details
     var log = new StringBuilder("SYSTEM:");
     log.append("STARTED").append("::USER=admin");
     log.replace(0, 6, "[LOG]");
     System.out.println("Q5: " + log);
 }
//Q5: [LOG]:STARTED::USER=admin
 
 static void question6() {
     // Q6: Calculate and round the tax on an invoice
     double subtotal = 980.75;
     double taxRate = 0.075;
     double tax = subtotal * taxRate;
     long roundedTax = Math.round(tax);
     System.out.println("Q6: Tax: " + tax + ", Rounded: " + roundedTax);
 }
//Q6: Tax: 73.55625, Rounded: 74.0
 //Long doesn't mean it has a decimal
 static void question7() {
     // Q7: Determine delay between two locations for live class streaming
     var manila = java.time.ZonedDateTime.of(2025, 7, 1, 20, 0, 0, 0, java.time.ZoneId.of("Asia/Manila")); // UTC+8
     var london = manila.withZoneSameInstant(java.time.ZoneId.of("Europe/London")); // UTC+1 (DST)
     long delay = java.time.temporal.ChronoUnit.HOURS.between(london, manila);
     System.out.println("Q7: Delay in hours: " + delay);
 }
//Q7: Delay in hours: 7
 
 static void question8() {
     // Q8: Extract information from a code like HR2024B
     String code = "HR2024B";
     String dept = code.substring(0, 2);
     int year = Integer.parseInt(code.substring(2, 6));
     char section = code.charAt(6);
     System.out.println("Q8: Dept=" + dept + ", Year=" + year + ", Section=" + section);
 }
//Q8: Dept=HR, Year=2024, Section=B
 
 static void question9() {
     // Q9: Compare two record arrays by content and reference
     String[] record1 = {"ID001", "Pending"};
     String[] record2 = {"ID001", "Pending"};
     System.out.println("Q9: Equals? " + java.util.Arrays.equals(record1, record2) + ", Same object? " + (record1 == record2));
 }
//Q9: Equals? true, Same object? false
 
 static void question10() {
     // Q10: Convert floating-point sensor reading to integer level
     double sensorValue = 7.9;
     int level = (int) Math.floor(sensorValue);
     long rounded = Math.round(sensorValue);
     System.out.println("Q10: Floor=" + level + ", Rounded=" + rounded);
 }
//Q10: Floor=7, Rounded=8.0
 //long doesn't mean it has decimal
 
 static void question11() {
     // Q11: Compute deadline 30 days from a request date
     var requestDate = java.time.LocalDate.of(2025, 5, 1);
     var deadline = requestDate.plusDays(30);
     System.out.println("Q11: Request=" + requestDate + ", Deadline=" + deadline);
 }
//Q11: Request=2025-05-01, Deadline=2025-05-31
 
 static void question12() {
     // Q12: Clean up a multi-line comment before saving to logs
     String raw = "\t This is a\n multi-line comment.\n";
     String cleaned = raw.indent(1).strip();
     System.out.println("Q12: " + cleaned.substring(0, 12));
     //strip do not remove \t
 }
 //This is a
 // multi-line comment.
 //
//Q12:[tab][space]This is a
 //		  
 
 static void question13() {
     // Q13: Pass values to method — show immutability vs mutability
     String user = "john";
     var id = new StringBuilder("ID45");
     process(user, id);
     System.out.println("Q13: " + user + ", " + id);
 }
//Q13: john, ID45-X
 
 static void process(String name, StringBuilder id) {
     name = name.toUpperCase();
     id.append("-X");
 }

 static void question14() {
     // Q14: Store current timestamp in UTC for audit logs
     var now = java.time.ZonedDateTime.now(java.time.ZoneId.of("Asia/Singapore"));
     var utc = now.toInstant();
     System.out.println("Q14: UTC log time: " + utc);
 }
//Q14: UTC log time: 2025-06-11T15:33
 
 static void question15() {
     // Q15: Sort and search through a list of project names
     String[] projects = {"Zeta", "Alpha", "Echo", "Delta"};
     java.util.Arrays.sort(projects);
     int index = java.util.Arrays.binarySearch(projects, "Echo");
     System.out.println("Q15: Index of 'Echo': " + index);
 }
//Q15: 2
 
 static void question16() {
     // Q16: Handle escaped input and measure effect
     String escaped = "Line1\\nLine2\\tTabbed";
     String processed = escaped.translateEscapes();
     System.out.println("Q16: Before: " + escaped.length() + ", After: " + processed.length());
 }
 //Line1
 //Line2	Tabbed
//Q16: Before: 20, After: 18
 
 static void question17() {
     // Q17: Safely extract a comment snippet from a report
     StringBuilder report = new StringBuilder("Status=Approved;");
     try {
         System.out.println("Q17: " + report.substring(14, 6));
     } catch (Exception e) {
         System.out.println("Q17: Exception: " + e.getClass().getSimpleName());
     }
 }
//Q17: error
 
 static void question18() {
     // Q18: Normalize user input for course codes
     String input = "  phy101 ";
     String clean = input.strip().toUpperCase().substring(0, 5);
     System.out.println("Q18: " + clean);
 }
//Q18: PHY10
 static void question19() {
     // Q19: Compare two course plan arrays
     String[] planA = {"CS101", "CS102"};
     String[] planB = {"CS101", "CS104"};
     int result = java.util.Arrays.compare(planA, planB);
     System.out.println("Q19: Comparison result: " + result);
 }
//Q19: Comparison result: -2
 
 static void question20() {
     // Q20: Analyze time shift due to DST change
     var before = java.time.ZonedDateTime.of(
         java.time.LocalDate.of(2025, 10, 26),
         java.time.LocalTime.of(1, 30),
         java.time.ZoneId.of("Europe/London") // DST end
     );
     var after = before.plusHours(1);
     System.out.println("Q20: Before offset: " + before.getOffset() + ", After offset: " + after.getOffset());
 }

 //Q20: Before offset: +1, after offset: +2
 
 static void question21() {
     // Q21: Transform a project code using multiple StringBuilder operations
     StringBuilder sb = new StringBuilder("PRJ999");
     sb.append("DONE").delete(0, 2).reverse();
     System.out.println("Q21: " + sb);
 }
//Q21: ENOD999J
 
 static void question22() {
     // Q22: What happens when adding a year to Feb 29 (leap year)?
     var leapDay = java.time.LocalDate.of(2024, 2, 29);
     var nextYear = leapDay.plusYears(1);
     System.out.println("Q22: Leap day +1yr = " + nextYear);
 }
 //Q22: Leap day +1yr= 2025-02-28
}












