package reviewChapter4;

public class Booleans {
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean spyOkay = knightIsAwake | prisonerIsAwake | archerIsAwake;
        return spyOkay;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean firstCondition = canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        boolean canFreePrisoner = firstCondition & petDogIsPresent;
        return canFreePrisoner;
    }
    public static void main(String[] args) {
    	System.out.println(canFreePrisoner(true, false, true, false)); //false
    	System.out.println(canSpy(true, false,true));
    }
}
/*
knightAwake	archerAwake	prisonerAwake	DogPresent
false				false				| false	| 				false	❌	Prisoner asleep, no dog
false				false				| true	|				false	✅	Prisoner awake, both guards asleep
false				false				| true	|				true		✅	Same as above
false				true					| false	| 				false	❌	Archer awake, no dog
false				true					false	|   				true		❌	Dog present, but archer is awake
false				true					true		| 				false	❌	Archer is awake
false				true					true						true		❌	Dog present but archer awake
true					false				true						false	❌	Knight awake
true					false				true						true		✅	Dog present, archer asleep
true					true					true						true		❌	Dog present, but archer is awake
true					true					false					true		❌	Same as above
true					false				false					true		✅	Dog present, archer asleep
true					false				false					false	❌	No dog, prisoner asleep
*/
/*
knightAwake	archerAwake	prisonerAwake	DogPresent
false		&		false				 true	|				false	✅	Prisoner awake, both guards asleep
false		&		false				 true	|				true		✅	Same as above
true			&		false				 false|				true		✅	Dog present, archer asleep
true			&		false				 true	|				true		✅	Dog present, archer asleep
 */




