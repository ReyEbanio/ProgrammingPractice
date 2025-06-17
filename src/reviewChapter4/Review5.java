package reviewChapter4;

public class Review5 {
	 public static void main(String[] args) {
	        question1();  question2();  question3();  question4();  question5();  question6();
	        question7();  question8();  question9();  question10(); question11(); question12();
	        question13(); question14(); question15(); question16(); question17(); question18();
	        question19(); question20(); question21(); question22();
	    }

	    static void question1() {
	        // Task: Generate a readable booking reference from a code and year
	        String prefix = "BK";
	        int year = 2025;
	        String ref = prefix + "-" + year + "-" + (100 + year % 100);
	        System.out.println("Q1: " + ref);
	    }
//Q1: BK-2025-125
	    static void question2() {
	        // Task: Track weekly temperature readings for 2 weeks
	        int[][] temps = {
	            {30, 32, 33, 31, 29},
	            {28, 27, 30, 29, 31}
	        };
	        System.out.println("Q2: Week 1, Day 4: " + temps[0][3]);
	    }
//Q2: Week 1, Day 4: 31
	    
	    static void question3() {
	        // Task: Show employee clock-in time in Manila and Paris
	        var manila = java.time.ZonedDateTime.of(2025, 10, 1, 9, 0, 0, 0, java.time.ZoneId.of("Asia/Manila")); // UTC+8
	        var paris = manila.withZoneSameInstant(java.time.ZoneId.of("Europe/Paris")); // UTC+2 (DST)
	        System.out.println("Q3: Manila: " + manila + ", Paris: " + paris);
	    }
//Q3: Manila: 2025-10-01T09:00, Paris: 2025-10-01T02:00-
	    
	    static void question4() {
	        // Task: Check if two user IDs are same object vs same content
	        String id1 = "USER001";
	        String id2 = new String("USER001");
	        System.out.println("Q4: ref eq? " + (id1 == id2) + ", value eq? " + id1.equals(id2));
	    }
//Q4: ref eq? false, value eq? equals
	    
	    static void question5() {
	        // Task: Log an event with a system-generated message
	        StringBuilder log = new StringBuilder("EVENT:");
	        log.append("Login").append("::Success");
	        log.replace(0, 5, "[LOG]");
	        System.out.println("Q5: " + log);
	    }
//Q5: [LOG]Login::Success
	    
	    static void question6() {
	        // Task: Compute and round the average of 3 numbers
	        double avg = (88.5 + 92.0 + 77.0) / 3;
	        int rounded = (int) Math.round(avg);
	        System.out.println("Q6: Average: " + avg + ", Rounded: " + rounded);
	    }
//Q6: Average: 85.8333333, Rounded: 86
	    
	    static void question7() {
	        // Task: Compare event timestamps across time zones
	        var sg = java.time.ZonedDateTime.of(2025, 3, 10, 10, 0, 0, 0, java.time.ZoneId.of("Asia/Singapore")); // UTC+8
	        var ny = sg.withZoneSameInstant(java.time.ZoneId.of("America/New_York")); // UTC-5 or -4
	        long diff = java.time.temporal.ChronoUnit.HOURS.between(ny, sg);
	        System.out.println("Q7: SG: " + sg + ", NY: " + ny + ", Hour diff: " + diff);
	    }
	    //Q7: SG: 2025-03-10T10:00, NY: 2025-03-09T19:00, Hour diff: 13

	    static void question8() {
	        // Task: Parse a project code to extract year and stage
	        String code = "PRJ2024-A";
	        String year = code.substring(3, 7);
	        char stage = code.charAt(8);
	        System.out.println("Q8: Year=" + year + ", Stage=" + stage);
	    }
//Q8: Year=2024, Stage=A
	    
	    static void question9() {
	        // Task: Validate if two task lists are equivalent
	        String[] teamA = {"Dev", "Test", "Deploy"};
	        String[] teamB = {"Dev", "Test", "Deploy"};
	        System.out.println("Q9: Same object? " + (teamA == teamB) + ", Same content? " + java.util.Arrays.equals(teamA, teamB));
	    }
//Q9: Same Object? false, Same content? true
	    
	    static void question10() {
	        // Task: Convert float budget into an integer and round up
	        float budget = 1234.56f;
	        long rounded = Math.round(budget);
	        int floored = (int) Math.floor(budget);
	        System.out.println("Q10: Rounded=" + rounded + ", Floored=" + floored);
	    }
//Q10: Rounded=1235.0, Floored=1234
	    
	    static void question11() {
	        // Task: Set contract expiration 90 days from now
	        var today = java.time.LocalDate.of(2025, 4, 1);
	        var expiration = today.plusDays(90);
	        System.out.println("Q11: Expiration: " + expiration);
	    }
//Q11: Expiration: 2025-07-1
	    
	    static void question12() {
	        // Task: Prepare a user message with indentation, then clean it
	        String message = "   Hello,\n  Welcome to the team.";
	        String cleaned = message.indent(1).strip();
	        System.out.println("Q12: " + cleaned.substring(0, 10));
	    }
	    //Hello
	    //  Welcome to the team.
//Q12: Hello
//	    	We
	    static void question13() {
	        // Task: Show immutability vs mutability in a user update
	        String name = "Sam";
	        StringBuilder userId = new StringBuilder("ID7");
	        updateUser(name, userId);
	        System.out.println("Q13: name=" + name + ", id=" + userId);
	    }
//Q13: name=Same, id=ID7-UPDATED
	    
	    static void updateUser(String name, StringBuilder id) {
	        name = "Admin";
	        id.append("-UPDATED");
	    }

	    static void question14() {
	        // Task: Store creation time as UTC instant
	        var local = java.time.LocalDateTime.of(2025, 7, 7, 12, 0);
	        var zdt = java.time.ZonedDateTime.of(local, java.time.ZoneId.of("Asia/Manila"));
	        var utc = zdt.toInstant();
	        System.out.println("Q14: UTC time: " + utc);
	    }
//Q14: UTC time: 2025-07-07T12:00
	    
	    static void question15() {
	        // Task: Sort and find a department code
	        String[] departments = {"HR", "Finance", "IT", "Marketing"};
	        java.util.Arrays.sort(departments);
	        int idx = java.util.Arrays.binarySearch(departments, "IT");
	        System.out.println("Q15: Index of 'IT': " + idx);
	    }
	    //Finance, HR, IT, Marketing
	    
//Q15: Index of 'IT': 3
	    static void question16() {
	        // Task: Measure string length before/after escaping
	        String raw = "Tab\\tNewLine\\nEnd";
	        String fixed = raw.translateEscapes();
	        System.out.println("Q16: raw=" + raw.length() + ", fixed=" + fixed.length());
	    }
	    //Tab		NewLine
	    //End
//Q16: raw=17, fixed = 15
	    
	    static void question17() {
	        // Task: Extract a snippet from a report safely
	        StringBuilder report = new StringBuilder("Status=Complete;");
	        try {
	            String part = report.substring(14, 7);
	            System.out.println("Q17: " + part);
	        } catch (Exception e) {
	            System.out.println("Q17: Exception: " + e.getClass().getSimpleName());
	        }
	    }
//Q17: Exception: error
	    
	    static void question18() {
	        // Task: Clean and shorten product code input
	        String raw = "  apple13 ";
	        String result = raw.strip().toUpperCase().substring(0, 5);
	        System.out.println("Q18: " + result);
	    }
	    //
//Q18: APPLE
	    
	    static void question19() {
	        // Task: Compare two supply lists for update
	        String[] listA = {"Paper", "Pen"};
	        String[] listB = {"Paper", "Pencil"};
	        int compare = java.util.Arrays.compare(listA, listB);
	        System.out.println("Q19: Compare result: " + compare);
	    }
//Q19: Compare result: -4
	    
	    static void question20() {
	        // Task: Show DST offset before and after change
	        var before = java.time.ZonedDateTime.of(2025, 10, 26, 1, 0, 0, 0, java.time.ZoneId.of("Europe/London"));
	        var after = before.plusHours(2);
	        System.out.println("Q20: Before=" + before.getOffset() + ", After=" + after.getOffset());
	    }
//Q20: Before=
	    
	    static void question21() {
	        // Task: Format and reverse an asset code
	        StringBuilder sb = new StringBuilder("ASSET99");
	        sb.append("#").delete(0, 2).reverse();
	        System.out.println("Q21: " + sb);
	    }
//Q21: #99TES
	    static void question22() {
	        // Task: Add 1 year to leap day and observe the result
	        java.time.LocalDate leap = java.time.LocalDate.of(2024, 2, 29);
	        java.time.LocalDate result = leap.plusYears(1);
	        System.out.println("Q22: Leap +1 year: " + result);
	    }
	    //Q22: Leap +1 year: 2025-02-28
	}




































